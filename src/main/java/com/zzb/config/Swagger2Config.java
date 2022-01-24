package com.zzb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author XBird
 * @date 2022/1/24
 **/
@Configuration
public class Swagger2Config {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }


    public ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("郑炳元", "", "1551907870@qq.com");
        return new ApiInfo("spring-gateway-demo的Swagger文档", "测试nacos+gateway", "v1.0", "https://juejin.cn/",
                contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
    }
}
