package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:19 PM 2019/11/28
 */
public class CashbackStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("促销返现，返回的金额转到支付宝账号");
    }
}
