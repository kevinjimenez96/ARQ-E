package Computer.MainMemory;

import Computer.BusInstances;
import Computer.Utils.BitSet;

public class MainMemory {

    private final int BLOCK_SIZE = 32;
    private final int CAPACITY = 32;
    private MemoryBus memoryBus;
    private BitSet[] stackSegment;
    private BitSet[] dataSegment;
    private BitSet[] codeSegment;

    public MainMemory() {
        memoryBus = BusInstances.memoryBus;
        System.out.println("Constructor of Computer.MainMemory.Computer.MainMemory class");
    }

    /**
     *
     */
    public int loadProgramData() { // Deberia retornar int (?)

        return 0;
    }

    /**
     *
     */
    public int loadProgramInstruction() { // Deberia retornar int (?)

        return 0;
    }

    /**
     *
     * @param address
     * @return
     */
    public BitSet load(BitSet address){

        return new BitSet(0);
    }

    /**
     *
     */
    public void store(BitSet address, BitSet data){

    }

    /**
     *
     * @return
     */
    public BitSet fetchInstruction (){

        return new BitSet(0);
    }
}
