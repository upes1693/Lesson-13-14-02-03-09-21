package com.package_b;

//First way to import
//import com.package_a.Animal;
//import com.package_a.Person;

//Second way to import
//import com.package_a.*;

//import com.package_a.Person;
//import com.package_c.*;

import com.package_a.*;
import com.package_a.inner_package_a.*;

public class Main {
    public static void main(String[] args) {
        //Third way to import
//        com.package_a.Person person=new com.package_a.Person();
//        com.package_a.Animal animal=new com.package_a.Animal();

//        Person person=new Person();
//        com.package_c.Person person2=new com.package_c.Person();
        Person person=new Person();
        Car car=new Car();
    }
}
