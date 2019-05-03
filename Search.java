import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Dog");
		list.add("Cat");

		System.out.println("Which pet do you want? Pick one (Dog, Cat).");
		String pet = input.nextLine();
		input.close();
		
		List<String> filters = new ArrayList<>();

		if (pet.contentEquals("Dog")) {
			filters.add("Cat");
			filters.add("Horse");
			filters.add("Bird");
			filters.add("Fish");

		}
		if (pet.contentEquals("Cat")) {
			filters.add("Dog");
			filters.add("Horse");
			filters.add("Bird");
			filters.add("Fish");

		}
		list.removeAll(filters);

		URL url;

		try {
			// get URL content
			String a = "";
			if (list.get(0).equals("Dog")) {
				a = "http://bit.ly/2LaHbLp";
			}
			if (list.get(0).equals("Cat")) {
				a = "http://bit.ly/2Ld5k49";
			}
			url = new URL(a);
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				System.out.println(inputLine);
			}
			br.close();

			System.out.println("Finished");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}