package de.itemis.mosig.bnd.prf.test;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testApp() throws Exception {
		int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
	    System.out.println(maxKeyLen);
        KeyGenerator.getInstance("SunTls12Prf");
    }
}
