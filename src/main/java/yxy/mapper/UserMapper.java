package yxy.mapper;

import yxy.model.SysRole;
import yxy.model.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    List<SysRole> selectRolesByUserId(Long userId);
    int insert(SysUser sysUser);
    int insert2(SysUser sysUser);
}
