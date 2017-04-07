package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Test2;

public class TestCase1 {

	@Test 
	public void test() {
		Test2 t = new Test2();
		t.foo();
		
	}
	
	
	@Test (expected=NullPointerException.class)
	public void test2() {
		Test2 t = new Test2();
		t.foo();
	}

}
