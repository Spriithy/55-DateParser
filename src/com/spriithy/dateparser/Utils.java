package com.spriithy.dateparser;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Some useful functions are wrapped here.
 * 
 * @author Théophile Dano
 *
 */
public class Utils {

	/**
	 * A filter is just a function that is used to filter Collections.
	 * 
	 * @author Théophile Dano
	 *
	 * @param <T>
	 *            The kind of Objects to filter.
	 */
	public interface Filter<T> {

		/**
		 * A filter returns true if the Object verifies the filter condition,
		 * false otherwise.
		 * 
		 * @param t
		 *            The object to filter
		 * @return Whether the Object must be filtered or not
		 */
		public boolean filter(T t);
	}

	/**
	 * Apply a com.spriithy.dateparser.Utils.Filter to a Collection.
	 * 
	 * @param col
	 *            The Collection to apply the filter to
	 * @param f
	 *            The filter to use
	 * @return The ArrayList containing all filtered elements of the Collection
	 */
	public static <T> ArrayList<T> filter(Collection<T> col, Filter<T> f) {
		ArrayList<T> filtered = new ArrayList<>();
		for (T t : col)
			if (f.filter(t))
				filtered.add(t);
		return filtered;
	}

}
