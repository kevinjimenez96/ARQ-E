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
                break;
            case ADDI:
                resultInteger = firstOperandInteger + secondOperandInteger;
                break;
            case SUB:
                break;
            case SUBI:
                resultInteger = firstOperandInteger - secondOperandInteger;
                break;
            case MUL:
                break;
            case MULI:
                resultInteger = firstOperandInteger * secondOperandInteger;
                break;
            case DIV:
                break;
            case DIVI:
                resultInteger = firstOperandInteger / secondOperandInteger;
                break;
            case MOD:
                break;
            case MODI:
                resultInteger = firstOperandInteger % secondOperandInteger;
                break;
            case AND:
                break;
            case ANDI:
               // resultInteger = firstOperandInteger  secondOperandInteger;
                break;
            case OR:
                break;
            case ORI:
                break;
            case XOR:
                break;
            case XORI:
                break;
            case NOT:
                break;
            case NOTI:
                break;
            case SAL:
                break;
            case SALI:
                break;
            case SAR:
                break;
            case SARI:
                break;
            case SLL:
                break;
            case SLLI:
                break;
            case SLR:
                break;
            case SLRI:
                break;
            case SCL:
                break;
            case SCLI:
                break;
            case SCR:
                break;
            case SCRI:
                break;
            case LSB:
                break;
            case LUB:
                break;
            case LSH:
                break;
            case LUH:
                break;
            case LSW:
                break;
            case LUW:
                break;
            case SB:
                break;
            case SH:
                break;
            case SW:
                break;
            case JUMPG:
                break;
            case JUMPGE:
                break;
            case JUMPLS:
                break;
            case JUMPLSE:
                break;
            case CALL:
                break;
            case RET:
                break;
            case SYSCALL:
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
