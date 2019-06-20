package Computer.IOModule;

import Computer.Utils.BitSet;

public class Monitor implements IODevice{

    private BitSet[] monitorMemory;

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public BitSet[] getMonitorMemory() {
        return monitorMemory;
    }

    public void setMonitorMemory(BitSet[] monitorMemory) {
        this.monitorMemory = monitorMemory;
    }
}
