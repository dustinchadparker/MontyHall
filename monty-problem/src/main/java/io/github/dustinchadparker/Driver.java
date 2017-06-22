package io.github.dustinchadparker;
import io.github.dustinchadparker.CarsAndGoats;

/**
 * This is the main entry point to CarsAndGoats. This program is based upon
 * the famous Monty Hall Problem. See CarsAndGoats for more info.
 */

/**
 * This class is the main entry point of the program.
 * 
 * @author Dustin Parker
 * 
 * @version December 2, 2014
 *
 */
public class Driver {

	/**
	 * This is the main entry point into the program, and is ALWAYS needed in
	 * EVERY program. Learn public main.
	 * 
	 * @param args
	 *            none
	 */
	public static void main(String[] args) {

		/**
		 * This just creates an "object"/clone of the RouletteTable class and
		 * executes the RUN() method in it.
		 */
		CarsAndGoats tui = new CarsAndGoats();
		tui.run();

	}

}
