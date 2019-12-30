package com.athena.pay;

/**
 * @Author: xiaoxiang.zhang
 * @Description:消息返回对象
 * @Date: Create in 8:59 PM 2019/11/28
 */
public class MsgResult {
    private int code;

    private String msg;

    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态【" + this.code + "】," + msg +
                "，交易状态：" + this.data;
    }
}
