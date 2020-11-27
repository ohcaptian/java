package test;
/**
 * @author 17694
 * @date 2020/11/24
 **/

import pojo.Hero;

/**
 * @ClassName : Test4 
 * @Description : 使用匿名类方法实现多线程  
 */
public class Test4 {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦", 616, 50);
        Hero teemo = new Hero("提莫", 300, 30);
        Hero bh = new Hero("赏金猎人", 500, 65);
        Hero leesin = new Hero("盲僧", 455, 80);
        //匿名类:可以很方便的访问外部的局部变量。
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!teemo.isDead()) {
                    gareen.attackHero(teemo);
                }

            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (!leesin.isDead()) {
                    bh.attackHero(leesin);
                }

            }
        };
        t2.start();
    }
}
