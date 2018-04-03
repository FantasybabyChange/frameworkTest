package com.fantasybaby.aop;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.IAbilityInfo;
import com.fantasybaby.ability.impl.SpeedForceInfoImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年04月03日 13:02
 */
@Aspect
@Component
public class AbilityInfo {
    @DeclareParents(value = "com.fantasybaby.ability.IAbility+",defaultImpl = SpeedForceInfoImpl.class)
    public static IAbilityInfo abilityInfo;


}
