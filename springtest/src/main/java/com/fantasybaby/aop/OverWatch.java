package com.fantasybaby.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
    @Before("execution(* com.fantasybaby.ability.ISuperHero.usePower(..))")
    public void monitorSuperPower(){
       log.info("==============monitorSuperPower===========");
    }
}
