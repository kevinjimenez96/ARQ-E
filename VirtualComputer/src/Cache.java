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

}
