package com.joryun.boot.scaffold.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mvc configuration
 *
 * @author joryun
 * @date 2018-11-27
 */
public class MvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
