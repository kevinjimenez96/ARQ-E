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
        dataSegment = new BitSet[128];
        codeSegment = new BitSet[128];
        memoryBus = BusInstances.memoryBus;
        System.out.println("Constructor of Computer.MainMemory.Computer.MainMemory class");
    }

    /**
     *
     */
    public int loadProgramData(BitSet data, int index) { // Deberia retornar int (?)
        dataSegment[index] = data;
        return 0;
    }

    /**
     *
     */
    public int loadProgramInstruction(BitSet instruction, int index) { // Deberia retornar int (?)
        codeSegment[index] = instruction;
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
