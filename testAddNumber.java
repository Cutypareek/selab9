package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(100, 200);
        assertEquals (300,result);

        result = addNum.addNumbers(20, 10);
        assertEquals (30, result);
    }

}
