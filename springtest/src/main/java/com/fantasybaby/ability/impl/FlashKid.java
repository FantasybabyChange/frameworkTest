package com.fantasybaby.ability.impl;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.IAbilityInfo;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.annotation.FlashKidAnnotation;
import com.fantasybaby.bean.Weapon;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liuxi
 * @date2018年03月08日 16:53
 */
@Component()
//@NoArgsConstructor
@FlashKidAnnotation
//@PropertySource("classpath:values.properties")
@Slf4j
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class FlashKid  implements ISuperHero {
    @Inject
    private IAbility speed;
    private String name;
    private int age;
    public FlashKid(@Value("${flashkid.name}") String name, @Value("${flashkid.age}")int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String getSuperHeroName() {
        return this.name +"_"+ this.age;
    }

    @Override
    public void usePower() {
        log.info(getSuperHeroName() +"start use Power");
        /**
         * 通过aop添加额外的方法
         */
        IAbilityInfo abilityInfo = (IAbilityInfo)speed;
        abilityInfo.tellAbilityInfo();
        speed.showPower();
    }

    @Override
    public void useWeapon(Weapon weapon) {
        log.info("flashkid use {}",weapon.getWeaponName());
    }
}
