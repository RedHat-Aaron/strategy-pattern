package com.athena.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaoxiang.zhang
 * @Description:支付策略生成工厂
 * @Date: Create in 9:48 PM 2019/11/28
 */
public class PayStrategyFactory {

    public static final String ALIPAY = "ALIPAY";
    public static final String JDPAY = "JDPAY";
    public static final String WECHATPAY = "WECHATPAY";
    public static final String UNIONPAY = "UNIONPAY";

    private static Map<String, Payment> PAYMNET_STRATEGY = new HashMap<>();

    static {
        PAYMNET_STRATEGY.put(ALIPAY, new Alipay());
        PAYMNET_STRATEGY.put(JDPAY, new JDPay());
        PAYMNET_STRATEGY.put(WECHATPAY, new WeChat());
        PAYMNET_STRATEGY.put(UNIONPAY, new UnionPay());
    }

    public static Payment getInstance(String paymentKey) {
        return PAYMNET_STRATEGY.get(paymentKey) == null ? new Alipay() : PAYMNET_STRATEGY.get(paymentKey);
    }

}
