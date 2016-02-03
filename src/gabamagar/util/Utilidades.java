package gabamagar.util;

import java.util.regex.Pattern;

public class Utilidades {
	// http://stackoverflow.com/questions/5667371/validate-ipv4-address-in-java
	// Opto por una expresion regular mejor que añadir una dependencia más.
	private static final Pattern PATRON_IP = Pattern
			.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	private static final Pattern PATRON_MAC = Pattern
			.compile("/^(?:[[:xdigit:]]{2}([-:]))(?:[[:xdigit:]]{2}\1){4}[[:xdigit:]]{2}$/");

	public static String networkMaskFromInteger(Integer mask) {
		if (mask > 32 || mask < 8) {
			throw new IllegalArgumentException(
					"NetworkMaskFromInteger must recive a number between 0 and 32");
		}
		String res = "";

		Integer timesWith255 = mask / 8;
		Integer timesWith0 = 4 - timesWith255 - 1;// 1 for the calculed one

		for (Integer i = 0; i < timesWith255; i++) {// add 255 n times
			res = res + "255.";
		}
		if (timesWith255 != 4) {
			Integer a = intPow(2, 8 - (mask % 8));

			a = 256 - a;
			res = res + a.toString() + ".";
		}

		for (Integer i = 0; i < timesWith0; i++) {// add 255 n times
			res = res + "0.";
		}

		return res.substring(0, res.length() - 1);
	}

	public static Integer intPow(Integer x, Integer n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		if (n < 0) { // always 1^xx = 1 && 2^-1 (=0.5 --> ~ 1 )
			if (x == 1 || (x == 2 && n == -1))
				return 1;
			else
				return 0;
		}
		if ((n & 1) == 0) { // is even
			long num = intPow(x * x, n / 2);
			if (num > Integer.MAX_VALUE) // check bounds
				return Integer.MAX_VALUE;
			return (int) num;
		} else {
			long num = x * intPow(x * x, n / 2);
			if (num > Integer.MAX_VALUE) // check bounds
				return Integer.MAX_VALUE;
			return (int) num;
		}
	}

	public static boolean validar_ip(final String ip) {
		return PATRON_IP.matcher(ip).matches();
	}

}
