package Computer;

import Computer.MainMemory.MainMemory;
import Computer.MainMemory.MemoryBus;
import Computer.Utils.BitSet;

public class MemoryManager {

    private MainMemory mainMemory = new MainMemory();
    private MemoryBus memoryBus = new MemoryBus(mainMemory);

    /**
     *
     */
    public MemoryManager(){
        System.out.println("Constructor of Computer.MemoryManager class");
    }

    /**
     *
     */
    public void allocate(BitSet address){

    }

}
