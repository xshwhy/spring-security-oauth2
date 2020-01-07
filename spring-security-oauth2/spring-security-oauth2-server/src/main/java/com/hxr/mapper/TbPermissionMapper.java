package com.hxr.mapper;

import com.hxr.entity.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @ClassName: TbPermissionMapper
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 9:55
 * @Version: 1.0
 **/
public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId); // 将userId传入sql语句中，需要注解@Param
}
