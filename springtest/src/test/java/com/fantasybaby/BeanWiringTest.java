package com.fantasybaby;

import javax.annotation.Resource;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.config.SpringTestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuxi
 * @date2018年02月26日 17:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestConfig.class)
//@ContextConfiguration(locations = "classpath:spring.xml")

public class BeanWiringTest {
    @Resource
    private IAbility ability;
    @Test
    public void testScanBean(){
        Assert.assertNotNull(ability);
        ability.getPowerName();
        ability.showPower();

    }
}
