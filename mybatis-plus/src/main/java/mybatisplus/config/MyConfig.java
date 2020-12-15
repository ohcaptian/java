package mybatisplus.config;/**
 * @author 17694
 * @date 2020/12/15
 **/

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MyConfig
 * @Description : 配置分页
 */
@Configuration
public class MyConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
