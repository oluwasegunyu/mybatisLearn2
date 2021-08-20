package yxy.mapper;

import org.apache.ibatis.annotations.Param;
import yxy.model.SysRole;
import yxy.model.SysUser;

import java.util.List;

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
}
