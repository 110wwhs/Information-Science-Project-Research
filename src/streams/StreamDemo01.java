package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "서울", "경기");


        // Old Style
        // Iterator<String> it = cities.iterator();
        // while(it.hasNext()) {
        //     String city = it.next();
        //     System.out.print(city + " ");
        // }

        // Modern Style
        Stream<String> st = cities.stream();
        // Stream<String> st = cities.parallelStream();
        st.forEach(c -> System.out.print(c + " ")); // 별도 변수 선언이 없기 때문에 다른 방식보다 안전함.

    }
}
