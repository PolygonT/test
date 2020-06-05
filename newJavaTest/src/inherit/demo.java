package inherit;

import java.time.LocalDateTime;

public class demo {
    public static void main(String[] args) {
        Parent son = new Son();
        Godson godson = new Godson();
        if(godson instanceof Parent) {
            Parent p = (Parent)godson;
            System.out.println(p.hashCode());
        }


        /*if(godson instanceof Godson) {
            System.out.println(true);
            Godson godson1 = (Godson) godson;
            godson1.setDateTime(LocalDateTime.now());
            System.out.println(godson1.getDateTime());

            if(godson1 instanceof Parent) {
                System.out.println("true again");
                Parent parent = (Parent)godson1;
            }
        }*/
    }
}
