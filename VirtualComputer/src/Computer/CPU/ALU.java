package Computer.CPU;

import Computer.Utils.BitSet;

public class ALU {

    private BitSet firstOperand;
    private BitSet secondOperand;
    private BitSet result;

    /**
     * This method decides how an instruction should be processed based on its OpCode, and then executes it.
     *
     */
    public void executeOperation(Instruction instruction){

    }

    public BitSet getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(BitSet firstOperand) {
        this.firstOperand = firstOperand;
    }

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

    public BitSet getResult() {
        return result;
    }

    public void setResult(BitSet result) {
        this.result = result;
    }
}
