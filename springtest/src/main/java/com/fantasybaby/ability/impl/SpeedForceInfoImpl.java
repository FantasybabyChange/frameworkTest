package com.fantasybaby.ability.impl;

import com.fantasybaby.ability.IAbilityInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年04月03日 13:41
 */
@Component
@Slf4j
public class SpeedForceInfoImpl implements IAbilityInfo {
    @Override
    public void tellAbilityInfo() {
        log.info("speedForce is a great power will use to throw time and space");
    }
}
