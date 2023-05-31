package hust.soict.dsai.aims.utils;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDUtils {
	public static boolean compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		return dvd1.getCost() > dvd2.getCost();
	}
	
	public static boolean compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		return dvd1.getTitle().compareTo(dvd2.getTitle()) > 0;
	}
	
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] dvds) {
		for (int i = 0; i < dvds.length-1; i++) {
			for (int j = i+1; j < dvds.length; j++) {
				if (dvds[j] == null) {
					break;
				}
				if (DVDUtils.compareByCost(dvds[i], dvds[j])) {
					DigitalVideoDisc temp = dvds[i];
					dvds[i] = dvds[j];
					dvds[j] = temp;
				}
			}
		}
		return dvds;
	}
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] dvds) {
		for (int i = 0; i < dvds.length-1; i++) {
			for (int j = i+1; j < dvds.length; j++) {
				if (dvds[j] == null) {
					break;
				}
				if (DVDUtils.compareByTitle(dvds[i], dvds[j])) {
					DigitalVideoDisc temp = dvds[i];
					dvds[i] = dvds[j];
					dvds[j] = temp;
				}
			}
		}
		return dvds;
	}
}
