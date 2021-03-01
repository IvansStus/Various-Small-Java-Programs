/**
 *  Program #3a
 *  CSV code to read in a file
 *  CS108-2
 *  2/21/18
 *  @author Ivan Stus
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class WriteCSV {
    public static void main(String[] args) throws FileNotFoundException {

        //  Grading program needs hardcoded filename. Oh, well. "
        String inputFilename = "coords.txt";
        String outputFilename = changeFileExtToCsv(inputFilename);  

        // Open files
        Scanner input = new Scanner(new File(inputFilename));//TODO:  call method to open input file
        PrintWriter output = new PrintWriter(outputFilename);//TODO:  call method to open output file

        // TODO:  Read input line, replace all spaces with commas, 
        //               and write output line        
        while (input.hasNextLine()) {
        	String word = input.nextLine();
        	word = word.replace(' ', ',');
        	output.println(word);        	
        }        
        	input.close();
        	output.close();
        // TODO: close streams


    }
    /**
     * Changes file extension to ".csv"
     * @param filename
     * @return
     */
    public static String changeFileExtToCsv(String filename) {
        return filename.substring(0,filename.lastIndexOf('.')) + ".csv";
    }
    /**
     * Open input for reading
     * @param filename
     * @return
     */
    public static Scanner openInput(String filename) {
        Scanner in = null;
        // TODO:  surround the next two lines with a try block
        try {
            File infile = new File(filename);
            in = new Scanner(infile);
        }
        //  TODO:  surround the next two lines with a catch block
        catch(FileNotFoundException e) {
            System.out.println(filename + " could not be found");
            System.exit(0);
        }
        return in;
    }
    /**
     * Open output for writing
     * @param filename
     * @return
     * @throws FileNotFoundException 
     */
    public static PrintWriter openOutput(String filename) throws FileNotFoundException {
    	PrintWriter open = new PrintWriter(filename);
    	return open;
        //TODO:  Write method to open a PrintWriter ;  use openInput() as a guide
    }
    public String getIdentificationString() {
		return ("Program 3a, Ivan Stus");
	}
}