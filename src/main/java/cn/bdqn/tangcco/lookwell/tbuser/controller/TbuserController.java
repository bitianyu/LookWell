package cn.bdqn.tangcco.lookwell.tbuser.controller;

import cn.bdqn.tangcco.lookwell.bean.Msg;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.tbuser.services.TbuserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gys on 2017/8/4.
 */
@Controller
@RequestMapping(value = "tbuser")
public class TbuserController {
    @Resource
    TbuserService tbuserService;


    @ResponseBody
    @RequestMapping(value = "checkTbuser",method = RequestMethod.GET)
    public Msg checkTbuser(String username){
        boolean flag = tbuserService.checkTbuser(username);
        if(flag){
            return Msg.success(null);
        }else {
            return Msg.fail(null);
        }
    }

    //查询所有
    @RequestMapping(value = "queryTbuser")
    public String queryAll(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        PageHelper.startPage(pn,5);
        List<Tbuser> tlist = tbuserService.queryAll();
        PageInfo pageInfo = new PageInfo(tlist,6);
        model.addAttribute("tlist",pageInfo);

        return "tbuser/tbuserList";
    }


//    新增用户
    @ResponseBody
    @RequestMapping( value = "addTbuser",method = RequestMethod.POST)
    public Msg doAdd(@Valid Tbuser tbuser, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object> info = new HashMap<>();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError errors:fieldErrors){
                info.put(errors.getField(),errors.getDefaultMessage());
            }
            return  Msg.fail(info);
        }else {
            tbuserService.addTbuser(tbuser);
            return Msg.success(null);
        }
    }


}
