public class ThreeOpInstruction extends Instruction{

    private BitSet secondOperand;
    private BitSet thirdOperand;

    public ThreeOpInstruction(Enum OpCode, BitSet firstOperand, BitSet secondOperand, BitSet thirdOperand){

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
}
