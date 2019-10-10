package com.example.rxsenddata;


public class Model {

    private String name;
    private String family;

    public Model(String name, String family) {
        this.name = name;
        this.family = family;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


}
