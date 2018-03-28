package com.fantasybaby;

import javax.annotation.Resource;
import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.ability.impl.FlashMan;
import com.fantasybaby.ability.impl.SpeedForceImpl;
import com.fantasybaby.annotation.FlashKidAnnotation;
import com.fantasybaby.config.SpringTestConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuxi
 * @date2018年02月26日 17:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestConfig.class)
@ActiveProfiles("dev")
//@ContextConfiguration(locations = "classpath:spring.xml")
@Slf4j
public class BeanWiringTest {
    @Inject
    private IAbility ability;
    //@Inject
    //private ISuperHero superHero;
    /*@Inject
    private ISuperHero superHero;*/
    @FlashKidAnnotation
    @Inject
    private ISuperHero superHero;


    /**
     * 使用两个实例
     */
    @Test
    public void testScanBean(){
        superHero.usePower();
    }

    /**
     * 通过条件创建实例
     * 添加primary注解
     * 解决spring歧义
     */
    @Test
    public void testConditionBean(){
        superHero.usePower();
    }

    /**
     * 通过注解自定义注解加载Bean
     */
    @Test
    public void testBeanByAnnotation(){
            superHero.usePower();
    }

    @Test
    public void testGetValueFromProperties(){
        log.info("======"+superHero.getSuperHeroName());
    }
}
