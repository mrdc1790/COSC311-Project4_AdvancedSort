import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    String[] allData = new String[]{"AscendingData.txt","DescendingData.txt","RandomData.txt"};
    String[] allSorts = new String[]{"Quick Sort","Merge Sort","Heap Sort"};

    public List<Integer> readIn(String fileName){
        List<Integer> data = new ArrayList<Integer>();
        try{
            File myObj = new File(fileName);
            Scanner file = new Scanner(myObj);
            while (file.hasNextLine()) {
                int num = file.nextInt();
                data.add(num);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static void write (String filename, Integer[]x) throws IOException{
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i=0; i<x.length; i++)
            outputWriter.write(x[i] + "\n");
        outputWriter.flush();
        outputWriter.close();
    }

    public void files() throws IOException{
        String fileName="";
        Integer[] numbers;
        long startTime;
        long endTime;
        for (int loopNum = 0; loopNum<allData.length; loopNum++){
            for (int i=0; i<allData.length; i++){
                Scanner scnr = new Scanner(System.in);
                System.out.println("Please enter file name to be saved to: ");
                fileName = scnr.next();
                numbers = readIn(allData[i]).toArray(new Integer[0]);
                startTime = System.currentTimeMillis();
                switch(loopNum){
                    case 0:
                        QuickSort.quickSort(numbers, 0, numbers.length-1);
                    case 1:
                        //MergeSort.mergeSort(numbers, 0, numbers.length-1);
                    case 2:
                        //HeapSort.heapSort(numbers, 0, numbers.length-1);
                }
                endTime = System.currentTimeMillis();
                System.out.println(allSorts[loopNum]+" "+allData[i]+": That took " + (endTime - startTime) + " milliseconds");
                write(fileName, numbers);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Driver driverRef = new Driver();
        driverRef.files();
    }
}
