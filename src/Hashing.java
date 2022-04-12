import java.math.BigInteger; 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
  
public class Hashing {
    public static byte[] hash_256(Block block)throws NoSuchAlgorithmException{
        String Sblock = block.toString();
        MessageDigest message = MessageDigest.getInstance("SHA-256");
        return message.digest(Sblock.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash){
        BigInteger number = new BigInteger(1, hash);

        StringBuilder hex = new StringBuilder(number.toString(16));
        
        while(hex.length() < 32){
            hex.insert(0, "0");
        }
        return hex.toString();
    }
}
