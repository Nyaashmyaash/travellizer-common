package com.nyash.travellizer.travellizercommon.generator.text;



import com.nyash.travellizer.travellizercommon.generator.NumberGenerator;
import com.nyash.travellizer.travellizercommon.generator.RandomNumberGenerator;
import com.nyash.travellizer.travellizercommon.infra.util.Checks;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Generates random string of the specified size using passed number generator
 *
 * @author Nyash
 */
public class RandomDigitStringGenerator implements StringGenerator {

    /**
     * Size of the generated string
     */
    private final int size;

    private final NumberGenerator numberGenerator;

    public RandomDigitStringGenerator(final int size) {
        Checks.checkParameter(size > 0,"String length should be greater than zero");
        this.size = size;
        this.numberGenerator = new RandomNumberGenerator(10);
    }


    @Override
    public String generate() {
        return IntStream.range(0, size).map(i -> numberGenerator.generate()).boxed().map(String::valueOf)
                .collect(Collectors.joining());
    }
}
