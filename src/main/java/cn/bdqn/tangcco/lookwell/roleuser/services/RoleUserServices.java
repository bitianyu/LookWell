package cn.bdqn.tangcco.lookwell.roleuser.services;

import cn.bdqn.tangcco.lookwell.entity.RoleUser;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;

/**
 * Created by gys on 2017/8/4.
 */
public interface RoleUserServices {
    RoleUser queryUserByUserNameAndPassword(Tbuser tbuser);
}
