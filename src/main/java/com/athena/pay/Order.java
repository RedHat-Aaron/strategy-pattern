package com.athena.pay;

import com.athena.pay.payport.PayStrategyFactory;
import com.athena.pay.payport.Payment;

/**
 * @Author: xiaoxiang.zhang
 * @Description:订单对象
 * @Date: Create in 8:55 PM 2019/11/28
 */
public class Order {

    private String uId;

    private String orderId;

    private double amount;

    public Order(String uId, String orderId, double amount) {
        this.uId = uId;
        this.orderId = orderId;
        this.amount = amount;
    }

    /*
     * @Author xiangxz
     * @Description 用户通过不同的支付方式，返回不同的信息
     * @Date 9:08 PM 2019/11/28
     **/

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategyFactory.getInstance(payKey);
        System.out.println("欢迎使用:" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "开始扣款...");
        return payment.pay(uId, amount);
    }
}
