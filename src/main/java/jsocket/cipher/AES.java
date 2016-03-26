package jsocket.cipher;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Cryptographic service that uses the AES algorithm
 * This is a symmetric encryption algorithm
 * @author Will Czifro
 * @version 0.1.0
 */
public interface AES extends Crypto {

    void setKey(String key);

    String getKey();

    static String generateKey() {
        // todo: implement me
        SecureRandom rand = new SecureRandom();
        return new BigInteger(130, rand).toString(32);
    }
}
