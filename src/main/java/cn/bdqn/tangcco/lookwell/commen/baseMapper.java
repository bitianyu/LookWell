package cn.bdqn.tangcco.lookwell.commen;

import java.io.Serializable;

/**
 * Created by gys on 2017/8/4.
 */
public interface baseMapper<T> {

    //	新增
    public void save(Object obj);
    //	删除
    public void deleteById(Serializable id);
    //	修改
    public void update(Object obj);
    //	查询单个
    public T getById(Serializable id);
}
