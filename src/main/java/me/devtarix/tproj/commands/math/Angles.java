package me.devtarix.tproj.commands.math;

import me.devtarix.tproj.Utils;
import me.devtarix.tproj.utils.Command;

public class Angles {
    public Angles() {
        String ang = Command.query("known sides, A is Adjacent, B is Opposite, C is Hypotenuse");
        Utils.log("Note: the selectable options are solveac, solveab and solvebc");

        switch (ang) {
            case "solveac":
                Utils.log("Solving for the angle between adjacent and hypotenuse");
                solveac();
                break;
            case "solveab":
                Utils.log("Solving for the angle between adjacent and opposite");
                solveab();
                break;
            case "solvebc":
                Utils.log("Solving for the angle between opposite and hypotenuse");
                solvebc();
                break;
            default:
                Utils.log(Utils.INV_IN);
                break;
        }
    }

    void solveac() {
        double a = Utils.dQuery("a");
        double c = Utils.dQuery("c");

        double o = Math.asin(a/c);
        String of = Double.toString(o);
        String od = Double.toString(Math.toDegrees(o));

        Utils.log("rads="+of+" degs="+od);

    }

    void solveab() {
        double a = Utils.dQuery("a");
        double b = Utils.dQuery("b");

        double o = Math.atan(b/a);
        String of = Double.toString(o);
        String od = Double.toString(Math.toDegrees(o));

        Utils.log("rads="+of+" degs="+od);
    }

    void solvebc() {
        double b = Utils.dQuery("b");
        double c = Utils.dQuery("c");

        double o = Math.acos(b/c);
        String of = Double.toString(o);
        String od = Double.toString(Math.toDegrees(o));

        Utils.log("rads="+of+" degs="+od);
    }
}
