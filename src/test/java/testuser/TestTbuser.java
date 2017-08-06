package testuser;

import base.TestBase;
import cn.bdqn.tangcco.lookwell.entity.Tbuser;
import cn.bdqn.tangcco.lookwell.tbuser.services.TbuserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by HP on 2017/8/3.
 */
public class TestTbuser extends TestBase{

    @Resource
    TbuserService tbuserService;




    @Test
    public void testAdd(){
        tbuserService.addTbuser(new Tbuser(null,"aaa","123",new Date(),new Date(),new Date()));
    }

    @Test
    public void testDelete(){
        tbuserService.deleteTbuserById(3);
    }
}
