package company;

import company.models.Person;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[5];
        
        
        final int b = 10;
        
        try {
            
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person("John Doe", 30);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        for (int i = 0; i < people.length; i++) {
            int value = MathUtils.add(people[i].getAge(), b);
            String message = "Wartość dla osoby " + i + ": " + value;
            
            
            System.out.println(message);
        }
    }
}



