package lean;
/**
 * @author 17694
 * @date 2021/03/22
 **/

/**
 * @ClassName : StringLearn 
 * @Description : string类的探索  
 */

public class StringLearn {
    public static void main(String[] args) {
        String a = "aaa"; //字符串常量
        String b = "aaa"; //字符串常量
        String c = new String("aaa");
        String d = new String("aaa");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(c.intern()==a);//true
        System.out.println(c.intern()==b);//true
//        String str = "aaa";
//        AddStr(str);
//        System.out.println("str的值为"+str);

        StringBuilder str = new StringBuilder("aaa");
        AddStr(str);
        System.out.println("str的值为"+str);
    }

    private static void AddStr(StringBuilder str1){
        for(int i=0;i<6;i++){
           str1.append("a");
        }


    }

}
