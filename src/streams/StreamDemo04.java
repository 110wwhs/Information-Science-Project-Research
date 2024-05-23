package streams;

import java.util.stream.IntStream;

public class StreamDemo04 {
    private static int result;
    public static void main(String[] args) {
        IntStream st = IntStream.rangeClosed(1, 10);
        st.forEach(n -> result =result + n);
        System.out.println(result);
        
    }
}
