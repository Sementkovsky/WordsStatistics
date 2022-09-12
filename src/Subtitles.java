import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class Subtitles {
    public void get(URL urlSub) throws IOException {

        URL url = new URL("https://www.google.com.ua/images/srpr/logo11w.png");
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, new File("c:/google.png").toPath());
    }
}