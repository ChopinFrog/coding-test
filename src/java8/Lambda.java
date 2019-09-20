package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Project : coding-test
 * Class : java8.Lambda
 * Version : v0.0.1
 * Created by hyungwoo.cho on 9/20/19.
 */
public class Lambda {

    public void stream() {

        // 1. 배열 스트림
        String[] arr = new String[]{"c", "b", "a", "z"};
        Stream<String> stream1 = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        // 2. 컬렉션 스트림
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        // 3. 비어있는 스트림 Stream.empty()

        // 4. Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("cho").add("hyung").add("woo").build();

        //stream1.sorted().forEach(System.out::println);

        List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
        //Stream<String> stream3 = names.stream();
        long count = 0;
        count = names.stream().filter(item -> item.contains("o")).count();
        System.out.println("Count : " + count);

        // parallel은 순서가 보장되지 않는다.
        names.parallelStream().map( item -> item.concat("s")).forEach(System.out::println);


    }


}
