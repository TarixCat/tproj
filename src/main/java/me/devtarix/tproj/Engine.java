package me.devtarix.tproj;

import static me.devtarix.tproj.Utils.log;

public class Engine implements Runnable {
    public Thread thread;

    public boolean run = false;
    public boolean display = false;

    public int i = 0;

    @Override
    public void run() {
        while (run) {
            try {
                Thread.sleep(13);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            if (isDisplay()) {
                log(Integer.toString(calculation(i)));
            }
            i += 1;
        }
    }

    public int calculation(int i) {
        return i;
    }

    public void start() {
        if(run) return;
        run = true;
        thread = new Thread(this);
        thread.start();
        System.out.println("Started thread: " + thread.getName());
    }

    public void stop() {
        run = false;
    }

    public void setDisplay(boolean val) {
        display = val;
    }

    public boolean isDisplay() {
        return display;
    }

    public void reset() {
        i = 0;
    }
}
