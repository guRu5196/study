package org.guru;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Data")
public class Student {
    @Id
    @Column(name = "Roll no")
    private int roll;
    @Column(name = "Age")
    private int age;
    @Column(name = "Name")
    private String name;
    @OneToOne
    private Laptop laptop;



    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
