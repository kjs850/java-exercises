package try_with_resource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceExample {

    // https://www.mkyong.com/java/try-with-resources-example-in-jdk-7/
    public static void main(String[] args) {
//        BufferedReader br = null;;
//        try {
//            String line;
//            br = new BufferedReader(new FileReader("C:\\testing.txt"));
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (br != null)br.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\\\testing.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
