package SortFile;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array  = new int[10]; //DEFINE ARRAY
        readFile(array);
        Arrays.sort(array);
        writeFile(array);

    } // END MAIN()

    //STORE INTO AN ARRAY
    public static void writeFile(int[] x) {
        try {
            FileOutputStream fout = new FileOutputStream("sort.txt");

            PrintStream myOutput = new PrintStream(fout);

            for (int i = 0; i < 10; i++) {
                myOutput.println(x[i]);
            }
        }
        catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    public static void readFile(int[] x) {
        int i = 0;

        try
        {
            FileInputStream fstream = new FileInputStream("newData");

            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ( (strLine = br.readLine()) != null )
            {
                x[i] = Integer.parseInt(strLine); // PARSE STRING AS AN INTEGER
                i++;

            }
            in.close();
        }
        catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
