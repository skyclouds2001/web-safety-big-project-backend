package org.fly.sky.config;

import org.fly.sky.interceptor.GlobalInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    GlobalInterceptor globalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(globalInterceptor)
                .addPathPatterns(
                        "/**"
                )
                .excludePathPatterns(
                        "/admin/login",
                        "/admin/reset"
                )
                .excludePathPatterns(
                        "/swagger-ui.html",
                        "/swagger-ui/**",
                        "/swagger-resources/**",
                        "/v2/api-docs",
                        "/v3/api-docs",
                        "/v3/api-docs/swagger-config",
                        "/webjars/**",
                        "/doc.html"
                );
    }

}
