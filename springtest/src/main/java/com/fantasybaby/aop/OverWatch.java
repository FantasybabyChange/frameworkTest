package com.fantasybaby.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**Over watch 用来监控super hero使用
 * @author liuxi
 * @date2018年03月28日 11:16
 */
@Aspect
public class OverWatch {
    /**
     * 前置通知
     */
    @Before("execution(* com.fantasybaby.ability.ISuperHero.usePower(..))")
    public void monitorSuperPower(){
        System.out.println("monitorSuperPower");
    }
}
