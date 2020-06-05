package com.domain.test;

import com.domain.Boy;
import com.domain.Person;

public class demo1 {
    public static void main(String[] args) {
        Person p = new Person();
        if(p instanceof Boy) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        /*int i = (int) 10.5;
        System.out.println(i);*/

    }
}
