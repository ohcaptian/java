package com.ying;
/**
 * @author 17694
 * @date 2020/12/11
 **/

/**
 * @ClassName : Weekday 
 * @Description : 模拟枚举类  
 */
public class Weekday1{
    private Weekday1(){}
    public final static Weekday1 SUN = new Weekday1();
    public final static Weekday1 MON = new Weekday1();
    public final static Weekday1 TUE = new Weekday1();
    public final static Weekday1 WED = new Weekday1();
    public final static Weekday1 THU = new Weekday1();
    public final static Weekday1 FRI = new Weekday1();
    public final static Weekday1 SAT = new Weekday1();

    public static Weekday1  getNextDay(Weekday1 nowDay){
        if(nowDay == SUN) {
            return MON;
        }else if(nowDay == MON) {
            return TUE;
        }else if(nowDay == TUE) {
            return WED;
        }else if(nowDay == WED) {
            return THU;
        }else if(nowDay == THU) {
            return FRI;
        }else if(nowDay == FRI) {
            return SAT;
        }else {
            return SUN;
        }
    }

    public static void printNowDay(Weekday1 nowDay){
        if(nowDay == SUN)
            System.out.println("sunday");
        else if(nowDay == MON)
            System.out.println("monday");
        else if(nowDay == TUE)
            System.out.println("tuesday");
        else if(nowDay == WED)
            System.out.println("wednesday");
        else if(nowDay == THU)
            System.out.println("thursday");
        else if(nowDay == FRI)
            System.out.println("friday");
        else
            System.out.println("saturday");
    }
    public static int toInt(Weekday1 nowDay){
        if(nowDay == SUN)
            return 0;
        else if(nowDay == MON)
            return 1;
        else if(nowDay == TUE)
            return 2;
        else if(nowDay == WED)
            return 3;
        else if(nowDay == THU)
            return 4;
        else if(nowDay == FRI)
            return 5;
        else
            return 6;
    }
}
class Test{
    public static void main(String[] args) {
        Weekday1 nowday= Weekday1.SUN;
        Weekday1.printNowDay(nowday);
        Weekday1 nextDay = Weekday1.getNextDay(nowday);
        Weekday1.printNowDay(nextDay);
        System.out.println( Weekday1.toInt(nowday));
    }
}
