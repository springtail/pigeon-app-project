/**
 * Created with IntelliJ IDEA.
 * User: walker
 * Date: 15/8/5
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */

package com.manman.app.response;


import com.manman.app.enums.ClientCode;

public abstract class Response {

    private String errorMsg = "";

    private int result = ClientCode.SYSTEM_WRONG.getCode();

    public Response(){};

    public Response(int result){
        this.result = result;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    public int getResult() {
        return result;
    }


    public void setResult(int result) {
        this.result = result;
    }
}
