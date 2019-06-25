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
    public void executeOperation(OpCode opCode){
        int firstOperandInteger = firstOperand.toInt();
        int secondOperandInteger = secondOperand.toInt();
        int resultInteger = 0;
        switch(opCode){
            case ADD:
            case ADDI:
                resultInteger = firstOperandInteger + secondOperandInteger;
            case SUB:
            case SUBI:
                resultInteger = firstOperandInteger - secondOperandInteger;
            case MUL:
            case MULI:
                resultInteger = firstOperandInteger * secondOperandInteger;
            case DIV:
            case DIVI:
                resultInteger = firstOperandInteger / secondOperandInteger;
            case MOD:
            case MODI:
                resultInteger = firstOperandInteger % secondOperandInteger;
            case AND:
            case ANDI:
                resultInteger = firstOperandInteger  secondOperandInteger;
            case OR:
            case ORI:
            case XOR:
            case XORI:
            case NOT:
            case NOTI:
            case SAL:
            case SALI:
            case SAR:
            case SARI:
            case SLL:
            case SLLI:
            case SLR:
            case SLRI:
            case SCL:
            case SCLI:
            case SCR:
            case SCRI:
            case LSB:
            case LUB:
            case LSH:
            case LUH:
            case LSW:
            case LUW:
            case SB:
            case SH:
            case SW:
            case JUMPG:
            case JUMPGE:
            case JUMPLS:
            case JUMPLSE:
            case CALL:
            case RET:
            case SYSCALL:
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
