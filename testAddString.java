package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {

        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("Cu","ty");
        assertEquals("Cuty",result);

        result = addString.addStrings("Par","eek");
        assertEquals("Pareek",result);
    }

}
