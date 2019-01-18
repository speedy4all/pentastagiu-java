package com.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTypes {
    public static void main(String[] args) {

        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of("d2", "a2", "b1", "b3", "c")
                        .filter(s -> s.startsWith("a"));


        streamSupplier.get().anyMatch(s -> true);    // ok
        streamSupplier.get().noneMatch(s -> true);


        Arrays.asList("a1", "a2", "a3")
                .stream()
                .forEach(System.out::println);


        Stream.of("a1", "a2", "a3")
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3})
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .forEach(System.out::println);

        DoubleStream.of(1.2, 2.45, 3.55)
                .average()
                .ifPresent(System.out::println);

        Stream.iterate(2, integer -> 2 * integer).limit(5).forEach(System.out::println);
    }
}
