package com.test;

import com.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class jacksonTest {
    @Test
    public void fun1() {
        Person person = new Person();
        person.setName("张三");
        person.setAge(24);
        person.setGender("male");
        person.setBirthday(new Date());

        //创建jackson核心对象
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String personAsString = objectMapper.writeValueAsString(person);
            System.out.println(personAsString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
