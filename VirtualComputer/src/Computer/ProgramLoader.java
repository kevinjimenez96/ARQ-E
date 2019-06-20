package Computer;

import Computer.Utils.BitSet;

import java.io.File;

public class ProgramLoader {

    private MemoryManager memoryManager = new MemoryManager();

    /**
     *
     */
    public ProgramLoader (){
        System.out.println("Constructor of Computer.ProgramLoader class");
    }

    /**
     *
     * @param file
     * @return
     */
    public BitSet loadProgram(File file){
        System.out.println("Load program of Program Loader");
        return  new BitSet(0);
    }

    /**
     *
     * @param instruction
     */
    private void loadInstruction(BitSet instruction){
        System.out.println("Load instruction of Program Loader");
    }

    /**
     *
     * @param data
     */
    private void loadData(BitSet data){
        System.out.println("Load data of Load Program");
    }

}
