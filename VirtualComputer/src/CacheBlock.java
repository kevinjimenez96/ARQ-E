public class CacheBlock {

    private BitSet[] data;
    private BitSet tag;
    private BitSet validBit;

    public CacheBlock(int blockSize){
        System.out.println("Constructor of CacheBlock con block size: "+ blockSize);
    }


}
