package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:21 PM 2019/11/28
 */
public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价！");
    }
}
