import java.io.File;
import java.util.BitSet;

public class OperativeSystem {

    private ProgramLoader programLoader = new ProgramLoader();


    /**
     *
     */
    OperativeSystem(){
        System.out.println("Constructor of OperativeSystema class");
    }

    /**
     *
     * @param file
     */
    public void runProgram(File file){
        System.out.println("Program running");
        BitSet pc = this.loadProgram(file);
        this.setPcInRegister(pc);
    }

    /**
     *
     * @param file
     * @return
     */
    private BitSet loadProgram(File file){
        System.out.println("Load program");
        return new BitSet();
    }

    /**
     *
     * @param pc
     */
    private void setPcInRegister(BitSet pc){
        System.out.println("Set pc in register");
    }
}
