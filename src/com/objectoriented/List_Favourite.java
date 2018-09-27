package com.objectoriented;

import java.util.HashMap;

public class List_Favourite {

    private String name;
    private String[] catagory = {"chores","outdoor","family"};
    private HashMap<Integer,String>priorityLevel = new HashMap<>();
    private boolean isDone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCatagory() {
        return catagory;
    }

    public void setCatagory(String[] catagory) {
        this.catagory = catagory;
    }

    public HashMap<Integer, String> getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(HashMap<Integer, String> priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
