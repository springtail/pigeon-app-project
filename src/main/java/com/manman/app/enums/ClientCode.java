/**
 * Created with IntelliJ IDEA.
 * User: walker
 * Date: 15/8/5
 * Time: 23:0
 * To change this template use File | Settings | File Templates.
 */

package com.manman.app.enums;

public enum ClientCode {
    SUCCESS(1, "成功"),

    INVALID_USER_ID(-2001, "无效的用户"),


    SYSTEM_WRONG(-200, "系统繁忙，请稍后重试"),
    OBJECT_NOT_FOUND(-201,"未找到请求的数据"),
    BAD_REQUEST(-203,"无效的请求"),
    UPLOAD_FILE_ERROR(-204,"文件上传错误"),
    NO_AUTHENTICATE(-205, "未通过身份认证"),
    AUTHENTICATE_ERROR(-207, "用户数据异常"),

    USER_NOT_LOGIN(-1000,"用户未登录"),
    FORBIDDEN(403,"权限不足"),
    ;

    private int code;

    private String msg;

    private ClientCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
