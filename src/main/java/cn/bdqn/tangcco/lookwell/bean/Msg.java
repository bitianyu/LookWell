package cn.bdqn.tangcco.lookwell.bean;

import java.util.Map;

/**
 * Created by gys on 2017/6/13.
 */
public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> extend;

    public static Msg success(Map<String,Object> extend){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功");
        result.setExtend(extend);
        return result;
    }



    public static Msg fail(Map<String,Object> extend){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理失败");
        result.setExtend(extend);
        return result;
    }


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

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", extend=" + extend +
                '}';
    }
}
