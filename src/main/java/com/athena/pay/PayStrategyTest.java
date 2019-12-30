package com.athena.pay;

import com.athena.pay.MsgResult;
import com.athena.pay.Order;
import com.athena.pay.payport.PayStrategyFactory;

/**
 * @Author: xiaoxiang.zhang
 * @Description:支付策略模式测试
 * @Date: Create in 9:57 PM 2019/11/28
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "1", 334.35);
        MsgResult pay = order.pay(PayStrategyFactory.ALIPAY);
        System.out.println(pay);
    }
}
