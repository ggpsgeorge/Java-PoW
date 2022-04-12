import java.util.ArrayList;

public class Blockchain {

    private Block block;
    private ArrayList<Block> chain;

    public Blockchain(){
        this.block = new Block();
        this.chain = null;
    }

    public Block getBlock() {
        return this.block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public ArrayList<Block> getChain() {
        return this.chain;
    }

    public void setChain(ArrayList<Block> chain) {
        this.chain = chain;
    }

}
