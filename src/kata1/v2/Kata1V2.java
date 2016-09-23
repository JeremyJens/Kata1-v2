package kata1.v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1V2 {

    public static void main(String[] args) {
        
        Calendar date;
        
        date = GregorianCalendar.getInstance();
        
        date.set(1996,0,22);
        
        
        Person persona = new Person("Jeremy Jens",date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años.");
    }
    
}
