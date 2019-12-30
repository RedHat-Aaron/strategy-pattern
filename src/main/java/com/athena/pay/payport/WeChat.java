package com.athena.pay.payport;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 9:22 PM 2019/11/28
 */
public class WeChat extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uId) {
        return 100;
    }
}
