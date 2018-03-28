package com.fantasybaby.ability.impl;

import com.fantasybaby.ability.IAbility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年02月26日 16:28
 */
@Component("speed")
@Slf4j
public class SpeedForceImpl implements IAbility{
    @Override
    public String getPowerName() {
        System.out.println(SpeedForceImpl.class.getSimpleName());
        return SpeedForceImpl.class.getName();
    }

    @Override
    public void showPower() {
        log.info("speedForce,through the time and space.");
    }
}
