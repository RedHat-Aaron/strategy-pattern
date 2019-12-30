package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:00 PM 2019/11/28
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无任何打折优惠！");
    }
}
