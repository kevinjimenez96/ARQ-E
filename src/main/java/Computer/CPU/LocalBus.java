package Computer.CPU;

import Computer.Utils.BitSet;

public class LocalBus {

    private Registers internalStorage;
    private ALU alu;
    private ControlUnit controlUnit;


    public LocalBus(){
        alu = new ALU();
        controlUnit = new ControlUnit();
        internalStorage = new Registers();
    }

    /**
     * This method gives the signal to the Control Unit so it can take action
     * on decoding a given instruction.
     *
     * @param codedInstruction instruction to be decoded.
     * @return Instruction decoded to its corresponding opCode and its operands.
     */
    public Instruction decode(BitSet codedInstruction) {
        Instruction instruction = controlUnit.processInstruction(codedInstruction);
        return instruction;
    }

    /**
     * This method gives the signal to either the ALU or the Control Unit to execute a given instruction, depending on its type.
     *
     * @param opcode to be executed.
     */
    public void executeOperation(OpCode opcode){
        alu.executeOperation(opcode);
    }

    public Registers getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(Registers internalStorage) {
        this.internalStorage = internalStorage;
    }

    public ALU getAlu() {
        return alu;
    }

    public void setAlu(ALU alu) {
        this.alu = alu;
    }

    public ControlUnit getControlUnit() {
        return controlUnit;
    }

    public void setControlUnit(ControlUnit controlUnit) {
        this.controlUnit = controlUnit;
    }

    /**
     *
     * @param firstOper
     * @param secondOperand
     */
    public void setAluOperands(BitSet firstOper, BitSet secondOperand){
        alu.setFirstOperand(firstOper);
        alu.setSecondOperand(secondOperand);

    }

    /**
     *
     * @return
     */
    public BitSet getAluResult(){
        return alu.getResult();
    }

    public void executeIntruction(BitSet instruction){
        controlUnit.processInstruction(instruction);
    }

    public BitSet getRegisterValue(int index){
        return internalStorage.getRegister(index);
    }

    public void setRegisterValue(int index, BitSet value){
         internalStorage.setRegister(index,value);
    }
}
