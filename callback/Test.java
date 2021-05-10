/**
 * @author 17694
 * @date 2021/05/10
 **/

/**
 * @ClassName : Test 
 * @Description :   
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Ming();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }
}
