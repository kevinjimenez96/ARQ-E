public class MemoryManager {

    private MainMemory mainMemory = new MainMemory();
    private MemoryBus memoryBus = new MemoryBus(mainMemory);

    /**
     *
     */
    public MemoryManager(){
        System.out.println("Constructor of MemoryManager class");
    }

    /**
     *
     */
    public void allocate(BitSet address){

    }

}
