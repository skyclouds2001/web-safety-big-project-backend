package org.fly.sky.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("售票管理系统接口文档")
                        .version("0.0")
                        .contact(new Contact()
                                .name("CSY")
                                .email("skyclouds2001@163.com")
                                .url("https://skyclouds2001.github.io/"))
                        .description("仓库：https://github.com/skyclouds2001/web-safety-big-project-backend")
                        .license(new License()
                                .name("MIT")
                                .url("https://mit-license.org/")));
    }

}
