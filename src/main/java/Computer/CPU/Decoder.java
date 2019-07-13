package Computer.CPU;

import java.util.HashMap;

import Computer.Utils.BitSet;

public class Decoder {

    private BitSet currentOpCode;
    private HashMap<Integer, OpCode> opCodesMap;

    public Decoder() {
    }

    /**
     * This method decodes a coded instruction.
     *
     * @param codedInstruction instruction to be decoded into its OpCode and
     *                         operands.
     * @return Instruction decoded with the corresponding OpCode and its operands.
     */
    public Instruction decode(BitSet codedInstruction) {
        OpCode opCode = OpCode.values()[codedInstruction.subBitSet(0, 6).toInt()];
        BitSet firstOperand = codedInstruction.subBitSet(6, 11);
        BitSet secondOperand = codedInstruction.subBitSet(11, 16);
        if (opCode.ordinal() <= 15 || (opCode.ordinal() <= 29 && opCode.ordinal() >= 18)) {
            if(opCode.ordinal() % 2 == 0 ){
                return new ThreeOpInstruction(opCode, firstOperand, secondOperand, codedInstruction.subBitSet(16, 21));
            }else{
                return new ThreeOpInstruction(opCode, firstOperand, secondOperand, codedInstruction.subBitSet(16, 33));
            }
        } else if ((opCode.ordinal() >= 32 && opCode.ordinal() <= 40)  || opCode.ordinal() == 16 ) {
            if(opCode.ordinal() % 2 == 0 ){
            return new TwoOpInstruction(opCode, firstOperand, secondOperand);
            }else{
                return new TwoOpInstruction(opCode, firstOperand, codedInstruction.subBitSet(11, 33));
            }
        } else if ( opCode.ordinal() == 17 ) {
            return new TwoOpInstruction(opCode, firstOperand, codedInstruction.subBitSet(11, 33));
        } else if ((opCode.ordinal() >= 32 && opCode.ordinal() <= 40)  || (opCode.ordinal() < 18 && opCode.ordinal() > 15)) {
            return new JumpInstruction(opCode, firstOperand, secondOperand, codedInstruction.subBitSet(16, 33));
        } else {
            return null;
        }
    }

    public BitSet getCurrentOpCode() {
        return currentOpCode;
    }

    public void setCurrentOpCode(BitSet currentOpCode) {
        this.currentOpCode = currentOpCode;
    }

}
