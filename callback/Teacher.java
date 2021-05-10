/**
 * @author 17694
 * @date 2021/05/10
 **/

/**
 * @ClassName : Teacher 
 * @Description :   
 */

public class Teacher implements CallBack{


    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }
    public void askQuestion() {
        student.resolveQuestion(this);
    }
    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是" + answer);
    }
}
