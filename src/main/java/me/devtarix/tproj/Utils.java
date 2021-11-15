package me.devtarix.tproj;

import java.io.File;

public class Utils {
    static String currentDirectory = System.getProperty("user.dir");
    static String loc = currentDirectory + "/randomproject";

    public static String outdir = loc + "/out";
    public static String keydir = loc + "/keys";
    public static String comdir = loc + "/data";
    public static String rsadir = keydir + "/rsa";
    public static String aesdir = keydir + "/aes";

    File file = new File(loc);

    public static void log(String msg) {
        System.out.println(msg);
    }
}
