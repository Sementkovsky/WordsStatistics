import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FiWriter {
    private String dir = "C:\\Users\\shara\\Documents\\Алексей\\Words";
    private String textFile = "file2.txt";
    private File fileToRead = new File(dir, "Statistics_" + textFile);
    FileWriter fr = new FileWriter(fileToRead);

    public FiWriter() throws IOException {
    }

    public void write(Map<String,Long> map){

    }
}
