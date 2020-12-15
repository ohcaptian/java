package com.ying.factory;

/**
 * @author 17694
 * @date 2020/12/11
 **/
interface KeyBoard {
    void print();
    void  input(String s);
}
class HpKeyBoard implements KeyBoard{

    @Override
    public void print() {
        System.out.println("Hp");
    }
    @Override
    public void input(String s) {

    }
}
class DellKeyBoard implements KeyBoard{

    @Override
    public void print() {
        System.out.println("dell");
    }

    @Override
    public void input(String s) {

    }
}
/**
 * 简单工厂
 */
public class KeyBoardFactory{
    public KeyBoard getInstance(int brand){
            if(brand==1)
                return new HpKeyBoard();
            else if(brand==2)
                return new DellKeyBoard();
            return null;
    }

    public static void main(String[] args) {
        KeyBoardFactory keyboardFactory = new KeyBoardFactory();
        KeyBoard keyBoard = keyboardFactory.getInstance(1);
        keyBoard.print();
    }
}