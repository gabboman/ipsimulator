package gabamagar.tests;

import gabamagar.util.*;
public class TestUtiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Probando submascaras");
		for(Integer i=8;i<33;i++){
			System.out.println("submascara "+i.toString()+": "+Utilidades.networkMaskFromInteger(i).toString());
		}

	}

}
