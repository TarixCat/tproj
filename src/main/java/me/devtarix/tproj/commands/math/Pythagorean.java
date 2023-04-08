package me.devtarix.tproj.commands.math;

import me.devtarix.tproj.Utils;
import me.devtarix.tproj.utils.Command;

public class Pythagorean {
    public Pythagorean() {
        String pyt = Command.query("known sides, A is Adjacent, B is Opposite and C is Hypotenuse");
        Utils.log("Note: valid commands are solvec or solveab");

        switch (pyt) {
            case "solveab":
                solveAB();
                break;
            case "solvec":
                solveC();
                break;
            default:
                Utils.log(Utils.INV_IN);
                break;
        }
    }

    void solveAB() {
        double c = Utils.dQuery("hypotenuse (c)");
        double ab = Utils.dQuery("adjacent or opposite (a or b)");
        double sc = Math.pow(c,2);
        double sab = Math.pow(ab,2);
        double tot = sc-sab;
        double exact = Math.sqrt(tot);

        String sqrtf = Double.toString(tot);
        String exactf = Double.toString(exact);

        Utils.log("Side A or B is sqrt("+sqrtf+")");
        Utils.log("This is exactly "+exactf);
    }

    void solveC() {
        double a = Utils.dQuery("adjacent (a)");
        double b = Utils.dQuery("opposite (b)");
        double sa = Math.pow(a,2);
        double sb = Math.pow(b,2);
        double tot = sa+sb;
        double exact = Math.sqrt(tot);

        String sqrtf = Double.toString(tot);
        String exactf = Double.toString(exact);

        Utils.log("Side C is sqrt("+sqrtf+")");
        Utils.log("This is exactly "+exactf);
    }
}
