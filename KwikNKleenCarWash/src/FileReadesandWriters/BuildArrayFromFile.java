package FileReadesandWriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildArrayFromFile {

    //array of size 3 to read in the 3 variables of the Package object
    private String [] packageInfoArray = new String[3];

    //Constructor
    public BuildArrayFromFile() {
    }//BuildArrayFromFile


    //READING IN FROM CREATE FILE one line at a time
    //file must be to the format of:
    //  Package1.txt
    //
    //  Platinum Package
    //  Description of service
    //  60
    //


    //Using the scanner object with the File object as the input parameter
    public void readInPackageDetails(int packageNumber){
        try {
            //pathname - (Windows PC) finds the system it is on and goes to desktop to find input files
            File myFile = new File(System.getProperty("user.home") + "\\OneDrive\\Desktop\\Package" + packageNumber + ".txt");

            //create Scanner to read from file
            Scanner myReader = new Scanner(myFile);

            //create position variable to loop through file to read in variables
            int position = -1;

            //while the file has another line it continues to read in
            while (myReader.hasNextLine()) {

                //set variable for next line
                String data = myReader.nextLine();

                //iterate position
                position++;

                //assign data variable to the array as the position rises
                packageInfoArray [position] = data;
            }

            myReader.close();
        } catch (
            //name the object 'e' of the FileNotFoundException class type
                FileNotFoundException e) {
            //personalised error message to print to console if needed
            System.out.println("An error occurred (File not found).");
            //print the object stack too.
            e.printStackTrace();
        }//catch

    }//readInPackageDetails

    //getter for PackageArray
    public String[] getPackageInfoArray() {
        return packageInfoArray;
    }//getMovieInfoArray

}//Class
