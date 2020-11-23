package thread;
/**
 * @author 17694
 * @date 2020/11/23
 **/

import pojo.Hero;

/**
 * @ClassName : Killthread 
 * @Description : 继承thread开启线程  
 */
public class KillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
