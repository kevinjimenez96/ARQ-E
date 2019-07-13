package Computer.IOModule;

import Computer.MainMemory.BufferBlock;
import Computer.Utils.BitSet;

import javax.management.monitor.Monitor;

public class ExpansionBus {

    private Keyboard keyboard;
    private Monitor monitor;
    private BitSet dataLines;
    private BitSet addressLines;
    private BitSet controlLines;

    public ExpansionBus(){
        dataLines = new BitSet(32);
        addressLines = new BitSet(16);
        controlLines = new BitSet(4);
    }

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
