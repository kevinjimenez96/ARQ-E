package Computer;

import Computer.Utils.BitSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramLoader {
    private static final int STACK_LENGTH = 128;
    private static final int DATA_LENGTH = 512;
    public static final int WORD_SIZE = 32;

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

        String stack = program.substring(0, STACK_LENGTH);
        BitSet stackBitSet = new BitSet(stack);
        //loadStack(stackBitSet);

        String data = program.substring(0, DATA_LENGTH * 8);
        BitSet dataBitSet = new BitSet(data);
        loadData(dataBitSet);

        String instructions = program.substring(DATA_LENGTH * 8, program.length());
        BitSet instructionsBitSet = new BitSet(instructions);
        loadInstructions(instructionsBitSet);

        memoryManager.allocate(new BitSet(1));

        System.out.println("Load program of Program Loader");
        return  new BitSet(0);
    }

    /**
     *
     * @param instructions
     */
    private void loadInstructions(BitSet instructions){
        System.out.println("----------------------------- INSTRUCTIONS SEGMENT ------------------------------");
        for(int l=0; l<instructions.getSize(); l += WORD_SIZE){
            BitSet bits = instructions.subBitSet(l, l+WORD_SIZE);
            memoryManager.loadProgramInstructions(bits, (l / WORD_SIZE));
        }
    }

    /**
     *
     * @param data
     */
    private void loadData(BitSet data){
        System.out.println("----------------------------- DATA SEGMENT ------------------------------");
        for(int l=0; l<data.getSize(); l += WORD_SIZE){
            BitSet bits = data.subBitSet(l, l+WORD_SIZE);
            memoryManager.loadProgramData(bits, (l / WORD_SIZE));
        }
    }

}
