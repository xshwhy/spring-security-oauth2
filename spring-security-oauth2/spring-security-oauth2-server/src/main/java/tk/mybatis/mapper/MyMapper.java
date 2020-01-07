package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName: MyMapper
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 16:40
 * @Version: 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper {
}
