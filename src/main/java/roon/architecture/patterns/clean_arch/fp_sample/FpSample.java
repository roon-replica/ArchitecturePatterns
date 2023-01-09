package roon.architecture.patterns.clean_arch.fp_sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class FpSample {
    public static void main(String[] args) {
        // 요구사항: print(take(map(range())))

        var infiniteGenerator = IntStream.iterate(1, i -> i + 1);
        Function<IntStream, List<Integer>> finiteListFromInfiniteSource = infinite -> {
            var iterator = infinite.iterator();
            List<Integer> ret = new ArrayList<>();
            for (int i = 1; i < 100; i++) ret.add(iterator.nextInt());
            return ret;
        };

        Function<Integer, Integer> square = input -> input * input;
        BiFunction<Integer, Supplier<List<Integer>>, List<Integer>> take = (limit, origin) -> origin.get().subList(0, limit);
        Consumer<List<Integer>> print = input -> input.forEach(System.out::println);

        print.accept(
                take.apply(10,
                        () -> {
                            var ret = finiteListFromInfiniteSource.apply(infiniteGenerator);
                            ret.forEach(square::apply);
                            return ret;
                        }
                )
        );

    }

}
