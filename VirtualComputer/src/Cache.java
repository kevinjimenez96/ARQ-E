import java.util.BitSet;
import java.util.HashMap;

public class Cache {

    private final int BLOCK_SIZE;
    private final int BUFFER_SIZE;
    private final int CACHE_SIZE;
    private Cache nextLevel;
    private HashMap<Integer, CacheBlock> data;
    private BufferBlock[] writesBuffer = new BufferBlock[10];
    private ReplacementAlgorithm replacementAlgorithm = new ReplacementAlgorithm();


    Cache(int block_size, int buffer_size, int cache_size, Cache nextLevel){

        this.BLOCK_SIZE = block_size;
        this.BUFFER_SIZE = buffer_size;
        this.CACHE_SIZE = cache_size;
        this.nextLevel = nextLevel;

    }

    /**
     *
     * @return
     */
    public BitSet searchData(){
       return new BitSet();
    }

    /**
     *
     * @return
     */
    private BitSet searchNextLevel(){
        return new BitSet();
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
        return new BitSet();
    }

    /**
     *
     * @return
     */
    private BitSet read(BitSet data, int Block){
       return new BitSet();
    }

    /**
     *
     * @return
     */
    private BitSet write(BitSet data, int Block){
        return new BitSet();
    }

}
