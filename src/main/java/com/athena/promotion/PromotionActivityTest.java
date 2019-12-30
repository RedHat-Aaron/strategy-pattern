package com.athena.promotion;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:24 PM 2019/11/28
 */
public class PromotionActivityTest {
    /*public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new CouponStrategy());
        promotionActivity618.excute();

        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashbackStrategy());
        promotionActivity1111.excute();
    }*/

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";

        if (StringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        //...
        promotionActivity.excute();
    }*/

    public static void main(String[] args) {
        String promotionKey = "CASHBACK";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getInstance(promotionKey));
        promotionActivity.excute();
    }
}
