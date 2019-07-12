package Computer.IOModule;

import Computer.Utils.BitSet;

public class Keyboard implements IODevice{

    private BitSet[] keyboardMemory;

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public BitSet[] getKeyboardMemory() {
        return keyboardMemory;
    }

    public void setKeyboardMemory(BitSet[] keyboardMemory) {
        this.keyboardMemory = keyboardMemory;
    }
}
