package com.zzb.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XBird
 * @date 2022/1/24
 **/
@Api(tags="测试接口集合")
@RestController
@NacosPropertySource(dataId = "springboot2-nacos-config", autoRefreshed = true)
public class TestController {
    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
    private String testProperties;

    @ApiOperation(value="获取nacos配置",notes = "\n开发者：郑炳元")
    @PostMapping(value = "/getNacosSetting")
    public String getNacosSetting(){
        return testProperties;
    }
}
