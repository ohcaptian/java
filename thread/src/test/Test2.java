package test;
/**
 * @author 17694
 * @date 2020/11/23
 **/

import pojo.Hero;
import thread.KillThread;

/**
 * @ClassName : Test2 
 * @Description : 开启线程的情况  
 */
public class Test2 {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);
        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
    }
}
