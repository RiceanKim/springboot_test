package com.ricean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2   //启动swagger2
public class SwaggerConfig {
    @Order
    @Bean
    public Docket BuzxApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("geohash").apiInfo(apiInfo()).select()
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("卜志雄测试").description("geohash测试").
                termsOfServiceUrl("http://www.szlanyou.com").contact("111").version("2.0").build();
    }
}
