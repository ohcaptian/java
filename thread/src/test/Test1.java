package test;
/**
 * @author 17694
 * @date 2020/11/23
 **/

import pojo.Hero;

/**
 * @ClassName : Learn 
 * @Description : 多线程的学习  
 */
public class Test1 {
    public static void main(String[] args) {
/**
 * 没有设置线程的情况
 */
        Hero gareen = new Hero("盖伦",616,50);
        Hero teemo = new Hero("提莫",300,30);
        Hero bh = new Hero("赏金猎人",500,65);
        Hero leesin = new Hero("盲僧",455,80);
        //盖伦攻击提莫
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
        //赏金猎人攻击盲僧
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }
    }

}
