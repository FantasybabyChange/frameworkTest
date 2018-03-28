package com.fantasybaby.ability;

import com.fantasybaby.bean.Weapon;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

/**
 * @author liuxi
 * @date2018年02月27日 21:13
 */

public interface ISuperHero {
    default String getSuperHeroName(){
        return "superHero";
    }

    void usePower();

    void useWeapon(Weapon weapon);
}
