package com.yin.pojo;/**
 * @author 17694
 * @date 2021/02/07
 **/

/**
 * @ClassName : Hello
 * @Description :   
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello,"+ name );
    }
}
