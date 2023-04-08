package me.devtarix.tproj.commands.math;

import me.devtarix.tproj.Utils;

public class MathQuery {
    public MathQuery(String subcmd) {
        switch(subcmd) {
            case "anglesolver":
                new Angles();
                break;
            case "sidesolver":
                new Pythagorean();
                break;
            default:
                Utils.log("The sub-command /'"+subcmd+"/' is invalid");
                break;
        }
    }
}
