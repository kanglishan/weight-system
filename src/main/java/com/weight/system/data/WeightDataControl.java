package com.weight.system.data;

import org.apache.commons.lang3.StringUtils;
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
    public CxpResponse<String> getWeightedData() {
        String ret = dataStoreService.getWeightData() +"";
        if (StringUtils.isEmpty(ret)){
            return new CxpResponse<>(0+"");
        }
        return new CxpResponse<String>(ret);
    }
}
