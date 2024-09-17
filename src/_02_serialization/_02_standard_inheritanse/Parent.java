package _02_serialization._02_standard_inheritanse;

import java.io.Serializable;

public class Parent{
    int parentField;

    public Parent() {
        System.out.println("parent constructor");
        parentField = 5;
    }
}
