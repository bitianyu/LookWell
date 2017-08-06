package cn.bdqn.tangcco.lookwell.roleuser.services.impl;

import cn.bdqn.tangcco.lookwell.entity.RoleUser;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.roleuser.dao.RoleUserMapper;
import cn.bdqn.tangcco.lookwell.roleuser.services.RoleUserServices;
import cn.bdqn.tangcco.lookwell.tbuser.dao.TbuserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by gys on 2017/8/4.
 */
@Service
public class RoleUserServicesImpl implements RoleUserServices {
    @Resource
    RoleUserMapper roleUserMapper;
    @Resource
    TbuserMapper tbuserMapper;

    @Override
    public RoleUser queryUserByUserNameAndPassword(Tbuser tbuser) {

        return roleUserMapper.queryUserByUserNameAndPassword(tbuser);
    }

    public Tbuser getUserId(HttpSession session){
        RoleUser ru = (RoleUser) session.getAttribute("roleUser");
        Tbuser tbuser = new Tbuser();
        tbuser.setUserId(ru.getUserId());
        return tbuser;
    }
}
