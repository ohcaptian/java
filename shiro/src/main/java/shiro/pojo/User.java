package shiro.pojo;/**
 * @author 17694
 * @date 2021/01/05
 **/

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @ClassName : User 
 * @Description :   
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}
