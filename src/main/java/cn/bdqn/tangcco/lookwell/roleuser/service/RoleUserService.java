package cn.bdqn.tangcco.lookwell.roleuser.service;

import cn.bdqn.tangcco.lookwell.entity.RoleUser;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;

/**
 * Created by gys on 2017/8/4.
 */
public interface RoleUserService {
    RoleUser queryUserByUserNameAndPassword(Tbuser tbuser);
}
