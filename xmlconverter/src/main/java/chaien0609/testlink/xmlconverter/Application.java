package chaien0609.testlink.xmlconverter;

import chaien0609.testlink.xmlconverter.converter.XMLConverter;

public class Application {

	public static void main(String[] args) {
		XMLConverter converter = new XMLConverter();
		converter.writeToXLSXFile(args[0], args[1]);
	}

}
