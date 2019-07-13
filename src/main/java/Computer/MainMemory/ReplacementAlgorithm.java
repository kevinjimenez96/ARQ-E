package Computer.MainMemory;

import Computer.Utils.BitSet;

import java.util.HashMap;
import java.util.Queue;
import java.util.Random;

public class ReplacementAlgorithm {

    public ReplacementAlgorithm(){
        System.out.println("Constructor of Replacement Algorithm");
    }

    public void replace(HashMap<Integer, CacheBlock> data, CacheBlock newBlock){
        Random rand = new Random();

        Integer n = rand.nextInt(data.size());

        data.put(n,newBlock);
    }

}
