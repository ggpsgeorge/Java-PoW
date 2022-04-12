import java.security.Timestamp;

public class Block {
    
    private long nounce;
    private String previousHash;
    private String transactionData;
    private Timestamp timestamp;
    
    public Block(){
        this.nounce = 0;
        this.previousHash = "0";
        this.transactionData = "";
        this.timestamp = null;
    }

    public long getNounce() {
        return this.nounce;
    }

    public void setNounce(long nounce) {
        this.nounce = nounce;
    }

    public String getPreviousHash() {
        return this.previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getTransactionData() {
        return this.transactionData;
    }

    public void setTransactionData(String transactionData) {
        this.transactionData = transactionData;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
            " nounce='" + getNounce() + "'" +
            ", previousHash='" + getPreviousHash() + "'" +
            ", transactionData='" + getTransactionData() + "'" +
            ", timestamp='" + getTimestamp() + "'" +
            "}";
    }
}
