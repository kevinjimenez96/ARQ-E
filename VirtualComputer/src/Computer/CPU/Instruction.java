package Computer.CPU;

import Computer.Utils.BitSet;

public class Instruction {

    private BitSet opCode;
    private BitSet firstOperator;

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
