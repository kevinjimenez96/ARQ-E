package Computer.CPU;

import Computer.Utils.BitSet;

public abstract class Instruction {

    protected OpCode opCode;
    //protected BitSet opCode;
    protected BitSet firstOperator;

    public Instruction(OpCode opCode, BitSet firstOperator) {
        this.opCode = opCode;
        this.firstOperator = firstOperator;
    }

    public OpCode getOpCode() {
        return opCode;
    }

    public void setOpCode(OpCode opCode) {
        this.opCode = opCode;
    }

    public BitSet getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(BitSet firstOperator) {
        this.firstOperator = firstOperator;
    }

    abstract BitSet getOperando(Operand index);
}
