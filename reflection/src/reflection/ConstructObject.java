package reflection;
/**
 * @author 17694
 * @date 2020/11/22
 **/

import hero.Hero;

/**
 * @ClassName : ConstructObject 
 * @Description : 通过反射机制来创建一个对象  
 */
public class ConstructObject {
    public static void main(String[] args) {
        Hero h1 =new Hero();
        h1.name="jjj";
        System.out.println(h1);
        try{
            Class aClass = Class.forName("hero.Hero");
            Hero h2= (Hero) aClass.newInstance();
            h2.name="sss";
            System.out.println(h2);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }



}
