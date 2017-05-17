package com.spriithy.dateparser;

public class Main {

	// A simple test using the example text given in the e-mail I have been
	// sent. The output produced matches the one in the mail.
	public static void main(String[] args) {
		Parser parser = new Parser("Marvin Lee Minsky at the Mathematics Genealogy Project; 20 May 2014 Marvin Lee Minsky at the AI Genealogy Project. {reprint 18 September 2011) Personal page for Marvin Minsky. web.media.mit.edu. Retrieved 23 June 2016. Admin (January 27, 2016). Official Alcor Statement Concerning Marvin Minsky. Alcor Life Extension Foundation. Retrieved 2016-04-07. IEEE Computer Society Magazine Honors Artificial Intelligence Leaders DigitalJournal.com. August 24, 2011. Retrieved September 18, 2011.  Press release source: PRWeb (Vocus). Dan David prize 2014 winners. May 15, 2014. Retrieved May 20, 2014.");
		parser.parse();

		// Print the output
		System.out.println(Dates.getPrintString());
	}

}