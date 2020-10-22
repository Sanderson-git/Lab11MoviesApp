import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class MoviesApplication {

	private static List<Movie> movieNames = new ArrayList<>();
	private static Scanner scnr;

	
	public static void main(String[] args) {
		scnr = new Scanner (System.in);
		fillMovieNameLists();
		System.out.println("Welcome to the Movie List Application!\r\n");
		System.out.println("There are 10 movies in this list.");
		categorySelection();
		scnr.close();
	}
	private static void categorySelection () {
		while(true) {
		System.out.println("What category are you interested in?\r\nAnimated, SciFi, Horror, or Drama");
		String catSelect = scnr.next();
		catSelect = catSelect.toLowerCase();
		if (catSelect.contains("animated")) {
			System.out.println("You've selected Animated.");
				for (Movie movie : movieNames) {
					if (catSelect.equalsIgnoreCase(movie.getCategory())) {
						System.out.println(movie.getName());
					}
				}
			scnr.nextLine();
			if (Validator.getYesNo(scnr, "Would you like to continue? ")) {
				
			} else {
			System.out.println("Thank you, goodbye.");
			break;
			}
			
		} 
		else if (catSelect.contains("drama")) {
			System.out.println("You've selected Drama.");
			for (Movie movie : movieNames) {
				if (catSelect.equalsIgnoreCase(movie.getCategory())) {
					System.out.println(movie.getName());
				}
			}
			scnr.nextLine();
			if (Validator.getYesNo(scnr, "Would you like to continue? ")) {
				
			} else {
			System.out.println("Thank you, goodbye.");
			break;
			}
		} 
		else if (catSelect.contains("scifi")) {
			System.out.println("You've selected SciFi.");
			for (Movie movie : movieNames) {
				if (catSelect.equalsIgnoreCase(movie.getCategory())) {
					System.out.println(movie.getName());
				}
			}
			scnr.nextLine();
			if (Validator.getYesNo(scnr, "Would you like to continue? ")) {
				
			} else {
			System.out.println("Thank you, goodbye.");
			break;
			}
		} 
		else if (catSelect.contains("horror")) {
			System.out.println("You've selected Horror.");
			for (Movie movie : movieNames) {
				if (catSelect.equalsIgnoreCase(movie.getCategory())) {
					System.out.println(movie.getName());
				}
			}
			scnr.nextLine();
			if (Validator.getYesNo(scnr, "Would you like to continue? ")) {
				
			} else {
			System.out.println("Thank you, goodbye.");
			break;
			}
		} 
		else {
			System.out.println("Entry was invalid. Please try again.");
		}
		}	
	}
	private static void fillMovieNameLists() {
		movieNames.add(new Movie("Get Out", "horror"));
		movieNames.add(new Movie("Jaws", "horror"));
		movieNames.add(new Movie("The Martian", "scifi"));
		movieNames.add(new Movie("E.T", "scifi"));
		movieNames.add(new Movie("Gravity", "scifi"));
		movieNames.add(new Movie("Interstellar", "scifi"));
		movieNames.add(new Movie("A Star is Born", "drama"));
		movieNames.add(new Movie("Roma", "drama"));
		movieNames.add(new Movie("Finding Nemo", "animated"));
		movieNames.add(new Movie("Lion King", "animated"));
	}		
}

