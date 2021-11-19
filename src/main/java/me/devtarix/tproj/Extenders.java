package me.devtarix.tproj;

import java.util.List;

import static me.devtarix.tproj.Utils.log;

public abstract class Extenders {

    public String name;
    public List<String> description;
    //private Extenders e = this;

    public Extenders(String name) {
        log("Registered extension: " + name);
        execute();
    }

    public String getName() {
        return name;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public abstract void execute();
}
