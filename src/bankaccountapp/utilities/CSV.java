package bankaccountapp.utilities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    private static Throwable e;

    //this function will read data from a CSV file and return as a list
    public static List<String[]> read(String file) throws IOException {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null);
            Throwable e = e;


            {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
            catch (FileNotFoundException e) {
            System.out.println(" COULD NOT FIND FILE ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }
}
