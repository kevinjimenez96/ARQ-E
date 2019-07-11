package Computer.IOModule;

import javax.management.monitor.Monitor;

public class ExpansionBus {

    private Keyboard keyboard;
    private Monitor monitor;

    public void read(){

    }

    public void write(){

    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
