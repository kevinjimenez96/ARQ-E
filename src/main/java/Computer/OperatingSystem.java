package Computer;

import Computer.Utils.BitSet;

import java.io.File;

public class OperatingSystem {

    private ProgramLoader programLoader = new ProgramLoader();


    /**
     *
     */
    public OperatingSystem(){
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
        return new BitSet(0);
    }

    /**
     *
     * @param pc
     */
    private void setPcInRegister(BitSet pc){
        System.out.println("Set pc in register");
    }
}
