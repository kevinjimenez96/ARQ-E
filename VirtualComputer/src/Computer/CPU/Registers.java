package Computer.CPU;

import Computer.Utils.BitSet;

public class Registers {

    private static final int ZERO_REGISTER = 0;
    private BitSet[] registers;
    private BitSet occupiedRegisters;

    public BitSet getRegister(int index){
        return registers[index];
    }

    public BitSet[] getRegistros() {
        return registers;
    }

    public void setRegistros(BitSet[] registros) {
        this.registers = registros;
    }

    public BitSet getOccupiedRegisters() {
        return occupiedRegisters;
    }

    public void setOccupiedRegisters(BitSet occupiedRegisters) {
        this.occupiedRegisters = occupiedRegisters;
    }
}
