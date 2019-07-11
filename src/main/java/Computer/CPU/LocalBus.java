package Computer.CPU;

import Computer.Utils.BitSet;

public class LocalBus {

    private Registers internalStorage;
    private ALU alu;
    private ControlUnit controlUnit;

    /**
     * This method gives the signal to the Control Unit so it can take action
     * on decoding a given instruction.
     *
     * @param codedInstruction instruction to be decoded.
     * @return Instruction decoded to its corresponding opCode and its operands.
     */
    public Instruction decode(BitSet codedInstruction) {
        return null;
    }

    /**
     * This method gives the signal to either the ALU or the Control Unit to execute a given instruction, depending on its type.
     *
     * @param instruction to be executed.
     */
    public void executeOperation(Instruction instruction){

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
}
