package Computer.CPU;

import Computer.Utils.BitSet;

public class ALU {

    private BitSet firstOperand;
    private BitSet secondOperand;
    private BitSet result;

    ALU(){
        System.out.println("Constructor of Computer.ALU class");
        firstOperand = new BitSet(32);
        secondOperand = new BitSet(32);
        result = new BitSet(32);
    }

    /**
     * This method decides how an instruction should be processed based on its OpCode, and then executes it.
     *
     */
    public void executeOperation(OpCode opCode){
        int firstOperandInteger = firstOperand.toInt();
        int secondOperandInteger = secondOperand.toInt();
        int resultInteger = 0;
        switch(opCode){
            case ADD:
            case ADDI:
                resultInteger = firstOperandInteger + secondOperandInteger;
                break;
            case SUB:
            case SUBI:
                resultInteger = firstOperandInteger - secondOperandInteger;
                System.out.println(resultInteger);
                break;
            case MUL:
            case MULI:
                resultInteger = firstOperandInteger * secondOperandInteger;
                break;
            case DIV:
            case DIVI:
                resultInteger = firstOperandInteger / secondOperandInteger;
                break;
            case MOD:
            case MODI:
                resultInteger = firstOperandInteger % secondOperandInteger;
                break;
            case AND:
            case ANDI:
                resultInteger = firstOperandInteger & secondOperandInteger;
                break;
            case OR:
            case ORI:
                resultInteger = firstOperandInteger | secondOperandInteger;
                break;
            case XOR:
            case XORI:
                resultInteger = firstOperandInteger ^ secondOperandInteger;
                break;
            case NOT:
            case NOTI:
                resultInteger = ~firstOperandInteger;
                break;
            case SAL:
            case SALI:
                resultInteger = firstOperandInteger << secondOperandInteger;
                break;
            case SAR:
            case SARI:
                resultInteger = firstOperandInteger >> secondOperandInteger;
                break;
            case SLL:
            case SLLI:
                resultInteger = firstOperandInteger << secondOperandInteger;
                break;
            case SLR:
            case SLRI:
                resultInteger = firstOperandInteger >>> secondOperandInteger;
                break;
            case SCL:
            case SCLI:
                break;
            case SCR:
            case SCRI:
                break;
        }

        result = new BitSet(32);
        result.setIntToBitSet(resultInteger);
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
