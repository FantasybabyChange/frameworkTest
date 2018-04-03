package com.fantasybaby.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 @author liuxi
 @date2018年04月03日 16:10
 */
@Slf4j
@Component
public aspect SuperPowerCount {
    /**
     *
     */
    pointcut monitorSuperPower():execution(* com.fantasybaby.ability.ISuperHero.usePower(..));

    before() : monitorSuperPower(){
        log.info("SuperPowerCount before advice");
    }
}
