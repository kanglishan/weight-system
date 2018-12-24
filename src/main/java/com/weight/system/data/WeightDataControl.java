package com.weight.system.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author didi
 * @since 2018/12/22
 */
@RestController
public class WeightDataControl {
    @Resource
    private DataStoreService dataStoreService;

    @RequestMapping("/weight/getWeightedData")
    public String getWeightedData() {
        return dataStoreService.getWeightData() +"";
    }
}
