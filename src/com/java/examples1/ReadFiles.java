package com.java.examples1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadFiles {

	public static void main(String args[]) throws IOException {

		final ReadFiles fi = new ReadFiles();
		fi.readFile();
		fi.readFileOtherWay();
		fi.readFileOtherWayTryWithRes();
		fi.readFileOtherTryWithResources();
	}

	public void readFile() throws IOException {
		String line;
		final File fPath = new File("C:\\Users\\Shaik.Hajara\\Sample.txt");
		final FileReader reader = new FileReader(fPath);
		final BufferedReader bfreader = new BufferedReader(reader);
		while ((line = bfreader.readLine()) != null) {
			if (line.contains("password")) {
				System.out.println(line);
			}
		}

		reader.close();
		bfreader.close();
	}

	public void readFileOtherTryWithResources() throws IOException {

		final Path path = Paths.get("C:\\Users\\Shaik.Hajara", "Sample.txt");
		try (Stream<String> lines = Files.lines(path).filter(a -> a.contains("password")))

		{
			final Optional<String> result = lines.findFirst();
			if (result.isPresent()) {
				System.out.println(result.get());
			}
		}

	}

	public void readFileOtherWay() throws IOException {

		final Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Shaik.Hajara", "Sample.txt"));
		final Optional<String> result = lines.filter(a -> a.contains("password")).findFirst();
		if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("password not present");
		}

	}

	public void readFileOtherWayTryWithRes() throws IOException {

		final Path path = Paths.get("C:\\Users\\Shaik.Hajara", "Sample.txt");

		try (Stream<String> lines = Files.lines(path)) {

			final Optional<String> result = lines.filter(a -> a.contains("password")).findFirst();
			if (result.isPresent()) {
				System.out.println(result.get());
			}
		}
	}
}
