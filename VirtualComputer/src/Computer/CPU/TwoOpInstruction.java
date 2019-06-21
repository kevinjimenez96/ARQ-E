package Computer.CPU;

import Computer.Utils.BitSet;

public class TwoOpInstruction extends Instruction{

    private BitSet secondOperand;

    public TwoOpInstruction(BitSet opCode, BitSet firstOperator, BitSet secondOperand) {
        super(opCode, firstOperator);
        this.secondOperand = secondOperand;
    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

}
