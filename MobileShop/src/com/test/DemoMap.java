package com.test;

import com.domain.Mobile;
import com.service.MobileService;
import com.service.impl.MobileServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        MobileService service = new MobileServiceImpl();
        Map<Integer, Mobile> map = new HashMap<Integer, Mobile>();
        Mobile mobile = new Mobile();
        mobile = service.findPhoneByVersion("A89S6");
        map.put(0,mobile);
        mobile = service.findPhoneByVersion("B8978");
        map.put(1,mobile);
        mobile = service.findPhoneByVersion("C555");
        map.put(2,mobile);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(0));
        System.out.println(map.values());

        System.out.println("-------------------");
        for (Mobile value : map.values()) {
            System.out.println(value.getMobile_name());
        }
    }
}
