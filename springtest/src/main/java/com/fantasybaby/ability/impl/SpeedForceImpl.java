package com.fantasybaby.ability.impl;

import com.fantasybaby.ability.IAbility;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年02月26日 16:28
 */
@Component()
public class SpeedForceImpl implements IAbility{
    @Override
    public String getPowerName() {
        System.out.println(SpeedForceImpl.class.getSimpleName());
        return SpeedForceImpl.class.getName();
    }

    @Override
    public void showPower() {
        System.out.println("speedForce,through the time and space.");
    }
}
