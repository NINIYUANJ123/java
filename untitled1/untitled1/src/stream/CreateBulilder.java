package stream;

import java.util.stream.Stream;

public class CreateBulilder {
    public static void main(String[] args) {
        Stream<String> stream =Stream.<String>builder()
                .add("web")
                .add("java")
                .add("spring")
                .add("cloud")
                .add("docker")
                .build();
        stream.forEach(System.out::println);
        String str = "char 1111";
        str.chars()
                .filter(n -> !Character.isDigit(n) || Character.isWhitespace(n))
                .forEach(n -> System.out.print((char)n));
    }
}
