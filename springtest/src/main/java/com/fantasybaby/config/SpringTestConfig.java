package com.fantasybaby.config;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.ability.impl.FlashMan;
import com.fantasybaby.ability.impl.SpeedForceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuxi
 * @date2018年02月26日 16:33
 */
@Configuration
//@ComponentScan(basePackages = "com.fantasybaby")
//最好使用这种形式
//@ComponentScan(basePackageClasses = IAbility.class)
public class SpringTestConfig {
    @Bean
    public ISuperHero setSuperHero(){
        return new FlashMan();
    }
    @Bean
    public IAbility setAbility(){
        return new SpeedForceImpl();
    }
}
