package hero;
/**
 * @author 17694
 * @date 2020/11/22
 **/

/**
 * @ClassName : Hero 
 * @Description : 测试类  
 */
public class Hero {
    public String name;
    static {
        System.out.println("初始化 copyright");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
