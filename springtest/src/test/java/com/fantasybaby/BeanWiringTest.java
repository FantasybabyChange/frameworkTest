package com.fantasybaby;

import javax.annotation.Resource;
import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.ability.impl.FlashMan;
import com.fantasybaby.ability.impl.SpeedForceImpl;
import com.fantasybaby.config.SpringTestConfig;
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

public class BeanWiringTest {
    @Inject
    private IAbility ability;
    //@Inject
    private ISuperHero superHero;
    @Inject
    private ISuperHero flashKid;

    /**
     * 使用两个实例
     */
    @Test
    public void testScanBean(){
        superHero.usePower();
    }

    /**
     * 通过条件创建实例
     */
    @Test
    public void testConditionBean(){
        flashKid.usePower();
    }
}
