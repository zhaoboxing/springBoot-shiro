package dao;

import com.unistrong.springbootshirodemo.SpringbootShiroDemoApplication;
import com.unistrong.springbootshirodemo.dao.UserMapper;
import com.unistrong.springbootshirodemo.dao.UserRoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootShiroDemoApplication.class)
public class UserMapperTest {
    @Autowired
    private UserMapper  userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Test
    public void  selectRoleIds(){
        List<Integer> ids = userRoleMapper.selectRoleIdsByUserId(1);
        for (Integer id:ids
             ) {
            System.out.println("角色ID："+id);
            
        }
    }
}
