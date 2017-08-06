package cn.bdqn.tangcco.lookwell.tbuser.services.impl;

import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.tbuser.dao.TbuserMapper;
import cn.bdqn.tangcco.lookwell.tbuser.services.TbuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by gys on 2017/8/4.
 */
@Service
public class TbuserServiceImpl implements TbuserService {
    @Resource
    TbuserMapper tbuserMapper;

    @Override
    public boolean checkTbuser(String username) {
        Integer l = tbuserMapper.queryCount(username);
        return l!=0;
    }

    @Override
    public void addTbuser(Tbuser tbuser) {
        Date now = new Date();
        tbuser.setCreateTime(now);
        tbuser.setUpdateTime(now);
        tbuser.setLastLogin(now);
        tbuserMapper.save(tbuser);
    }

    @Override
    public void deleteTbuserById(Integer id) {
        tbuserMapper.deleteById(id);
    }

    @Override
    public void updateTbuser(Tbuser tbuser) {
        tbuserMapper.update(tbuser);
    }

    @Override
    public Tbuser queryById(Integer id) {
        return tbuserMapper.getById(id);
    }

    @Override
    public List<Tbuser> queryUserByUsername(String username) {
        return tbuserMapper.queryUserByUsername(username);
    }

    @Override
    public List<Tbuser> queryAll() {
        return tbuserMapper.queryAll();
    }
}
