

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptDecrypt {

	// method for Encryption
	public static String encrypt(String plainText) {
		String encryptedText = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			byte[] key = "ABCDEFGHIJKLMNOP".getBytes("UTF-8");
			SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			IvParameterSpec ivparameterspec = new IvParameterSpec(key);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivparameterspec);
			byte[] cipherText = cipher.doFinal(plainText.getBytes("UTF8"));
			Base64.Encoder encoder = Base64.getEncoder();
			encryptedText = encoder.encodeToString(cipherText);

		} catch (Exception E) {
			System.err.println("Encrypt Exception : " + E.getMessage());
		}
		return encryptedText;
	}

	// method for decryption
	public static String decrypt(String encryptedText) {
		String decryptedText = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			byte[] key = "ABCDEFGHIJKLMNOP".getBytes("UTF-8");
			SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			IvParameterSpec ivparameterspec = new IvParameterSpec(key);
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivparameterspec);
			Base64.Decoder decoder = Base64.getDecoder();
			byte[] cipherText = decoder.decode(encryptedText.getBytes("UTF8"));
			decryptedText = new String(cipher.doFinal(cipherText), "UTF-8");

		} catch (Exception E) {
			System.err.println("decrypt Exception : " + E.getMessage());
		}
		return decryptedText;
	}
	
	public static void main(String[] args) { 
	
	EncryptDecrypt pp = new EncryptDecrypt();
	String encrypt=pp.encrypt("AAUFK6256C");
	System.out.println(encrypt);
	String decript=pp.decrypt(encrypt);
	System.out.println(decript);
	

	
	
	}

}
