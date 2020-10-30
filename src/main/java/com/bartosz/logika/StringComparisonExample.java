package com.bartosz.logika;

public class StringComparisonExample {
    public static void main(String[] args) {
        System.out.println("hello from logicflowexample");

        short a = 1;
        byte b = 2;
        int o = 12;
        double d = 22;

        String t = "a";
        char u = 't';

        boolean yes = true;
        Boolean no = new Boolean(false);
        boolean no_b = false;

        System.out.println(yes);
        System.out.println(no);

        System.out.println(yes == no);
        System.out.println(no_b == no);

        String name = "Bartosz";
        String name2 = "Bartosz";
        String name3 = new String("Bartosz");
        System.out.println("string comparison: ");
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));



    }

}
