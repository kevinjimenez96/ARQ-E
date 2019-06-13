import java.nio.Buffer;
import java.util.BitSet;

public class MemoryBus {

    private Cache[] caches = new Cache[2];
    private BufferBlock[] writesBuffer = new BufferBlock[10];

    MemoryBus(){

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

        return new BitSet();
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

        return new BitSet();
    }

}
