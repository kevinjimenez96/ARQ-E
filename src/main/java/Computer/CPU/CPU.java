package Computer.CPU;

import Computer.Utils.BitSet;

public class CPU {

    private long clock;
    private LocalBus localBus;
    //private Computer.IOModule.ExpansionBus expansionBus = new Computer.IOModule.ExpansionBus();

    public CPU(){
        localBus = new LocalBus();
        this.run();
    }

    public void run(){
        // Aqui se hace el while "infinito"
        BitSet bitSet = new BitSet("00000000011000000001000000000000");
        this.executeInstruction(localBus.decode(bitSet));
    }
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
    public void executeInstruction(Instruction instruction) {
        OpCode opCode = instruction.opCode;
        if(opCode.ordinal() <= 18){
            System.out.println(opCode.ordinal());
        }
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

