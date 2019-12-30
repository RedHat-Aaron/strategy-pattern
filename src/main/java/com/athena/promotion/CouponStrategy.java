package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:01 PM 2019/11/28
 */
public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格减去优惠券面值抵扣");
    }
}
