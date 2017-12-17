import java.util.List;

/**
 * 
 */

/**
 * @author jerry
 *
 */
public class Avg {


	/**
	 * Returns the average of all elements in the given list.
	 * @param posInts the list of positive integers, to take the average of
	 * @return the average of all elements in ints, if it is not empty
	 * @throws NoElementsException if ints is empty
	 * @throws InvalidElementException if ints contains negative elements
	 */
	public static double average(List<Integer> posInts) throws InvalidElementException, NoElementsException {
		if (posInts.isEmpty()) {
			throw new NoElementsException();
		}
		double sum = 0;
		for (Integer integer: posInts) {
			if (integer < 0) {
				throw new InvalidElementException(integer.toString());
			}
			sum += integer;
		}
		return sum / posInts.size();
	}



}
