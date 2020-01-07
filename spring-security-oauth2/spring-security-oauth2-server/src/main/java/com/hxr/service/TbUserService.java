package com.hxr.service;

import com.hxr.entity.TbUser;

/**
 * @ClassName: TbUserService
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 17:21
 * @Version: 1.0
 **/
public interface TbUserService {

   default TbUser getByUsername(String username){
       return null;
   }

}
