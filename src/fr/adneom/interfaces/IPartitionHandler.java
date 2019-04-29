package fr.adneom.interfaces;

import java.util.ArrayList;
import java.util.List;

import fr.adneom.exception.InvalidTaille;
/**
 * Static utility method for partitioning a list
 * 
 * @author achelly
 *
 */
public interface IPartitionHandler {
	
	/**
	 * Returns consecutive {@linkplain List#subList(int, int) sublists} of a list,
	 * each of the same size (the final list may be smaller). For example,
	 * partitioning a list containing {@code [a, b, c, d, e]} with a partition size
	 * of 3 yields {@code [[a, b, c], [d, e]]} -- an outer list containing two inner
	 * lists of three and two elements, all in the original order.
	 * 
	 * 
	 * @param liste  the list to return consecutive sublists of
	 * @param taille the desired size of each sublist (the last may be smaller)
	 * @return a list of consecutive sublists
	 * @throws InvalidTaille if {@code taille} is nonpositive or
	 *                                  equal to 0
	 * 
	 */
	
	public static List<List<Object>> partition(List<Object> liste, int taille) throws InvalidTaille {
		if (taille <= 0)
			throw new InvalidTaille("Invalide taille parameter");
		List<List<Object>> result = new ArrayList<>();
		for (int i = 0; i < liste.size(); i += taille) {
			int toIndex = i + taille;
			if (toIndex > liste.size())
				toIndex = liste.size();
			result.add(liste.subList(i, toIndex));
		}
		return result;
	}

}
