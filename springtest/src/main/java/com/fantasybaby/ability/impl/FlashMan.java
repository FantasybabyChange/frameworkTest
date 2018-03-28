package com.fantasybaby.ability.impl;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年02月27日 21:15
 */
@Component
@NoArgsConstructor
@Slf4j
public class FlashMan implements ISuperHero {
    @Inject
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
        log.info("flash use power start");
        ability.showPower();
        log.info("flash use power end");
    }
}
