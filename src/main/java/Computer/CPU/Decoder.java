package Computer.CPU;

import Computer.Utils.BitSet;

public class Decoder {

    private BitSet currentOpCode;

    /**
     * This method decodes a coded instruction.
     *
     * @param codedInstruction instruction to be decoded into its OpCode and operands.
     * @return Instruction decoded with the corresponding OpCode and its operands.
     */
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
