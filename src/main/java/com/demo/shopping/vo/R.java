package com.demo.shopping.vo;

import lombok.Data;

/***自定义工具类*/


@Data
public class R {

    /**
     * 返回的状态结果
     *   code = 0 通用性的失败!
     *   code = 1 通用性的成功!
     */
    private int code = 0 ;

    /**
     * 返回的描述信息
     *    描述内容自定义
     *
     *
     *
     *
     *
     */
    private String msg = null;


    /**
     * 返回给前端的数据
     *    注意:返回类型可以是对象,也可能是对象集合!
     *    所以使用了通用类型Object类型!
     */
    private Object data = null;

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {
    }

    public static R OK(String msg,Object data){

        return new R(1, msg, data);
    }

    public static R OK(String msg){

        return OK(msg,null);
    }

    public static R OK(){

        return OK(null);
    }


    public static R FAIL(String msg,Object data){

        return new R(0, msg, data);
    }

    public static R FAIL(String msg){

        return FAIL(msg,null);
    }

    public static R FAIL(){

        return FAIL(null);
    }

//    /**
//     * 自动错误码
//     * @param responseCode
//     * @return
//     */
//    public static R FAIL_MENU(ResponseCode responseCode){
//
//        return FAIL(responseCode.getMsg(), responseCode.getCode());
//    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
