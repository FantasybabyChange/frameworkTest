package com.fantasybaby.ability;

/**
 * @author liuxi
 * @date2018年02月27日 21:13
 */
public interface ISuperHero {
    default String getSuperHeroName(){
        return "superHero";
    }

    void usePower();
}
