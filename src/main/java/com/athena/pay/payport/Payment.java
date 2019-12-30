package com.athena.pay.payport;

import com.athena.pay.MsgResult;

/**
 * @Author: xiaoxiang.zhang
 * @Description:支付方式抽象类
 * @Date: Create in 9:11 PM 2019/11/28
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uId);

    public MsgResult pay(String uId, double amount) {
        //先去查询余额
        if (queryBalance(uId) < amount) {
            return new MsgResult(500, "支付失败", "余额不足，请及时充值！");
        }
        return new MsgResult(200, "支付成功", "金额：" + amount + "元");
    }
}
