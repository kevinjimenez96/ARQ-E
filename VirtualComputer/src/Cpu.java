import java.util.BitSet;

public class Cpu {

    private long clock;
    // private LocalBus localBus = new LocalBus();
    //private ExpansionBus expansionBus = new ExpansionBus();

    /**
     *
     */
    Cpu(){
        System.out.println("Constructor of Cpu class");
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
        return  new BitSet();
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
    /*private Instruction decode (BitSet instruction){

    }*/

    /**
     *
     * @param instruction
     */
    /*
    private void excecuteALUInstruction(Instruction instruction){

    }*/
}
