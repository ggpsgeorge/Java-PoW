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

    public static boolean isHashOk(String hash){
        if(hash.substring(0, 3).equals("fff")){
            return true;
        }

        return false;
    }

    public static String proof_of_work(Block block) throws NoSuchAlgorithmException{
        boolean found  = false;
        String hash = "";

        while(true){

            hash = toHexString(hash_256(block));
            found = isHashOk(hash);
            if(found == true){break;}
            block.setNounce(block.getNounce()+1);
        }

        return hash;
    }

    public static String findHash(Block block) throws NoSuchAlgorithmException{
        return toHexString(hash_256(block));
    }
}
