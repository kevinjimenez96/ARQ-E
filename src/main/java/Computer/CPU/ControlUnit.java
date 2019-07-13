package Computer.CPU;

import Computer.BusInstances;
import Computer.Utils.BitSet;

import static Computer.CPU.Operand.SECOND;
import static Computer.CPU.Operand.THIRD;

public class ControlUnit {

    private BitSet instructionRegister;
    private BitSet programCounter;
    private BitSet stackPointer;
    private Decoder decoder;
    private LocalBus localBus;


    ControlUnit(LocalBus localBus){
        System.out.println("Constructor of LocalBus.ControlUnit class");
        this.decoder = new Decoder();
        this.localBus = localBus;
    }
    /**
     * This method sends a coded instruction to the Decoder so it can be deciphered.
     *
     * @return Instruction This returns an Instruction object with its OpCode and operands.
     */
    public Instruction processInstruction(BitSet codedInstruction){
        // Instruction Decode
        Instruction ins = decoder.decode(codedInstruction);
        BitSet firstAluOperand;
        BitSet secondAluOperand;
        //System.out.println(ins);
        // EX
        switch(ins.getOpCode()){
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case SAL:
            case SAR:
            case SLL:
            case SLR:
            case SCL:
            case SCR:
                firstAluOperand = localBus.getRegisterValue(ins.getOperand(SECOND).toUInt());
                secondAluOperand = localBus.getRegisterValue(ins.getOperand(THIRD).toUInt());
                localBus.setAluOperands(firstAluOperand, secondAluOperand);
                localBus.executeOperation(ins.getOpCode());
                //System.out.println(localBus.getAluResult());
                break;
            case ADDI:
            case SUBI:
            case MULI:
            case DIVI:
            case MODI:
            case ANDI:
            case ORI:
            case XORI:
            case NOTI:
            case SALI:
            case SARI:
            case SLRI:
            case SLLI:
            case SCLI:
            case SCRI:
                firstAluOperand = localBus.getRegisterValue(ins.getOperand(SECOND).toUInt());
                secondAluOperand = ins.getOperand(THIRD);
                localBus.setAluOperands(firstAluOperand, secondAluOperand);
                localBus.executeOperation(ins.getOpCode());
                //System.out.println(localBus.getAluResult());
                break;
            case LSB:
            case LUB:
            case LSH:
            case LUH:
            case LSW:
            case LUW:
                
                break;
            case SB:
            case SH:
            case SW:
                break;
            case JUMPG:
            case JUMPGE:
            case JUMPLS:
            case JUMPLSE:
                break;
            case CALL:
            case RET:
            case SYSCALL:
        }
        //System.out.println(instruction.toString());
        return ins;
    }


    /**
     * This method sends an instruction to the Arithmetic Logic Unit so it can be executed.
     *
     */
    public void executeLogicOp(Instruction instruction){

    }


    /**
     * This method executes the necessary steps to manage control operations such as jumps, call, syscall
     *
     */
    public void executeControlOp(Instruction instruction){

    }

}
