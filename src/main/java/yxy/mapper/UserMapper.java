package yxy.mapper;

import org.apache.ibatis.annotations.Param;
import yxy.model.SysRole;
import yxy.model.SysUser;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    List<SysRole> selectRolesByUserId(Long userId);
    int insert(SysUser sysUser);
    int insert2(SysUser sysUser);
    int insert3(SysUser sysUser);
    int updateById(SysUser sysUser);
    int deleteById(SysUser sysUser);
    List<SysRole> selectRoleByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);
    List<SysUser> selectByUser(SysUser sysUser);
    int updateByIdSelective(SysUser sysUser);
    SysUser selectByIdOrUserName(SysUser sysUser);
    List<SysUser> selectByIdList(List<Long> idList);
    int insertList(List<SysUser> userList);
    int updateByMap(Map<String, Object> map);
    SysUser selectUserAndRoleById(Long id);
    SysUser selectUserAndRoleById2(Long id);
    SysUser selectUserAndRoleById3(Long id);
    SysUser selectUserAndRoleByIdSelect(Long id);
    List<SysUser> selectAllUserAndRoles();
}
