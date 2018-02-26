package com.fantasybaby.ability;

/**A superhero power interface
 * @author liuxi
 * @date2018年02月26日 16:24
 */
public interface IAbility {
    /**
     * abilityName
     * @return
     */
    default String getPowerName(){
        return "ability";
    }

    /**
     * show your power
     */
    void showPower();
}
