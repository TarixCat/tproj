package me.devtarix.tproj.commands;

import me.devtarix.tproj.utils.Command;

import java.util.Scanner;

import static java.lang.Math.*;

public class MathCmd implements Command {


    public MathCmd() {
        register("maths");
    }

    @Override
    public void textCommand() {
        double l1 = query("Length 1");
        double a1 = query("Angle 1");
        double ra1 = toRadians(a1);
        double l2 = query("Length 2");

        double t = l2*sin(ra1);
        double b = l1;

        double i = asin(t/b);
        double ii = toDegrees(i);

        System.out.println(ii);
    }

    @Override
    public void textCommand(String[] args) {
        textCommand();
    }

    private static double query(String lmsg) {
        System.out.println("Please input "+lmsg.toLowerCase()+":");
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }
}
