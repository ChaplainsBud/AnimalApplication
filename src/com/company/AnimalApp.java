package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args){
        Animal dog = new Animal();
        Scanner sc = new Scanner(System.in);
        dog.setName(sc.nextLine());
        dog.setType(sc.nextLine());
        dog.setDescription(sc.nextLine());
        dog.setPrice(sc.nextInt());
        dog.setInStock(sc.nextBoolean());

        HashMap<String, String> animalProps = new HashMap<String, String>();
        animalProps.put(this.name);
        animalProps.put(this.type);
        animalProps.put(this.description);
        animalProps.put(this.price);
        animalProps.put(this.setInStock);

        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.description);
    }
}

