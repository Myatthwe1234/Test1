package co.jp.socio.diversity.vos.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.internet.MimeUtility;

public class StringEncoder {

	public static String CRYPTO_KEY = "socio";
	public static String CRYPTO_TYPE = "Blowfish";

	/**
	 * 暗号化値を元に戻す
	 * 
	 * @param encryptedStr
	 */
	public static String restoreEncrypt(String encryptedStr) {
		try {
			return StringEncoder.decrypt(StringEncoder.decodeBase64(encryptedStr));
		} catch (Exception e) {

		}
		return null;
	}

	public static byte[] decodeBase64(String base64) throws Exception {
		InputStream fromBase64 = MimeUtility.decode(new ByteArrayInputStream(base64.getBytes()), "base64");
		byte[] buf = new byte[1024];
		ByteArrayOutputStream toByteArray = new ByteArrayOutputStream();
		for (int len = -1; (len = fromBase64.read(buf)) != -1;)
			toByteArray.write(buf, 0, len);
		return toByteArray.toByteArray();
	}

	public static String decrypt(byte[] encrypted) throws Exception {
		SecretKeySpec sksSpec = new SecretKeySpec(CRYPTO_KEY.getBytes(), CRYPTO_TYPE);
		Cipher cipher = Cipher.getInstance(CRYPTO_TYPE);
		cipher.init(Cipher.DECRYPT_MODE, sksSpec);
		return new String(cipher.doFinal(encrypted));
	}

	/**
	 * 値を暗号化
	 * 
	 * @param text
	 */
	public static String createEncrypt(String text) {
		try {
			return StringEncoder.encodeBase64(StringEncoder.encrypt(text));
		} catch (Exception e) {

		}
		return null;
	}

	public static byte[] encrypt(String text) throws Exception {
		SecretKeySpec sksSpec = new SecretKeySpec(CRYPTO_KEY.getBytes(), CRYPTO_TYPE);
		Cipher cipher = Cipher.getInstance(CRYPTO_TYPE);
		cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, sksSpec);
		return cipher.doFinal(text.getBytes());
	}

	public static String encodeBase64(byte[] data) throws Exception {
		ByteArrayOutputStream forEncode = new ByteArrayOutputStream();
		OutputStream toBase64 = MimeUtility.encode(forEncode, "base64");
		toBase64.write(data);
		toBase64.close();
		return forEncode.toString("iso-8859-1");
	}
}
