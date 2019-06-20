package Computer.CPU;

import Computer.Utils.BitSet;

public class Decoder {

    private BitSet currentOpCode;


    public Instruction decode(BitSet codedInstruction){
        return null;
    }

    public BitSet getCurrentOpCode() {
        return currentOpCode;
    }

    public void setCurrentOpCode(BitSet currentOpCode) {
        this.currentOpCode = currentOpCode;
    }
}
