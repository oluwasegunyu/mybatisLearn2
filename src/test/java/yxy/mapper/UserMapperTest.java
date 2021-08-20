package yxy.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import yxy.model.SysRole;
import yxy.model.SysUser;

import java.util.Date;
import java.util.List;

public class UserMapperTest extends BaseMapperTest{
    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(1l);
            Assert.assertNotNull(user);
            Assert.assertEquals("admin", user.getUserName());
        }finally {
            sqlSession.close();
        }
    }


    @Test
    public void testSelectRolesByUserId(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysRole> roleList = userMapper.selectRolesByUserId(1l);
            Assert.assertNotNull(roleList);
        }finally {
            sqlSession.close();
        }
    }



    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size()>0);
        }finally {
            sqlSession.close();
        }
    }


    @Test
    public void testInsert(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            SysUser user = new SysUser();
            user.setUserName("test1");
            user.setUserPassword("1234321");
            user.setUserEmail("test@test.com");
            user.setUserInfo("test info");
            user.setHeadImg(new byte[]{1,2,3,4});
            user.setCreateTime(new Date());
            int result = userMapper.insert(user);
            Assert.assertEquals(1, result);
            Assert.assertNull(user.getId());
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testInsert2(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            SysUser user = new SysUser();
            user.setUserName("test1");
            user.setUserPassword("1234321");
            user.setUserEmail("test@test.com");
            user.setUserInfo("test info");
            user.setHeadImg(new byte[]{1,2,3,4});
            user.setCreateTime(new Date());
            int result = userMapper.insert2(user);
            Assert.assertEquals(1, result);
            Assert.assertNotNull(user.getId());
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testInsert3(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            SysUser user = new SysUser();
            user.setUserName("test1");
            user.setUserPassword("1234321");
            user.setUserEmail("test@test.com");
            user.setUserInfo("test info");
            user.setHeadImg(new byte[]{1,2,3,4});
            user.setCreateTime(new Date());
            int result = userMapper.insert3(user);
            Assert.assertEquals(1, result);
            Assert.assertNotNull(user.getId());
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }
}
