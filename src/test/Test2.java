package test;

public class Test2 {

	private String s;
	
	public Test2() {
		this(null);
	}
	
	public Test2(String s) {
		this.s = s;
	}
	
	public int foo() {
		return this.s.length();
	}
	
	public void bar() {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello!");
		}
	}
	
	public void bar2() {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello!");
		}
	}
	
}
