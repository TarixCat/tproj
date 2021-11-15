package me.devtarix.tproj;

import java.util.List;

public abstract class Extenders {

    public String name;
    public List<String> description;
    public Extenders e;

    public Extenders(String name, List<String> description, Extenders e) {
        this.e =e;
        this.description = description;
        this.name = name;
    }

    public void register() {

    }
}
