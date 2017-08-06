package cn.bdqn.tangcco.lookwell.roleuser.controller;


import cn.bdqn.tangcco.lookwell.bean.Msg;
import cn.bdqn.tangcco.lookwell.entity.RoleUser;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.roleuser.services.RoleUserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thinkpad on 2017/6/25.
 */
@Controller
public class RoleUserController {

    @Resource
    RoleUserServices roleUserService;

    @ResponseBody
    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public Msg login(Tbuser tbuser, HttpSession session){
        RoleUser ru=roleUserService.queryUserByUserNameAndPassword(tbuser);
        if(null!=ru){
            System.out.println("登录成功");
            session.setAttribute("roleUser",ru);
            return Msg.success(null);
        }
        System.out.println("登录失败");
        Map<String,Object> msg1 = new HashMap<>();
        String msg2 = "对不起，用户名或密码错误";
        msg1.put("msg3",msg2);
        return Msg.fail(msg1);
    }

    //跳转main页面
    @RequestMapping(value = "/toMain")
    public  String toMain(){
        return "main/main";
    }
}
