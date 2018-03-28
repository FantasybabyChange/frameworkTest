package com.fantasybaby.aop;

import com.fantasybaby.bean.Weapon;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**Over watch 用来监控super hero使用
 * @author liuxi
 * @date2018年03月28日 11:16
 */
@Aspect
@Slf4j
@Component
public class OverWatch {
    /**
     * 前置通知
     */
    @Pointcut("execution(* com.fantasybaby.ability.ISuperHero.usePower(..))")
    public void monitorSuperPower(){
    }
    @Before("monitorSuperPower()")
    public void beforeMonitorSuperPower(){
        log.info("==============before monitorSuperPower===========");
    }
    @After("monitorSuperPower()")
    public void afterMonitorSuperPower(){
        log.info("==============after monitorSuperPower===========");
    }
    @AfterReturning("monitorSuperPower()")
    public void afterReturnMonitorSuperPower(){
        log.info("==============after return monitorSuperPower===========");
    }
    @Around("execution(* com.fantasybaby.ability.ISuperHero.useWeapon(..))")
    public void aroundMonitorSuperPower(ProceedingJoinPoint joinPoint){
        log.info("==============start around monitorSuperPower===========");
        try {
            Weapon weapon = new Weapon();
            weapon.setWeaponName("拦截武器");
            joinPoint.proceed(new Object[]{weapon});
            //joinPoint.proceed();
            log.info("==============end around monitorSuperPower===========");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
