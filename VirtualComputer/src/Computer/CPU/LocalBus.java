package Computer.CPU;

import Computer.Utils.BitSet;

public class LocalBus {

    private Registers internalStorage;
    private ALU alu;
    private ControlUnit controlUnit;

    public BitSet loadData(BitSet address){
        return null;
    }

    public void storeData(BitSet data, BitSet address){

    }

    public Instruction decode(BitSet codedInstruction) {
        return null;
    }

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
