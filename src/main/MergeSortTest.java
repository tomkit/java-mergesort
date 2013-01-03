package main;

import main.ArrayList;

import junit.framework.TestCase;

public class MergeSortTest extends TestCase {

	private ArrayList input;
	private ArrayList expected;
	
	private void assertEquals(ArrayList expected, ArrayList sorted) {
		if (expected == null && sorted == null) {
			System.err.println("Both of the lists passed in to assertEquals() is null");
			TestCase.assertTrue(true);
			return;
		}
		else if (expected == null || sorted == null) {
			System.err.println("One of the lists passed in to assertEquals() is null");
			TestCase.assertFalse(false);
			return;
		}
		
		int count = 0;
		for (Integer i : expected) {
			System.out.println(i + " " + sorted.get(count));
			TestCase.assertEquals(i, sorted.get(count));
			count++;
		}
		System.out.println("----");
	}
	
	public void setUp() {
		this.input = new ArrayList();
		this.expected = new ArrayList();
	}
	
	public void tearDown() {
		
	}
	
	public void testMergeSort_nullLists() {
		this.input = null;
		this.expected = null;
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_nullList() {
		this.input = null;
		this.expected.initialize(0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize0() {
		this.input.initialize();
		this.expected.initialize();
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize1PositiveNumber() {
		this.input.initialize(1);
		this.expected.initialize(1);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize1NegativeNumber() {
		this.input.initialize(-1);
		this.expected.initialize(-1);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize1ZeroNumber() {
		this.input.initialize(0);
		this.expected.initialize(0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize2() {
		this.input.initialize(1, 0);
		this.expected.initialize(0, 1);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize2SameValues() {
		this.input.initialize(0, 0);
		this.expected.initialize(0, 0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize2NegativeNumbers() {
		this.input.initialize(-1, -3);
		this.expected.initialize(-3, -1);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize3() {
		this.input.initialize(0, -1, -3);
		this.expected.initialize(-3, -1, 0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize3AllSame() {
		this.input.initialize(0, 0, 0);
		this.expected.initialize(0, 0, 0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize4() {
		this.input.initialize(0, -1, -3, 0);
		this.expected.initialize(-3, -1, 0, 0);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize5() {
		this.input.initialize(5, 4, 3, 2, 1);
		this.expected.initialize(1, 2, 3, 4, 5);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
	
	public void testMergeSort_listSize5_2() {
		this.input.initialize(5, 4, 3, 2, 10);
		this.expected.initialize(2, 3, 4, 5, 10);
		
		ArrayList sorted = MergeSort.sort(this.input);
		
		assertEquals(this.expected, sorted);		
	}
}
