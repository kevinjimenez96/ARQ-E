package Computer;

import Computer.MainMemory.MainMemory;
import Computer.Utils.BitSet;

public class MemoryManager {

    private MainMemory mainMemory = new MainMemory();

    /**
     *
     */
    public MemoryManager(){
        System.out.println("Constructor of Computer.MemoryManager class");
    }

    /**
     *
     */
    public void allocate(BitSet address){

    }

    public void loadProgramData(BitSet programData, int index){
        mainMemory.loadProgramData(programData, index);
    }

    public void loadProgramInstructions(BitSet programInstruction, int index){
        mainMemory.loadProgramInstruction(programInstruction, index);
    }

}
