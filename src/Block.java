import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Block {
    
    private long nounce;
    private String previousHash;
    private String transactionData;
    private String timestamp;
    
    public Block(String previousHash, String transactionData){
        this.nounce = 0;
        this.previousHash = previousHash;
        this.transactionData = transactionData;
        this.timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
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

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
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
