package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemo07 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\koomi\\OneDrive\\JavaProject_0.1\\src\\streams\\Java.txt");
            Stream<String> st;

            // Files 클래스의 lines()
            st = Files.lines(path, Charset.defaultCharset());
            st.forEach(System.out::println);

            // BufferedReader 클래스의 lines()
            File file = path.toFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            st = bufferedReader.lines();
            st.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
