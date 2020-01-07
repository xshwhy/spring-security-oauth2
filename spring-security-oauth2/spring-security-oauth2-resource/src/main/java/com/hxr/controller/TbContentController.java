package com.hxr.controller;

import com.hxr.dto.ResponseResult;
import com.hxr.entity.TbContent;
import com.hxr.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: TbContentController
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 13:38
 * @Version: 1.0
 **/
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list () {
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(),tbContentService.selectAll());
    }

}
