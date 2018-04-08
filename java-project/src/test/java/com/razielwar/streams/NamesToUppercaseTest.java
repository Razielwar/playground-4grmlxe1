package com.razielwar.streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.razielwar.utils.Command.existsInFile;
import static com.razielwar.utils.Command.msg;
import static com.razielwar.utils.Command.success;

public class NamesToUppercaseTest {

    private static final String FILE_NAME = "./src/main/java/com/razielwar/streams/NamesToUppercase.java";

    @Test
    public void test() throws FileNotFoundException {
        try {
            List<String> names = Arrays.asList("Anakin Skywalker", "Luke Skywalker", "Leia Organa", "Han Solo", "Obi-wan Kenobi");
            String namesToUpper = names.stream().map(String::toUpperCase).sorted().collect(Collectors.joining(","));
            Stream<String> result = NamesToUppercase.toUppercaseSorted(names);
            Assert.assertNotNull("Stream should not be null", result);
            Assert.assertEquals("Stream should contains the following names : " + namesToUpper,
                    namesToUpper,
                    result.collect(Collectors.joining(",")));
            success(true);

            if (existsInFile("String::toUpperCase", FILE_NAME)) {
                msg("You're a Jedi Master. 🙏", "* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ");
            } else {
                msg("Jar Jar Binks. 🌟", "Well done but you could use reference method");
                msg("Jar Jar Binks. 🌟", "");
                msg("Jar Jar Binks. 🌟", "Arrays.asList(names).map(String::toUpperCase).sorted();");
            }
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
            msg("Hint 💡", "Try using map and sorted methods");
        }
    }

}