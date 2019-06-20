package Computer.CPU;

import Computer.Utils.BitSet;

public class CPU {

    private long clock;
    private LocalBus localBus = new LocalBus();
    //private Computer.IOModule.ExpansionBus expansionBus = new Computer.IOModule.ExpansionBus();

    /**
     * This method fetches an instruction that is stored in a certain address.
     *
     * @param address main memory index from where instruction will be fetched.
     */
    public void fetchInstruction(int address) {

    }

    /**
     * This method sends
     */
    public void executeInstruction() {

    }

    /**
     * @param address
     * @return
     */
    public BitSet load(int address) {
        return new BitSet(0);
    }


    /**
     * @param address
     */
    public void store(int address, BitSet data) {

    }

    /**
     *
     */
    private void executeLoad() {

    }

    /**
     *
     */
    private void executeStore() {

    }

    /**
     * @param codedInstruction to be decoded.
     *
     * @return Instruction
     */
    private Instruction decode(BitSet codedInstruction) {
        return null;
    }

}

