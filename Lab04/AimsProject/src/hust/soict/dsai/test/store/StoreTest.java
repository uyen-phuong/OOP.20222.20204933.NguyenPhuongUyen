package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;


public class StoreTest {
	public static void main(String[] args) {
		Store DVDStore = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Aninmation", "Disney", 87, 19.95f);
		DVDStore.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DVDStore.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", "George Lucas", 77, 24.95f);
		DVDStore.addDVD(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Batman", "Science Fiction", "DC", 100, 50.00f);
		DVDStore.addDVD(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spyderman", "Science Fiction", "Mavel", 90, 45.80f);
		DVDStore.addDVD(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Thor", "Science Fiction", "Mavel", 88, 8.95f);
		DVDStore.addDVD(dvd6);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Superman", "Science Fiction", "DC", 92, 21.95f);
		
		
		DVDStore.display();
		
		DVDStore.removeDVD(dvd2);
		DVDStore.removeDVD(dvd5);
		DVDStore.removeDVD(dvd7);
		
		System.out.println("after remove some dvds");
		
		DVDStore.display();
		
	}
}
