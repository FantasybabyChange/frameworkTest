package com.fantasybaby.config;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.ability.impl.FlashKid;
import com.fantasybaby.ability.impl.FlashMan;
import com.fantasybaby.ability.impl.SpeedForceImpl;
import com.fantasybaby.condition.CreateBeanCondition;
import org.springframework.context.annotation.*;

/**
 * @author liuxi
 * @date2018年02月26日 16:33
 */
@Configuration
//@ComponentScan(basePackages = "com.fantasybaby")
//最好使用这种形式
//@ComponentScan(basePackageClasses = IAbility.class)
//引入其他配置
//@Import()
//@ImportResource
public class SpringTestConfig {
    @Bean(name="flash")
    @Primary
    @Profile("dev")
    public ISuperHero setSuperHero(){
        return new FlashMan();
    }
    @Bean
    @Profile("dev")
    public IAbility setAbility(){
        return new SpeedForceImpl();
    }
    @Bean(name="flashKid")
    @Conditional(CreateBeanCondition.class)
    public ISuperHero setFlashKid(){
        return new FlashKid();
    }
}
