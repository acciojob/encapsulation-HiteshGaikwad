package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly r=new RWOnly();
//        r.name="hello";
//        System.out.println(r.name);
        //name has private access in com.driver.RWOnly
        r.setName("hello");
        System.out.println(r.getName());
    }
}