
public class Main {
	
	public static short countBits(int x) {
		short numBits = 0;
		while (x != 0) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	/**
	 * 	This solution runs in O(n) time
	 * where n is the word size of x.
	 * @param x
	 * @return the parity of x
	 */
	public static short parity(long x) {
		short result = 0;
		while (x != 0) {
			result ^= (x & 1);
			x >>>= 1;
		}
		return result;
	}
	
	/**
	 * 	This solution runs in O(k) time
	 * where k is the number of set bits of x.
	 * @param x
	 * @return the parity of x
	 */
	public static short parity1(long x) {
		short result = 0;
		while (x != 0) {
			result ^= 1; // flip the parity
			x &= (x - 1); // drop the lowest set bit
		}
		return result;
	}

	/** TODO: implement the lookup table solution
		public static short parity2(long x);
	*/

	/**
	 * 	This solution runs in O(log n) where n
	 * is the word size of x. It uses associativity
	 * of XOR to dramatically speed up computation.
	 * @param x
	 * @return the parity of x
	 */
	public static short parity3(long x) {
		x ^= x >>> 32;
		x ^= x >>> 16;
		x ^= x >>> 8;
		x ^= x >>> 4;
		x ^= x >>> 2;
		x ^= x >>> 1;
		return (short) (x & 0x1);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
//			System.out.format("Set bits of %d: %d%n", i, countBits(i));		
			System.out.format("Parity of %d: %d%n", i, parity3(i));
		}
	}

}
