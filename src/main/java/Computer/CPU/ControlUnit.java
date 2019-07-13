package Computer.CPU;

import Computer.Utils.BitSet;

public class ControlUnit {

    private BitSet instructionRegister;
    private BitSet programCounter;
    private BitSet stackPointer;
    private Decoder decoder;


    ControlUnit(){
        System.out.println("Constructor of LocalBus.ControlUnit class");
        this.decoder = new Decoder();
    }
    /**
     * This method sends a coded instruction to the Decoder so it can be deciphered.
     *
     * @return Instruction This returns an Instruction object with its OpCode and operands.
     */
    public Instruction processInstruction(BitSet codedInstruction){
        Instruction instruction = decoder.decode(codedInstruction);
        //System.out.println(instruction.toString());
        return instruction;
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
