package com.weight.system.data;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        // 实例化串口操作类对象
        SerialPortUtils serialPort = new SerialPortUtils();
        // 创建串口必要参数接收类并赋值，赋值串口号，波特率，校验位，数据位，停止位
        ParamConfig paramConfig = new ParamConfig("COM4", 9600, 0, 8, 1);
        // 初始化设置,打开串口，开始监听读取串口数据
        serialPort.initConifg(paramConfig);

        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 关闭串口
        serialPort.closeSerialPort();
    }
}
