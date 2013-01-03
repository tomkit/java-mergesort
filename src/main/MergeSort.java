package main;

import main.ArrayList;

public class MergeSort {

	public static ArrayList sort(ArrayList list) {
		if (list == null) {
			return null;
		}
		
		if (list.size() <= 1) {
			return list;
		}
			
		ArrayList left = new ArrayList();
		ArrayList right = new ArrayList();
		ArrayList result = new ArrayList();
		
		int middle = list.size()/2;
		
		for (int i = 0 ; i < middle; i++) {
			left.add(list.get(i));
		}
		for (int i = middle; i < list.size(); i++) {
			right.add(list.get(i));
		}
		
		left = sort(left);
		right = sort(right);
		result = merge(left, right);
		
		return result;
	}
	
	private static ArrayList merge(ArrayList left, ArrayList right) {
		ArrayList result = new ArrayList();
		
		while (left.size() > 0 && right.size() > 0) {
			Integer leftVal = left.get(0);
			Integer rightVal = right.get(0);
			
			if (leftVal <= rightVal) {
				result.add(leftVal);
				left.remove(0);
			}
			else {
				result.add(rightVal);
				right.remove(0);
			}				
		}
		
		if (left.size() > 0) {
			result.addAll(left);			
		}
		else {
			result.addAll(right);
		}
		
		return result;
	}
}
