package calcul;

public class Calculette {

	/*
	 * Addition
	 */

	public float getAddition(float opera, float operb) {
		return opera + operb;

	}

	/*
	 * Multiplication
	 */

	public float getMultiplication(float opera, float operb) {
		return opera * operb;

	}

	/*
	 * Soustraction
	 */
	public float getSoustraction(float opera, float operb) {
		return opera - operb;

	}

	/*
	 * Division erreur non gérée par le web service
	 */
	public float getDivision(float opera, float operb) {
		if (operb != 0)
			return opera / operb;
		else
			return 0;
	}
}
