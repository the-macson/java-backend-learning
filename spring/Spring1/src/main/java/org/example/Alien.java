package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
//    private Laptop laptop;
    private Computer comp;
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    public Alien() {
//        System.out.println("Alien");
//    }
//    public Alien(int age) {
//        this.age = age;
//    }
//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("Alien setAge " + age);
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.complie();
    }
}
