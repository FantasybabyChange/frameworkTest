package com.fantasybaby;

import javax.inject.Inject;

import com.fantasybaby.ability.IAbility;
import com.fantasybaby.ability.ISuperHero;
import com.fantasybaby.config.SpringTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuxi
 * @date2018年02月26日 17:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@ActiveProfiles("dev")
public class BeanWiringXMLTest {
    @Inject
    private IAbility ability;
    @Inject
    private ISuperHero superHero;

    /**
     * 使用两个实例
     */
    @Test
    public void testScanBean(){
        superHero.usePower();

    }
}
