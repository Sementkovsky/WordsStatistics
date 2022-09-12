import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class FiReader {
    private String dir = "C:\\Users\\shara\\Documents\\Алексей\\Words";
    private String textFile = "file3.txt";
    private File fileToRead = new File(dir, textFile);







    public Stream<String> WordReaderToStream () throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fileToRead));
        return br.lines();



    }


}

