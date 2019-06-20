package Computer.CPU;

import Computer.Utils.BitSet;

public class TwoOpInstruction extends Instruction{

    private BitSet secondOperand;

    public TwoOpInstruction(Enum OpCode, BitSet firstOperand, BitSet secondOperand){

    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }
}
