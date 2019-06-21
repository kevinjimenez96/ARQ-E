package Computer.CPU;

import Computer.Utils.BitSet;

public class Instruction {

    protected BitSet opCode;
    protected BitSet firstOperator;

    public Instruction(BitSet opCode, BitSet firstOperator) {
        this.opCode = opCode;
        this.firstOperator = firstOperator;
    }

    public BitSet getOpCode() {
        return opCode;
    }

    public void setOpCode(BitSet opCode) {
        this.opCode = opCode;
    }

    public BitSet getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(BitSet firstOperator) {
        this.firstOperator = firstOperator;
    }

    
}
