import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class allows you to convert a csv file to arff file.
 * @author David Humphries Mist352 001
 *
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location
	 */
	public Csv2Arff(String Location)
	{
		csvFileLocation=Location;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 */
	public void Convert2Arff(String theLocation) throws FileNotFoundException
	
	{ 	double[][] data = new double[100][100];
	//String to hold variable name;
	String strFileName;
	//Instance to open the text files
	File textFile=new File(strFileName);
	//Scanner to iterate thought the file
	Scanner reader = new Scanner(textFile);
	//Iterate through the file.
	//This read the file, one line at a time
	int row=0 ,col =0;
	//Skip the first line
	reader.nextLine();
	//Read through the file
	while(reader.hasNext());
	{
		String[] strLine =reader.nextLine().split(",");
	
		String[] rowData = new String[strLine.length];
		
		for (int col1=0; col1 < strLine.length; col++) {
	rowData[col] = strLine[col];
		}
	data.add(rowData);
	
	reader.close();
	
	
	
	
	col++;
	}
	col=0;
	System.out.printf("\n");
	
		System.out.println("Done =)")
		
			
	
	
	/**
	 * This method should red the text file to a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [column][row]
	 */
	public static String RetrieveCell(String theFile, int row, int column)
	 for (int intRow=0; data(intRow).length; (intCol++));
			
	{ System.out.printf("Cell Value: ", data(intRow)(intCol));
	
		
		System.out.printf("\n",)
		String strData2Return="";
		
		return strData2Return;
	}

}
