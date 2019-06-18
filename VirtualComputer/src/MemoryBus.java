public class MemoryBus {

    private MainMemory mainMemory;
    private Cache[] caches = new Cache[2];
    private BufferBlock[] writesBuffer = new BufferBlock[10];

    public MemoryBus(MainMemory mainMemory){
        System.out.println("Constructor of MemoryBus class");
        this.mainMemory = mainMemory;
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
