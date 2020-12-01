import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public Driver(){
        try {
            File myObj = new File("AscendingData.txt");
            Scanner file = new Scanner(myObj);
            List<Integer> data = new ArrayList<Integer>();
            while (file.hasNextLine()) {
                int num = file.nextInt();
                data.add(num);
            }
            file.close();

            Integer[] numbersArray = data.toArray(new Integer[0]);
            for (Integer n: numbersArray){
                System.out.println(n);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    /*
    public void sort (int ID){
        QuickSort.QuickSort(new BST_IndexRecord(IDtoBeEntered, indexToInsertAt));
    }
    public static void write (String filename, int[]x) throws IOException{
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i=0; i<x.length; i++)
            outputWriter.write(x[i] + "");
        outputWriter.flush();
        outputWriter.close();
    }
    */

    public static void main(String[] args){
        Integer[] numbersArray =
    }
}
