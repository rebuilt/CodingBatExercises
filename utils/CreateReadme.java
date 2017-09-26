/*
 * Creates a README.md. 
 * 
 *  Recurses through all folders 
 *  Parses comments at top of each file
 *  Writes out README.md
 */
package utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CreateReadme implements Runnable {
	String content = "";
	String path = "";
	File file;
	static ArrayList<File> files = new ArrayList<File>();
	static StringBuffer buffer = new StringBuffer();

	public static void main(String[] args) {

		buffer.append("<h1>" + "Description of exercises" + "</h1>");
		files = listFiles("/home/nelson/eclipse-workspace/CodingBat/src");
	
		for (File file : files) {
			String path = file.getAbsolutePath();
			
			(new Thread(new CreateReadme(path))).start();
		}

		write(buffer);
		System.out.println(buffer);

	}

	public static void write(StringBuffer buff) {
		try {
			PrintWriter writer = new PrintWriter("./src/README.md", "UTF-8");
			writer.println(buff);

			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public CreateReadme(String path) {
		this.path = path;
		file = new File(path);

	}

	public void run() {

		content = readFile(path);
		content = getCommentArea(content);
		content = formatExamples(content);
		content = addPTags(content);

		buffer.append("<h2>" + file.getName() + "</h2>\n");
		buffer.append(content);
		System.out.println(content);
	}

	private String formatExamples(String content) {
		String output = "";
		String name = file.getName();
		name = name.replaceAll("\\.java", "");
		name = (name.charAt(0) + "").toLowerCase() + name.substring(1, name.length());
		//System.out.println("name is " + name);

		String[] temp = content.split(name);
		if (temp.length > 0) {
			output += temp[0] + "\n";
			output += "<ul>" + "\n";
			for (int i = 1; i < temp.length; i++) {
				output += "<li>" + name + temp[i] + "</li>";
			}
			output += "</ul>" + "\n";
		} else {
			return content;
		}
		return output;
	}

	public String readFile(String path) {
		String output = "";

		try {
			output = new String(Files.readAllBytes(Paths.get(path)));
			// System.out.println(content);
		} catch (IOException e) {
			System.out.println(e);
		}
		return output;
	}

	public String getCommentArea(String str) {
		if (str.indexOf("package") > 0) {
			str = str.substring(0, str.indexOf("package"));
		}
		str = str.replaceAll("\\*\\/", "");
		str = str.replaceAll("\\*", "");
		str = str.replaceFirst("\\/", "");

		return str;
	}

	public String addPTags(String str) {
		return "<p>" + str + "</p>\n";

	}

	public static ArrayList<File> listFiles(String folder) {

		File directory = new File(folder);

		// get all the files from a directory

		File[] fList = directory.listFiles();

		for (File file : fList) {

			// System.out.println(file.getAbsolutePath( ));
			if (file.isFile()) {
				if (file.getName().endsWith(".java")) {
					files.add(file);
								}
				// System.out.println(file.getAbsolutePath());

			} else if (file.isDirectory()) {

				listFiles(file.getAbsolutePath());

			}

		}
		return files;
	}
}
