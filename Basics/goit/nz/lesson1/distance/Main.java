package goit.nz.lesson1.distance;

import goit.nz.lesson1.Parser;
import goit.nz.lesson1.Reader;

public class Main {
	public static void main(String[] args) {
		Reader console = new Reader(DistanceStrings.MAIN_PROMPT);
		Parser parser = new Parser(DistanceStrings.PARSER_WARNING);
		do {
			int numberOfMins = 0;
			do {
				numberOfMins = parser.getFirstIntFromString(console.readLine());
			} while (!parser.isParsingSuccessful || numberOfMins <= 1);
			DistanceFinder finder = new DistanceFinder(numberOfMins);
			finder.find();
		} while (console.askForRepeat());
	}
}
