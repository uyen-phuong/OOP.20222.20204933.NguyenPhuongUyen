package hust.soict.dsai.test.disk;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DiskTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Up", "Aninmation", "Pixar", 107, 34.55f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Mat Biec", "romantic", "Nguyen Nhat Anh", 81, 25.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Mat Biec", "romantic", "phimmoi.net", 80, 26.95f);
		cart.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Mat Biec", "romantic", "phimmoizzz.net", 79, 26.95f);
		cart.addDigitalVideoDisc(dvd4);
		
		
		cart.searchById(12);
		cart.searchById(1);
		cart.searchByTitle("MAt biec");
	}
}
