import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author David Humphries Mist352 001
 */
 // used chat gpt to help
 
public class HW4 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
	//***********************************************************************************************
		// Keep lines 21 - 27 as is
        //Location of the data folder which has all csv files
		String directoryPath = "src/Data"; 
		//String that has the names of all csv files, without the directory.
        String[] csvFileNames = findCSVFileNames(new File(directoryPath));
    //***********************************************************************************************
        //to do:
        	// 1. print out the array of csv files
        PrintArray(csvFileNames);
        
        File myFile = new File(csvFileNames[0]);
        Scanner scn = new Scanner(myFile);
        while(scn.hasNext())
        	
        {
        System.out.println(scn.nextLine());
        }
        
        	// 2. access the array csvFileNames add the directory to each file name. So, the file Ant1.csv should become src/Data/Ant1.csv   
        for (int intRow=0; intRow<csvFileNames.length; intRow++)
        { csvFileNames[intRow] = directoryPath + "/" + csvFileNames[intRow];
        
        	//second for to control 
        	
    
        }
        	// 3. print out the array of csv files again after adding directory to each
        PrintArray(csvFileNames);
       
        	// 4. Go through the array again (using while / for loop), every time you access a cell, create an object of type Csv2Arff.
       
        
        	// 5. Call the proper method to write the arff file for the current csv file in the loop.
  
        for (String csvFileName : csvFileNames) {
        	Csv2Arff converter = new Csv2Arff(csvFileName);
        	
        }
        	// 6. Ask use for name of a file to look in, and then column number and row number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to look in: ");
        String fileNameToLookIn = scanner.nextLine();
        
        Csv2Arff fileToLookIn = new Csv2Arff(directoryPath + "/" + fileNameToLookIn);
        System.out.print("Enter the colum number: ");
        int colNumber = scanner.nextInt();
        System.out.print("Enter the row number: ");
        		int rowNumber = scanner.nextInt();
        		
        		// 6.1 Printout the value from that file.
             Csv2Arff userCsv2Arff = new Csv2Arff(fileNameToLookIn);
             String cellValue = userCsv2Arff.RetrieveCell(fileNameToLookIn, rowNumber, colNumber);
             
             System.out.println("Value at column" + colNumber + "and row" + rowNumber + ":" + cellValue);
             
             scn.close();
             
             
               
    }
	/**
	 *  You need to code this
	 *  This method simply prints out the content of any given String array
	 * @param array: The array to print
	 */
	public static void PrintArray(String[] array)
	{
	for (int intCounter =0; intCounter < array.length; intCounter++)
	
	{
	System.out.println("stc//Data//" + array[intCounter]);
	}
	}

	/**
	 * Keep as is.
	 * This method finds all csv files in a given directory
	 * @param directory: location of all csv files. This is passed from the main
	 * @return: Array of strings, each strring represents the name the location of a csv file
	 */
    private static String[] findCSVFileNames(File directory) {
        List<String> csvFileNames = new ArrayList<>();
        addCSVFileNames(directory, csvFileNames);
        return csvFileNames.toArray((new String[0]));
    }

    /**
     * Keep as is.
     * This method is magical. We Do not care what it does.
     * @param directory
     * @param csvFileNames
     */
    private static void addCSVFileNames(File directory, List<String> csvFileNames) {
        if (directory.isDirectory()) {
            // Define a filter for CSV files
            FilenameFilter csvFilter = (dir, name) -> name.toLowerCase().endsWith(".csv");

            // List all CSV files in the current directory
            File[] files = directory.listFiles(csvFilter);
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        csvFileNames.add(file.getName());
                    }
                }
            }

            // List all directories in the current directory
            File[] dirs = directory.listFiles(File::isDirectory);
            if (dirs != null) {
                for (File dir : dirs) {
                    addCSVFileNames(dir, csvFileNames); // Recursive call
                }
            }
        }
    }}


	


