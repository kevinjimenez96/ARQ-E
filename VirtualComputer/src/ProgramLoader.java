import java.io.File;
import java.util.BitSet;

public class ProgramLoader {

    private MemoryManager memoryManager = new MemoryManager();

    /**
     *
     */
    ProgramLoader (){
        System.out.println("Constructor of ProgramLoader class");
    }

    /**
     *
     * @param file
     * @return
     */
    public BitSet loadProgram(File file){
        System.out.println("Load program of Program Loader");
        return  new BitSet();
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
