package hust.soict.dsai.test.utils;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.utils.DVDUtils;

public class DVDTest {

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Aninmation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Aninmation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Spyderman", "Science Fiction", 30.99f);
		
		System.out.println("cost of dvd 1 > cost of dvd2: "+ DVDUtils.compareByCost(dvd1, dvd2));
		System.out.println("title of dvd 1 > title of dvd4: "+DVDUtils.compareByTitle(dvd1, dvd4));
		
		DigitalVideoDisc[] dvds = new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4};
		System.out.println("before sorting:");
		for (int i = 0; i < dvds.length; i++) {
			System.out.println(dvds[i].toString());
		}
		
		DigitalVideoDisc[] sorted = DVDUtils.sortByCost(dvds);
		System.out.println("sort by cost:");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
		
		
		sorted = DVDUtils.sortByTitle(dvds);
		System.out.println("sort by title:");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
		

	}

}
