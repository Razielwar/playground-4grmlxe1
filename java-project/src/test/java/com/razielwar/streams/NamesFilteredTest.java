package com.razielwar.streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.razielwar.utils.Command.*;

public class NamesFilteredTest {

    private static final String FILE_NAME = "./src/main/java/com/razielwar/streams/NamesFiltered.java";

    @Test
    public void test() throws FileNotFoundException {
        try {
            List<String> names = Arrays.asList("Anakin Skywalker", "Luke Skywalker", "Leia Organa", "Han Solo", "Obi-wan Kenobi", "R2-D2", "C-3PO");
            String namesFiltered = names.stream()
                    .filter(s -> s.contains("-"))
                    .sorted()
                    .collect(Collectors.joining(",", "{", "}"));
            String result = NamesFiltered.filterCompoundNamesDescSorted(names);
            Assert.assertNotNull("Result should not be null", result);
            Assert.assertEquals("String should be equals to " + namesFiltered, namesFiltered, result);
            success(true);

            if (existsInFile("Collectors.joining(\",\", \"[\", \"]\")", FILE_NAME)) {
                msg("You're a Jedi Master. 🙏", "* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ");
            } else if (existsInFile("stream(", FILE_NAME)) {
                msg("You're a padawan. 🌟", "Well done but you could use joining with prefix and suffix");
                msg("You're a padawan. 🌟", "");
                msg("You're a padawan. 🌟", "String namesFiltered = names.stream()\n");
                msg("You're a padawan. 🌟", ".filter(s -> s.contains(\"-\"))\n");
                msg("You're a padawan. 🌟", ".collect(Collectors.joining(\",\", \"{\", \"}\"));");
            } else {
                msg("You're a rookie. ☠", "You should try using streams!");
            }
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
            msg("Hint 💡", "Try using filter, sorted, collect and joining");
        }
    }

}