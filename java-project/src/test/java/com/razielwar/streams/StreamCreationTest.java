package com.razielwar.streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.razielwar.utils.Command.*;

public class StreamCreationTest {

    @Test
    public void test() throws FileNotFoundException {
        try {
            Stream<String> result = StreamCreation.createStream();
            Assert.assertNotNull("Stream should not be null", result);
            Assert.assertEquals("Stream should should contains the following names : " +
                            "Anakin Skywalker, Luke Skywalker, Leia Organa, Han Solo, Obi-wan Kenobi",
                    "Anakin Skywalker, Luke Skywalker, Leia Organa, Han Solo, Obi-wan Kenobi",
                    result.collect(Collectors.joining(", ")));
            success(true);

            msg("The Force will be with you. Always. 🌟", "It was easy for you!");
            msg("The Force will be with you. Always. 🌟", "");
            msg("The Force will be with you. Always. 🌟", "There are some ways to create streams");
            msg("The Force will be with you. Always. 🌟", "Stream.of(...);");
            msg("The Force will be with you. Always. 🌟", "Arrays.asList(...).stream();");
            msg("The Force will be with you. Always. 🌟", "");
            msg("The Force will be with you. Always. 🌟", "And others not applicable for this test");
            msg("The Force will be with you. Always. 🌟", "Stream.generate(...).limit(N);");
            msg("The Force will be with you. Always. 🌟", "IntStream.range(0, N)...;");
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
            msg("Hint 💡", "You could use Stream.of or Arrays.stream!");
        }
    }

}