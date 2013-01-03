package main;

public class ArrayList extends java.util.ArrayList<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void initialize(int ... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			super.add(numbers[i]);
		}
	}
}
