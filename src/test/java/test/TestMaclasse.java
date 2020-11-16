package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import classes.MaClasse;
import exceptions.invalidListException;

public class TestMaclasse {

	// 1- Cas Nominal
	@Test
	public void biggestWithNominalCase() {
		MaClasse mc = new MaClasse();
		int[] list = new int[] { 7, 8, 9 };
		int biggest = mc.biggestNumber(list);
		assertEquals(9, biggest);

	}

	// 2- Touse les ints de la lsite sont les memes

	// 3- Le tableau est vide
	@Test
	public void biggestWithEmptyCase() {
		MaClasse mc = new MaClasse();
		int[] list = new int[] {};
		int biggest = mc.biggestNumber(list);
		assertEquals(Integer.MIN_VALUE, biggest);

	}

	// 4- Tableau Null

	@Test(expected = invalidListException.class)
	public void biggestWithNullCase() {
		MaClasse mc = new MaClasse();
		int[] list = null;
		int biggest = mc.biggestNumber(list);

	}

	// 5- La liste possede des entiers negatives
	@Test
	public void biggestWithNegativeCase() {
		MaClasse mc = new MaClasse();
		int[] list = new int[] { -12, -8, -9 };
		int biggest = mc.biggestNumber(list);
		assertEquals(-8, biggest);

	}

}
