package Computer.CPU;

import Computer.Utils.BitSet;

public class JumpInstruction extends Instruction{

    private BitSet secondOperand;
    private BitSet offset;

    public JumpInstruction(OpCode opCode, BitSet firstOperator, BitSet secondOperand, BitSet offset) {
        super(opCode, firstOperator);
        this.secondOperand = secondOperand;
        this.offset = offset;
    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

    public BitSet getOffset() {
        return offset;
    }

    public void setOffset(BitSet offset) {
        this.offset = offset;
    }
    public String toString(){
        return "OpCode: " + opCode.toString() + "\n" + 
         "First Operand: " + firstOperator.toString() + "\n" + 
         "Second Operand: " + secondOperand.toString() + "\n" + 
         "Offset: " + offset.toString() + "\n"; 
    }



    @Override
    BitSet getOperand(Operand index) {
        if (index == Operand.FIRST){
            return this.firstOperator;
        }else if(index == Operand.SECOND){
            return this.secondOperand;
        }else{
            return this.offset; 
        }
    }

}
