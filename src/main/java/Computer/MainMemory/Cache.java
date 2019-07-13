package Computer.MainMemory;

import Computer.BusInstances;
import Computer.Utils.BitSet;

import java.util.HashMap;

public class Cache {

    private final int BLOCK_SIZE = 0;
    private final int BUFFER_SIZE = 0;
    private final int CACHE_L1_SIZE = 0;
    private final int CACHE_L2_SIZE = 0;
    private final int CACHE_L3_SIZE = 0;
    private MemoryBus memoryBus;
    private HashMap<Integer, CacheBlock> data;
    private BufferBlock[] writesBuffer = new BufferBlock[10];
    private ReplacementAlgorithm replacementAlgorithm = new ReplacementAlgorithm();


    public Cache(){
        memoryBus = BusInstances.memoryBus;
    }

    /**
     *
     * @return
     */
    public BitSet searchData(){
       return new BitSet(0);
    }

    /**
     *
     * @return
     */
    private BitSet searchNextLevel(){
        return new BitSet(0);
    }

    /**
     *
     * @param data
     * @return
     */
    private BitSet sendData (BitSet data){
        return data;
    }

    /**
     *
     * @param address
     * @return
     */
    private BitSet getBlockKey(BitSet address){
        return new BitSet(0);
    }

    /**
     *
     * @return
     */
    private BitSet read(BitSet data, int Block){
       return new BitSet(0);
    }

    /**
     *
     * @return
     */
    private BitSet write(BitSet data, int Block){
        return new BitSet(0);
    }

}
