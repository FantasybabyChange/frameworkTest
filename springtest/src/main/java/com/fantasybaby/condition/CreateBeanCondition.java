package com.fantasybaby.condition;

import java.util.Arrays;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**实现condition和@Conditional注解配合使用
 * @author liuxi
 * @date2018年03月08日 17:07
 */
public class CreateBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        //String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        //Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        return true;
    }
}
