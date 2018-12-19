package dao;

import com.unistrong.springbootshirodemo.SpringbootShiroDemoApplication;
import com.unistrong.springbootshirodemo.bean.RolePermission;
import com.unistrong.springbootshirodemo.dao.PermissionMapper;
import com.unistrong.springbootshirodemo.dao.RolePermissionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootShiroDemoApplication.class)
public class PermissionMapperTest {
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Test
    public  void selectPermissionIdsByRoleIds(){
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Set<Integer> permissionIds = rolePermissionMapper.selectPermissionIdsByRoleIds(ids);
        for (Integer id:permissionIds){
            System.out.println("权限Id："+id);
        }
    }
    @Test
    public void sleectPermissionNameByIds(){
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<String> urls = permissionMapper.selectPermissionNamesByPrimaryKeys(ids);
        for (String url: urls
             ) {
            System.out.println("权限地址Url："+url);
        }
    }
}
