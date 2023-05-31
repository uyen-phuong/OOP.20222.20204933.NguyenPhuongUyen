package hust.soict.dsai.aims.disc;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private LocalDate dateAdded;
	private static int nbDigitalVideoDisc = 0;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}
	
	public DigitalVideoDisc() {
		this.dateAdded = LocalDate.now();
		DigitalVideoDisc.nbDigitalVideoDisc += 1;
		this.id = DigitalVideoDisc.nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title) {
		this();
		this.title = title;
	}	
	
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}
	
	public boolean equals(DigitalVideoDisc that) {
		return this.getTitle() == that.getTitle() && this.getCategory() == that.getCategory() && this.getDirector() == that.getDirector() && this.getCost() == that.getCost() && this.getLength() == that.getLength();
	}


	public String toString() {
		return String.format("DVD - %s - %s - %s - %d: $%.2f", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
	}
	
	public boolean isMatch(String title) {
		String[] tokens = title.split(" ");
		for (String token : tokens) {
			Pattern p = Pattern.compile(token, Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(this.getTitle());
			if (m.find()) {
				return true;
			}
		}
		return false;
	}
}
