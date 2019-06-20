package Computer.MainMemory;

import Computer.Utils.BitSet;

public class CacheBlock {

    private BitSet[] data;
    private BitSet tag;
    private BitSet validBit;

    public CacheBlock(int blockSize){
        System.out.println("Constructor of Computer.MainMemory.CacheBlock con block size: "+ blockSize);
    }


}
