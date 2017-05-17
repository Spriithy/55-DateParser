package com.spriithy.dateparser;

/**
 * The Month class is held responsible of registering each date of a given
 * month. It uses an integer array that holds the occurrence count for each day
 * of the given month.
 * 
 * @author Théophile Dano
 *
 */
public class Month {
	/**
	 * The Regular Expression Patterns for Months. Matches 3-character months,
	 * complete CamelCase or lower case months.
	 */
	public static String[] monthPatterns = { "[Jj]an(?:uary)?", "[Ff]eb(?:ruary)?", "[Mm]ar(?:ch)?", "[Aa]pr(?:il)?",
			"[Mm]ay", "[Jj]un(?:e)?", "[Jj]ul(?:y)?", "[Aa]ug(?:ust)?", "[Ss]ep(?:tember)?", "[Oo]ct(?:ober)?",
			"[Nn]ov(?:ember)?", "[Dd]ec(?:ember)?" };

	/**
	 * The month number (January = 01, ...)
	 */
	public int month;

	/**
	 * The internal array for day occurrences.
	 */
	public int[] days;

	public Month(int month) {
		this.month = month;
		days = new int[31];
	}

	/**
	 * Registers a new day occurrence by incrementing its occurrence count by 1.
	 * 
	 * @param day
	 *            The n-th day of the given month
	 */
	public void addDay(int day) {
		days[day - 1]++;
	}

	/**
	 * Sums all occurrences of dates in the month. If this returns 0, then the
	 * month holds no registered date.
	 * 
	 * @return the amount of dates registered in this Month
	 */
	public int datesCount() {
		int sum = 0;
		for (int d : days)
			sum += d;
		return sum;
	}

	public String toString() {
		String str = String.format("\t- %02d\n", month);
		for (int i = 0; i < 31; i++)
			if (days[i] > 0)
				str += String.format("\t\t- %02d (%d)\n", i + 1, days[i]);
		return str;
	}

}