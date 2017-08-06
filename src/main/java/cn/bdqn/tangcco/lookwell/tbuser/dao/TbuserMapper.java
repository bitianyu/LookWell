package cn.bdqn.tangcco.lookwell.tbuser.dao;

import cn.bdqn.tangcco.lookwell.commen.baseMapper;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gys on 2017/8/4.
 */
public interface TbuserMapper extends baseMapper<Tbuser> {
    Integer queryCount(@Param("username") String username);
    List<Tbuser> queryUserByUsername(@Param("username") String username);
    List<Tbuser> queryAll();
}
