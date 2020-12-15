package com.ying;
/**
 * @author 17694
 * @date 2020/12/11
 **/

/**
 * @ClassName : learn 
 * @Description : 枚举类学习  
 */
public class Learn {
    public static void main(String[] args) {
        System.out.println("nowday ====> " + Weekday.SAT);
        System.out.println("nowday int ====> " + Weekday.SAT.ordinal());
        System.out.println("nextday ====> " + Weekday.getNextDay(Weekday.SAT)); // 输出 SUN
    }
}
enum Weekday{
    SUN(0),MON(1),TUS(2),WED(3),THU(4),FRI(5),SAT(6);
    private  int value;
    Weekday(int val) {
                this.value=val;
    }

    public static Weekday getNextDay(Weekday nowDay){
        int nextDayValue = nowDay.value;

        if (++nextDayValue == 7){
            nextDayValue =0;
        }

        return getWeekdayByValue(nextDayValue);
    }

    public static Weekday getWeekdayByValue(int value) {
        for (Weekday c : Weekday.values()) {
            if (c.value == value) {
                return c;
            }
        }
        return null;
    }
}

