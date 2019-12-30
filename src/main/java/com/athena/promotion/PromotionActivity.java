package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:23 PM 2019/11/28
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute(){
        promotionStrategy.doPromotion();
    }
}
