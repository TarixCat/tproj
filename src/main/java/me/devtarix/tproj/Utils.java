package me.devtarix.tproj;

import me.devtarix.tproj.utils.Command;

public class Utils {
    public static void log(String msg) {
        System.out.println(msg);
    }

    public static int iQuery(String in) {
        return Integer.parseInt(Command.query(in));
    }

    public static double dQuery(String in) {
        return Double.parseDouble(Command.query(in));
    }

    public static float fQuery(String in) {
        return Float.parseFloat(Command.query(in));
    }

    public static final String INV_IN = "Input was invalid";
}
