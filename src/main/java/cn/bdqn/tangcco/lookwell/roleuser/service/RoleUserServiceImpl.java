package cn.bdqn.tangcco.lookwell.roleuser.service;

import cn.bdqn.tangcco.lookwell.entity.RoleUser;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.roleuser.dao.RoleUserMapper;
import cn.bdqn.tangcco.lookwell.tbuser.dao.TbuserMapper;
import cn.bdqn.tangcco.lookwell.tbuser.service.TbuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by gys on 2017/8/4.
 */
@Service
public class RoleUserServiceImpl implements RoleUserService {
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
