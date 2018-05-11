package com.fantasybaby.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 *通过环绕通知监听执行时间
 @author liuxi
 @date2018年03月31日 11:41
 */
@Aspect
@Component
    @Slf4j
public class AdapterInvokeCount {
    private static final long ONE_MINUTE = 1;

    public static final String POINT = ("execution(* com.fantasybaby.ability.*.*(..))");

    /**
     * 统计方法执行耗时Around环绕通知
     * @param joinPoint
     * @return
     */
    @Around(POINT)
    public Object timeAround(ProceedingJoinPoint joinPoint) {
        Object obj = null;
        Object[] args = joinPoint.getArgs();
        long startTime = System.currentTimeMillis();
        try {
            obj = joinPoint.proceed(args);
        } catch (Throwable e) {
            log.error("统计某方法执行耗时环绕通知出错", e);
        }

        long endTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();

        this.printExecTime(methodName, startTime, endTime);

        return obj;
    }
    /**
     * 打印方法执行耗时的信息，如果超过了一定的时间，才打印
     * @param methodName
     * @param startTime
     * @param endTime
     */
    private void printExecTime(String methodName, long startTime, long endTime) {
        long diffTime = endTime - startTime;
        if (diffTime > ONE_MINUTE) {
            log.warn("-----" + methodName + " 方法执行耗时：" + diffTime + " ms");
        }
    }
}
