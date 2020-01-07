package com.hxr.service;

import com.hxr.entity.TbPermission;

import java.util.List;

/**
 * @ClassName: TbPermissionService
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 9:56
 * @Version: 1.0
 **/
public interface TbPermissionService {

    List<TbPermission> selectByUserId(Long userId);
}
