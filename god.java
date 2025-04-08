package sample;



import java.util.Set;

import java.util.HashSet;



public class SetS {



    public static void main(String[] args) {



        Set<String> gods = new HashSet<>();

        System.out.println("My Empty Set: " + gods);



        gods.add("Laxman jii");

        gods.add("Ram jii");

        gods.add("Bharat jii");

        gods.add("Hanuman jii");

        gods.add("Vishnu jii");

        gods.add("Shiv jii");



        System.out.println("My Set After Adding Gods: " + gods);

    }

}
