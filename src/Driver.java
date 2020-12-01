import java.io.*;
import java.util.Scanner;

public class Driver {

    public Driver(){
        try {
            File myObj = new File("AscendingData.txt");
            Scanner file = new Scanner(myObj);
            while (file.hasNextLine()) {
                int[] data = file.nextLine();
                this.insert(data[2], data[1], data[0]);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    /*
    public static void write (String filename, int[]x) throws IOException{
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i=0; i<x.length; i++)
            outputWriter.write(x[i] + "");
        outputWriter.flush();
        outputWriter.close();
    }
    */
}
