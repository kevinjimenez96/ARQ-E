package Computer.CPU;

import Computer.Utils.BitSet;

public class CPU {

    private long clock;
    private LocalBus localBus = new LocalBus();
    //private Computer.IOModule.ExpansionBus expansionBus = new Computer.IOModule.ExpansionBus();

    /**
     *
     */
    public CPU(){
        System.out.println("Constructor of Computer.CPU.CPU class");
    }

    /**
     *
     * @param address
     */
    public void fetchInstruction(int address){

    }

    /**
     *
     */
    public void excecuteInstruction(){

    }

    /**
     *
     * @param adress
     * @return
     */
    public BitSet load(int adress){
        return  new BitSet(0);
    }


    /**
     *
     * @param adress
     * @return
     */
    public void store(int adress, BitSet data){

    }

    /**
     *
     */
    private void excecuteLoad(){

    }

    /**
     *
     */
    private void excecuteStore(){

    }

    /**
     *
     * @param instruction
     * @return
     */
    /*private Computer.CPU.Instruction decode (Computer.Utils.BitSet instruction){

    }*/

    /**
     *
     * @param instruction
     */
    /*
    private void excecuteALUInstruction(Computer.CPU.Instruction instruction){

    }*/
}
