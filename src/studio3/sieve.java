package studio3;

public class sieve {
	public static void main(String[] args) {
		int limit = 40;
		Boolean [] numbers = new Boolean [limit];
		// create the array
		for (int i=0; i < limit; i++) {
			numbers[i] = true;
		}
		for (int j=0; j<limit; j++) {
			for (int i=2; i<limit-2; i++) {
				for (int n=2; n<limit-2; n++) {
					if (j == n*i)
						numbers[j] = false;
				}
			}
		}
		for (int i=0; i < limit; i++) {
			if (numbers[i]==true) {
				System.out.println(i+1 + " ");
			}
		}
	}
}
