package com.fantasybaby.init;

import com.fantasybaby.config.RootConfig;
import com.fantasybaby.config.WebConfig;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author liuxi
 * @date2018年06月12日 16:54
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
