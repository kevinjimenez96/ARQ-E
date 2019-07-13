package Computer.MainMemory;


import Computer.BusInstances;
import Computer.Utils.BitSet;

public class MainMemory {
    public static final int STACK_LENGTH = 128;
    public static final int DATA_LENGTH = 512;
    public static final int WORD_SIZE = 32;

    private final int BLOCK_SIZE = 32;
    private final int CAPACITY = 32;
    private MemoryBus memoryBus;
    private BitSet[] stackSegment;
    private BitSet[] dataSegment;
    private BitSet[] codeSegment;

    public MainMemory() {
        stackSegment = new BitSet[32];
        dataSegment = new BitSet[128];
        codeSegment = new BitSet[128];
        memoryBus = BusInstances.memoryBus;
        System.out.println("Constructor of Computer.MainMemory.Computer.MainMemory class");
    }

    /**
     * Carga datos a la memoria principal
     * @param index indice que ndica donde va el dato
     * @param data datos que se cargaran
     */
    public int loadProgramData(BitSet data, int index) { // Deberia retornar int (?)
        dataSegment[index] = data;
        return 0;
    }

    /**
     * Carga una instruccion a la memoria principal
     * @param index indice que ndica donde va la instruccion
     * @param instruction instruccion que sera cargara
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
