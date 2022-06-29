package me.devtarix.tproj;

import me.devtarix.tproj.commands.EngineCmd;

import static me.devtarix.tproj.Utils.log;

public class Engine implements Runnable {
    public Thread thread;

    public boolean run = false;
    public static boolean display = false;

    public int i = 0;

    @Override
    public void run() {
        while (run) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            if (isDisplay()) {
                log(Integer.toString(i));
            }
            i += 1;
        }
    }

    public void start() {
        if(run) return;
        run = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        run = false;
    }

    public static void setDisplay(boolean val) {
        display = val;
    }

    public boolean isDisplay() {
        return display;
    }
}
