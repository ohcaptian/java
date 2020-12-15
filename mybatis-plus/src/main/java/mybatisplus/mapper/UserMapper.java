package mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 17694
 * @date 2020/12/15
 **/

/**
 * 类似jpa
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
