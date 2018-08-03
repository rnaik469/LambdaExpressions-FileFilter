package in.co.cg.filefilter;

import java.io.File;

public class FileFilter {

	public static void main(String[] args) {

		File file = new File("c:"); // directory path

		// Filefilter with lambda
		File listOfFolder[] = file.listFiles((fileElement) -> {
			return fileElement.isDirectory();
		});

		// iterating through each file element
		for (File eachFile : listOfFolder) {
			System.out.println(eachFile.getName());
		}

	}

}
