package com.weight.system.data;

import org.apache.commons.lang3.math.NumberUtils;
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
            if (weightData.contains("\r\n")){
                System.out.println(" invalid data2:  "  + weightData);
                return;
            }
            weightData = weightData.replace(" ", "");
            weightData = weightData.replace(",", "");
            weightData = weightData.replace("STNT", "").trim();
            weightData = weightData.replace("+", "").trim();
            weightData = weightData.replace("kg", "").trim();
            weightData = weightData.replace("g", "").trim();
            weightData = weightData.replace("\"", "").trim();
            if(NumberUtils.isDigits(weightData)){
                this.weightData = Double.parseDouble(weightData);
            }
            else{
                System.out.println(" invalid data:  "  + weightData);
            }
        }
    }

    public static void main(String[] args) {
        String xx = "ST,NT,+     40 g\n";
        new DataStoreService().setWeightData(xx);
    }
}
