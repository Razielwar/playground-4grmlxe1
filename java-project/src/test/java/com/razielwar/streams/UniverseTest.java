package com.razielwar.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import static com.razielwar.utils.Command.existsInFile;
import static com.razielwar.utils.Command.msg;
import static com.razielwar.utils.Command.success;

public class UniverseTest {

	private static final String FILE_NAME = "./src/main/java/com/razielwar/streams/Universe.java";

	@Test
	public void test() throws FileNotFoundException {
		try {
			Assert.assertEquals("Running Universe.countAllStars(2, 3, 10)...", 15, Universe.countAllStars(2, 3, 10));
			Assert.assertEquals("Running Universe.countAllStars(9, -3)...", 6, Universe.countAllStars(9, -3));
			success(true);

			if (existsInFile("Arrays.stream(galaxies).sum()", FILE_NAME) || existsInFile("stream(", FILE_NAME)) {
				msg("My personal Yoda, you are. 🙏", "* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ");
				msg("My personal Yoda, you are. 🙏", "           　★ °  ☆ ¸. ¸ 　★　 :.　 .   ");
				msg("My personal Yoda, you are. 🙏", "__.-._     ° . .　　　　.　☾ ° 　. *   ¸ .");
				msg("My personal Yoda, you are. 🙏", "'-._\\7'      .　　° ☾  ° 　¸.☆  ● .　　　");
				msg("My personal Yoda, you are. 🙏", " /'.-c    　   * ●  ¸.　　°     ° 　¸.    ");
				msg("My personal Yoda, you are. 🙏", " |  /T      　　°     ° 　¸.     ¸ .　　  ");
				msg("My personal Yoda, you are. 🙏", "_)_/LI");
			} else {
				msg("Kudos 🌟", "It works but don't you want to try with streams?");
			}
		} catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", "Did you properly accumulate all stars? 🤔");
		}
	}

}