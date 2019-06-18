public class BufferBlock {

    private BitSet data;

    private int address;

    public BufferBlock(){
        System.out.println("Constructor of Buffer Block");
    }

    public int getAddress() {
        return address;
    }

    public BitSet getData() {
        return data;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void setData(BitSet data) {
        this.data = data;
    }

}
