package Function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// 함수적 인터페이스 (jdk 8 이상)
// Type           Parameter   Return      Method
// Consumer       O           X           accept()
// Supplier       X           O           get()
// Function       O           O           apply()
// Predicate      O           O           test()
// Operator  O           O           apply()

public class FunctionallnterfaseDemo1 {
    public static void main(String[] args) {
    //     IntPredicate odd = x -> x % 2 == 1;

    //     System.out.println(odd.test(10) ? "홀수" : "짝수");

    //     Predicate<String> p = Predicate.isEqual("Test");
    //     System.out.println(p.test("Test") ? "같음" : "다름");
    //     System.out.println(p.test("Java") ? "같음" : "다름");
    // }
    

    // Supplier<Double> s1 = () -> 2.71;
    // System.out.println(s1.get());

    // IntSupplier s2 = () -> {
    //     System.out.println("주사위를 굴립니다.");

    //     return (int) (Math.random() * 6) + 1;
    // };
    //     System.out.println(s2.getAsInt());

    Consumer<String> c1 = n -> {
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
    };
        c1.accept("java");
    
    BiConsumer<Integer, Integer> c2 = (s1, s2) -> {
        System.out.println(s1 + s2);
        System.out.println(s1 - s2);
    };
        c2.accept(10, 5);
    
    }
}
