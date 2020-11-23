package thread;/**
 * @author 17694
 * @date 2020/11/23
 **/

import pojo.Hero;

/**
 * @ClassName : Batter 
 * @Description : 通过Runnable接口方式实现多线程  
 */
public class Battle implements Runnable{
    private Hero h1;
    private Hero h2;

    public Battle(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }
    @Override
    public void run() {
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
