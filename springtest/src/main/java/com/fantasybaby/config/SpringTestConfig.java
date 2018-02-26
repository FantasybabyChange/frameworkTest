package com.fantasybaby.config;

import com.fantasybaby.ability.IAbility;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuxi
 * @date2018年02月26日 16:33
 */
@Configuration
//@ComponentScan(basePackages = "com.fantasybaby")
//最好使用这种形式
@ComponentScan(basePackageClasses = IAbility.class)
public class SpringTestConfig {

}
