package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //What fields do ALL FOUR of the classes have in common?
    private int id;
    private static int nextId = 1;
    private String value;


    //Which constructors are the same in ALL FOUR classes?
    public JobField() {
        this.id = nextId;
        nextId++;
    }


    public JobField(String value) {
        this();
        this.value = value;
    }


    //What getters and setters do ALL of the classes share?
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    //Which custom methods are identical in ALL of the classes?
    @Override
    public String toString() {
        return "JobField{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
