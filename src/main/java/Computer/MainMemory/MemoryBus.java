package Computer.MainMemory;

import Computer.Utils.BitSet;

public class MemoryBus {

    private BufferBlock[] writesBuffer;

    public MemoryBus(){
        writesBuffer = new BufferBlock[10];
        System.out.println("Constructor of Computer.MainMemory.MemoryBus class");
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
