package Computer.CPU;

import Computer.Utils.BitSet;

public class Registers {

    private static final int ZERO_REGISTER = 0;
    private BitSet[] registers;
    private BitSet occupiedRegisters;

    Registers(){
        registers = new BitSet[32];
        for (int i = 0; i  < 32; i++) {
            registers[i] = new BitSet(32);
        }
    }

    public BitSet getRegister(int index){
        return registers[index];
    }

    public void setRegister(int index, BitSet value){
        registers[index] = value;
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
