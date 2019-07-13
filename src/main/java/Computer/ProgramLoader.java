package Computer;

import Computer.Utils.BitSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

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
    public BitSet loadProgram(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String program = scanner.nextLine();

        for(int f=0; f<program.length(); f += 8){
            BitSet bits = new BitSet(8);
            for(int i=0; i<8; i++) {
                char bit = program.charAt(i + f);
                if(bit == '1'){
                    bits.setValue(i, true);
                } else if (bit == '0'){
                    bits.setValue(i, false);
                }   else {
                    System.out.println("Error prro");
                }
            }
            System.out.println(bits.toString());
        }


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
