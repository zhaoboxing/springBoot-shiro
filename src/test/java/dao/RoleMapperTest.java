package dao;

import com.unistrong.springbootshirodemo.SpringbootShiroDemoApplication;
import com.unistrong.springbootshirodemo.bean.Role;
import com.unistrong.springbootshirodemo.dao.RoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootShiroDemoApplication.class)
public class RoleMapperTest {
    @Autowired
    private RoleMapper roleMapper;
    @Test
    public void selectRoleByIdList(){
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<String> roleNames = roleMapper.slectByPrimaryKeyList(ids);
        for (String roleName: roleNames
             ) {
            System.out.println("角色名称："+roleName);
        }
    }
}
