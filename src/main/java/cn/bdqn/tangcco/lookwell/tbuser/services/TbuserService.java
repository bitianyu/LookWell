package cn.bdqn.tangcco.lookwell.tbuser.services;

import cn.bdqn.tangcco.lookwell.entity.Tbuser;

import java.util.List;

/**
 * Created by gys on 2017/8/4.
 */
public interface TbuserService {
    boolean checkTbuser(String username);
    void addTbuser(Tbuser tbuser);
    void deleteTbuserById(Integer id);
    void updateTbuser(Tbuser tbuser);
    Tbuser queryById(Integer id);
    List<Tbuser> queryUserByUsername(String username);
    List<Tbuser> queryAll();

}
