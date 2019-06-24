package Computer.CPU;

import Computer.Utils.BitSet;

public class TwoOpInstruction extends Instruction{

    private BitSet secondOperand;

    public TwoOpInstruction(OpCode opCode, BitSet firstOperator, BitSet secondOperand) {
        super(opCode, firstOperator);
        this.secondOperand = secondOperand;
    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

    @Override
    BitSet getOperando(Operand index) {
        if (index == Operand.FIRST){
            return this.firstOperator;
        } else {
            return this.secondOperand;
        }
    }

    public String toString(){
        return "OpCode: " + opCode.toString() + "\n" + 
         "First Operand: " + firstOperator.toString() + "\n" + 
         "Second Operand: " + secondOperand.toString() + "\n"; 
    }
}
