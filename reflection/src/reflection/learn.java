package reflection;

/**
 * @author 17694
 * @date 2020/11/22
 **/

import hero.Hero;

/**
 * @ClassName : learn 
 * @Description : 反射机制的学习  
 */
/*
获取类对象的3种方式
        1. Class.forName
        2. Hero.class
        3. new Hero().getClass()
*/

// 获取clsss对象会导致类属性被初始化
public class learn {
    public static void main(String[] args) {
        String className = "hero.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2= Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
