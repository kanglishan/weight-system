package com.weight.system.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author didi
 * @since 2018/12/22
 */
@RestController
public class WeightDataControl {
    @RequestMapping("/weight/getWeightedData")
    public String getWeightedData() {

        return null;
    }
}
