package test;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;
import user.User;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    @Test
    public void fun1() {
       User rootUser = new User("tom",18);
       Map<String,User> contextMap = new HashMap<String,User>();
       contextMap.put("user1",new User("jack",14));
       contextMap.put("user2",new User("rose",20));

       //Ognl.setRoot(contextMap,rootUser);
       OgnlContext oc = new OgnlContext();
       oc.setRoot(rootUser);
       oc.setValues(contextMap);

        try {
            String name = (String) Ognl.getValue("#user2.name", oc, oc.getRoot());
            System.out.println(name);
        } catch (OgnlException e) {
            e.printStackTrace();
        }

       /* try {
            String name = (String) Ognl.getValue("name", contextMap, rootUser);
            System.out.println(name);
            String name2 = (String) Ognl.getValue("#user1.name", contextMap, rootUser);
            System.out.println(name2);
            String name3 = (String) Ognl.getValue("#user2.name", contextMap, rootUser);
            System.out.println(name3);

        } catch (OgnlException e) {
            e.printStackTrace();
        }*/

    }
}
