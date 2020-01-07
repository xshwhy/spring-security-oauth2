package com.hxr.service.impl;

import com.hxr.entity.TbUser;
import com.hxr.mapper.TbUserMapper;
import com.hxr.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @ClassName: TbUserServiceImpl
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 17:22
 * @Version: 1.0
 **/

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;


    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);

    }
}
