package com.domain.test2;

public class Zi extends Fu {
    public Zi() {
        this(1);
        System.out.println("子类构造方法执行...");
    }
    public Zi(int num1){
        System.out.println("有参构造");
    }

    public void eat() {
        System.out.println("恰饭");
    }
    public static void sleep() {
        System.out.println("睡觉...");
    }
}
