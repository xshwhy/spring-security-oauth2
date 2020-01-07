package com.hxr.service.impl;

import com.hxr.entity.TbContent;
import com.hxr.mapper.TbContentMapper;
import com.hxr.service.TbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: TbContentServiceImpl
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 13:36
 * @Version: 1.0
 **/
@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
