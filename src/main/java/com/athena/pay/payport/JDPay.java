package com.athena.pay.payport;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 9:23 PM 2019/11/28
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uId) {
        return 300;
    }
}
