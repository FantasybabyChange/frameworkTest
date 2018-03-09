package com.fantasybaby.ability.impl;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年03月08日 16:53
 */
@Component("flashKid")
@NoArgsConstructor
public class FlashKid  implements ISuperHero {
    @Inject
    private IAbility speed;
    @Override
    public String getSuperHeroName() {
        return FlashKid.class.getSimpleName();
    }

    @Override
    public void usePower() {
        System.out.println(getSuperHeroName() +"start use Power");
        speed.showPower();
    }
}
