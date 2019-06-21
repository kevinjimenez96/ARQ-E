package Computer.CPU;

import Computer.Utils.BitSet;

public class ThreeOpInstruction extends Instruction{

    private BitSet secondOperand;
    private BitSet thirdOperand;

    public ThreeOpInstruction(BitSet opCode, BitSet firstOperator, BitSet secondOperand, BitSet thirdOperand) {
        super(opCode, firstOperator);
        this.secondOperand = secondOperand;
        this.thirdOperand = thirdOperand;
    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

    public BitSet getThirdOperand() {
        return thirdOperand;
    }

    public void setThirdOperand(BitSet thirdOperand) {
        this.thirdOperand = thirdOperand;
    }

    public String toString(){
        return "OpCode: " + opCode.toString() + "\n" + 
         "First Operand: " + firstOperator.toString() + "\n" + 
         "Second Operand: " + secondOperand.toString() + "\n" + 
         "Third Operand: " + thirdOperand.toString() + "\n"; 
    }
}
