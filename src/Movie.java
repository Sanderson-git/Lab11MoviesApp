
public class Movie {
	private String name;
	private String category;
	
	public Movie() {
	}
	
	public Movie (String name, String category) {
		this.name = name;
		this.category = category;
	}
	//getter
	public String getName () {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getCategory() {
		return category;
	}
	//setter
	public void setCategory(String category) {
		this.category = category;
	}
}
