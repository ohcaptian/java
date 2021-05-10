package shiro.pojo;/**
 * @author 17694
 * @date 2021/01/05
 **/

import lombok.AllArgsConstructor;
import lombok.Data;

import shiro.bean.Permissions;
import java.util.Set;

/**
 * @ClassName : Role 
 * @Description :   
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
}
