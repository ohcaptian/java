package lean;

/**
 * @author 17694
 * @date 2021/03/22
 **/
public enum Test {
    low("1"),mid("2");
    private String name;
     Test(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
class Ts{
    public static void main(String[] args) {
        System.out.println(Test.low.getName());
        System.out.println(Test.mid);
    }

}
