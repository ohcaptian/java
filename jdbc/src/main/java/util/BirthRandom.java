package util;
/**
 * @author 17694
 * @date 2020/11/21
 **/

import java.util.Random;

/**
 * @ClassName : BirthRandom 
 * @Description : 随机生成生日  
 */
public class BirthRandom {
    public  String randomDate(){
        Random rndYear=new Random();
        //生成0-17的一个随机数
        int year=rndYear.nextInt(18)+2000;  //生成[2000,2017]的整数；年
        Random rndMonth=new Random();
        int month=rndMonth.nextInt(12)+1;   //生成[1,12]的整数；月
        Random rndDay=new Random();
        int Day=rndDay.nextInt(30)+1;       //生成[1,30)的整数；日
        Random rndHour=new Random();
        int hour=rndHour.nextInt(23);       //生成[0,23)的整数；小时
        Random rndMinute=new Random();
        int minute=rndMinute.nextInt(60);   //生成分钟
        Random rndSecond=new Random();
        int second=rndSecond.nextInt(60);   //秒
        return year+"-"+month+"-"+Day+"  "+hour+":"+minute+":"+second;
    }




}
