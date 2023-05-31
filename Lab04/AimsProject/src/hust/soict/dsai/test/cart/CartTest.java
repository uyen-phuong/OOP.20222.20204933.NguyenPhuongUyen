package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Aninmation", "Disney", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", "George Lucas", 77, 24.95f);
		cart.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Batman", "Science Fiction", "DC", 100, 50.00f);
		cart.addDigitalVideoDisc(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spyderman", "Science Fiction", "Mavel", 90, 45.80f);
		cart.addDigitalVideoDisc(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Thor", "Science Fiction", "Mavel", 88, 8.95f);
		cart.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Superman", "Science Fiction", "DC", 92, 21.95f);
		cart.addDigitalVideoDisc(dvd7);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Up", "Aninmation", "Pixar", 107, 34.55f);
		cart.addDigitalVideoDisc(dvd8);
		
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Mat Biec", "romantic", "Nguyen Nhat Anh", 81, 25.95f);
		cart.addDigitalVideoDisc(dvd9);
		
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Mat Biec", "romantic", "phimmoi.net", 80, 26.95f);
		cart.addDigitalVideoDisc(dvd10);
		
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Mat Biec", "romantic", "phimmoizzz.net", 79, 26.95f);
		cart.addDigitalVideoDisc(dvd11);
		
		
		cart.print();
	}

}
