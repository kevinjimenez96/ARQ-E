package Computer;

import Computer.MainMemory.MainMemory;
import Computer.Utils.BitSet;

import java.io.File;
import java.io.FileNotFoundException;
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
     * Carga el programa a la memoria
     * @param file, archivo binario del programa
     * @return
     */
    public BitSet loadProgram(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String program = scanner.nextLine();

        String data = program.substring(0, MainMemory.DATA_LENGTH * 8);
        BitSet dataBitSet = new BitSet(data);
        loadData(dataBitSet);

        String instructions = program.substring(MainMemory.DATA_LENGTH * 8, program.length());
        BitSet instructionsBitSet = new BitSet(instructions);
        loadInstructions(instructionsBitSet);

        memoryManager.allocate(new BitSet(1));

        System.out.println("Load program of Program Loader");
        return  new BitSet(0);
    }

    /**
     * Carga las instrucciones a memoria principal
     * @param instructions, las instrucciones en un bitset
     */
    private void loadInstructions(BitSet instructions){
        System.out.println("----------------------------- INSTRUCTIONS SEGMENT ------------------------------");
        for(int l=0; l<instructions.getSize(); l += MainMemory.WORD_SIZE){
            BitSet bits = instructions.subBitSet(l, l+ MainMemory.WORD_SIZE);
            memoryManager.loadProgramInstructions(bits, (l / MainMemory.WORD_SIZE));
        }
    }

    /**
     * Carga los datos a memoria principal
     * @param data, los datos en un bitset
     */
    private void loadData(BitSet data){
        System.out.println("----------------------------- DATA SEGMENT ------------------------------");
        for(int l=0; l<data.getSize(); l += MainMemory.WORD_SIZE){
            BitSet bits = data.subBitSet(l, l+ MainMemory.WORD_SIZE);
            memoryManager.loadProgramData(bits, (l / MainMemory.WORD_SIZE));
        }
    }

}
