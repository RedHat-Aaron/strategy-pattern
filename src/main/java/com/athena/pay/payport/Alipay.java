package com.athena.pay.payport;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 9:21 PM 2019/11/28
 */
public class Alipay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uId) {
        return 500;
    }
}
