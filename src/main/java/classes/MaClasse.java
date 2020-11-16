package classes;

import exceptions.invalidListException;

public class MaClasse {

	public MaClasse() {
		System.out.println("This is a contructor");
	}

	public int biggestNumber(int[] list) {
		if (list == null) {
			throw new invalidListException("List is null");
		}
		int index, max = Integer.MIN_VALUE;
		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}

		return max;

	}
}
