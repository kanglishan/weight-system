package com.weight.system.data;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author kk
 * @since 2018/12/24
 */
@Service
public class DataStoreService {

    private double weightData = 0.0d;

    public synchronized double getWeightData() {
        return weightData;
    }

    public synchronized void setWeightData(String weightData) {
        if (StringUtils.isEmpty(weightData)) {
            return;
        }
        if (weightData.startsWith("ST,NT")) {
            weightData = weightData.replace(" ", "");
            weightData = weightData.replace(",", "");
            weightData = weightData.replace("STNT", "").trim();
            weightData = weightData.replace("+", "").trim();
            weightData = weightData.replace("kg", "").trim();
            weightData = weightData.replace("g", "").trim();
            try {
                this.weightData = Double.parseDouble(weightData);
            } catch (Exception e) {
                System.err.println("不合法的数据：  " + weightData);
                e.printStackTrace();
            }
        }
    }

}
