package com.fantasybaby.config;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.ability.impl.FlashKid;
import com.fantasybaby.ability.impl.FlashMan;
import com.fantasybaby.ability.impl.SpeedForceImpl;
import com.fantasybaby.annotation.FlashKidAnnotation;
import com.fantasybaby.condition.CreateBeanCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author liuxi
 * @date2018年02月26日 16:33
 */
@Configuration
@ComponentScan(basePackages = "com.fantasybaby")
//最好使用这种形式
//@ComponentScan(basePackageClasses = IAbility.class)
//引入其他配置
//@Import()
//@ImportResource

public class SpringTestConfig {
    @Inject
    private Environment environment;
    @Bean(name="flash")
    @Primary
    @Profile("dev")
    public ISuperHero setSuperHero(){
        return new FlashMan();
    }
    /*@Bean
    @Profile("dev")
    public IAbility setAbility(){
        return new SpeedForceImpl();
    }*/
//    @Bean(name="flashKid")

    /*@Bean
    @FlashKidAnnotation
    @Conditional(CreateBeanCondition.class)
    public ISuperHero setFlashKid(){
    //通过environment取值
        //return new FlashKid(environment.getProperty("flashkid.name"),environment.getProperty("flashkid.age",Integer.class));
        //return new FlashKid();
    }*/

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
