package Computer;

import Computer.Utils.BitSet;

import java.io.File;
import java.io.FileNotFoundException;

public class OperatingSystem {

    private ProgramLoader programLoader = new ProgramLoader();


    /**
     *
     */
    public OperatingSystem() throws FileNotFoundException {
        System.out.println("Constructor of OperativeSystema class");
        File file = new File("C:\\Users\\Usuario\\Desktop\\UCR\\Arqui\\Proyecto\\binario.txt");
        runProgram(file);
    }

    /**
     *
     * @param file
     */
    public void runProgram(File file) throws FileNotFoundException {
        System.out.println("Program running");
        BitSet pc = this.loadProgram(file);
        this.setPcInRegister(pc);
    }

    /**
     *
     * @param file
     * @return
     */
    private BitSet loadProgram(File file) throws FileNotFoundException {
        System.out.println("Load program");
        programLoader.loadProgram(file);
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
