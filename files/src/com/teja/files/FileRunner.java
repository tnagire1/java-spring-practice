package com.teja.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileRunner {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get("./resources/Data.txt");
		Path writeDirectory = Paths.get("./resources/WriteData.txt");
		List<String> lines = Files.lines(currentDirectory).flatMap(element -> Arrays.stream(element.split("\\.")))
				.toList();

		System.out.println(lines);

		Files.write(writeDirectory, lines);

	}

}
