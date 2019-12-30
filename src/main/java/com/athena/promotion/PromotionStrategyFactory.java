package com.athena.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 8:36 PM 2019/11/28
 */
public class PromotionStrategyFactory {
    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getInstance(String promotionKey) {
        return PROMOTION_STRATEGY_MAP.get(promotionKey) == null ? new EmptyStrategy() : PROMOTION_STRATEGY_MAP.get(promotionKey);
    }

    private interface PromotionKey {
        String CASHBACK = "CASHBACK";
        String COUPON = "COUPON";
        String GROUPBUY = "GROUPBUY";
    }
}
