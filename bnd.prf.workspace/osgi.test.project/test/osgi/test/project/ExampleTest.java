package osgi.test.project;

import static org.junit.Assert.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() throws Exception{
		int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
	    System.err.println("Max AES Keylength: " + maxKeyLen + " --> " + (maxKeyLen > 128 ? "Unlimited " : "Limited ") + "Security.");
        KeyGenerator.getInstance("SunTls12Prf");
	}
}
