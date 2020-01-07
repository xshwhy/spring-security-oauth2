package com.hxr.service;

import com.hxr.entity.TbContent;

import java.util.List;

/**
 * @ClassName: TbContentService
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 13:36
 * @Version: 1.0
 **/
public interface TbContentService {

    List<TbContent> selectAll();
}
