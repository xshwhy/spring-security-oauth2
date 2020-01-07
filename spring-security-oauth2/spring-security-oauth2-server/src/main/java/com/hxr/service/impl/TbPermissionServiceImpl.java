package com.hxr.service.impl;

import com.hxr.entity.TbPermission;
import com.hxr.mapper.TbPermissionMapper;
import com.hxr.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: TbPermissionServiceImpl
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 10:01
 * @Version: 1.0
 **/
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
