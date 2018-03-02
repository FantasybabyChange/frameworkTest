package com.fantasybaby.ability.impl;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年02月27日 21:15
 */
@Component
@NoArgsConstructor
public class FlashMan implements ISuperHero {
    //@Inject
    private IAbility ability;

    public FlashMan(IAbility ability){
        this.ability = ability;
    }


    @Override
    public String getSuperHeroName() {
        return FlashMan.class.getSimpleName();
    }

    @Override
    public void usePower() {
        System.out.println("flash use power start");
        ability.showPower();
        System.out.println("flash use power end");
    }
}
