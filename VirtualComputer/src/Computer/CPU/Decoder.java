package Computer.CPU;

import java.util.HashMap;

import Computer.Utils.BitSet;

public class Decoder {

    private BitSet currentOpCode;
    private HashMap<Integer, OpCode> opCodesMap;

    public Decoder() {
        /*
         * // Arithmetic opCodesMap.put(0, OpCode.ADD); opCodesMap.put(1, OpCode.ADDI);
         * opCodesMap.put(2, OpCode.SUB); opCodesMap.put(3, OpCode.SUBI);
         * opCodesMap.put(4, OpCode.MUL); opCodesMap.put(5, OpCode.MULI);
         * opCodesMap.put(6, OpCode.DIV); opCodesMap.put(7, OpCode.DIVI);
         * opCodesMap.put(8, OpCode.MOD); opCodesMap.put(9, OpCode.MODI);
         * 
         * // Logic opCodesMap.put(10, OpCode.AND); opCodesMap.put(11, OpCode.ANDI);
         * opCodesMap.put(12, OpCode.OR); opCodesMap.put(13, OpCode.ORI);
         * opCodesMap.put(14, OpCode.XOR); opCodesMap.put(15, OpCode.XORI);
         * opCodesMap.put(16, OpCode.NOT); opCodesMap.put(17, OpCode.NOTI);
         * 
         * // Shift opCodesMap.put(18, OpCode.SAL); opCodesMap.put(19, OpCode.SALI);
         * opCodesMap.put(20, OpCode.ADD); opCodesMap.put(21, OpCode.ADDI);
         * opCodesMap.put(22, OpCode.SUB); opCodesMap.put(23, OpCode.SUBI);
         * opCodesMap.put(24, OpCode.MUL); opCodesMap.put(25, OpCode.MULI);
         * opCodesMap.put(26, OpCode.DIV); opCodesMap.put(27, OpCode.DIVI);
         * opCodesMap.put(28, OpCode.MOD); opCodesMap.put(29, OpCode.MODI);
         */

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
