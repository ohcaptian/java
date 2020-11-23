package test;
/**
 * @author 17694
 * @date 2020/11/23
 **/

import pojo.Hero;
import thread.Battle;

/**
 * @ClassName : Test3 
 * @Description :   实现接口启动线程
 */
public class Test3 {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);
        Battle battle1  =new Battle(gareen,teemo);
       new Thread(battle1).start();
        Battle battle2  =new Battle(bh,leesin);
        new Thread(battle2).start();
    }
}
