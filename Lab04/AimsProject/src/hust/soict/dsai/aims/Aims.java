package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import java.util.Scanner;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	public static void mainMenu() {
		System.out.println("AIMS: ");
		System.out.println("---------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner inp = new Scanner(System.in);
		int mainInp = inp.nextInt();
		switch (mainInp) {
			case 1:
				storeMenu();
				break;
			case 2:
				updateMenu();
				break;
			case 3:
				cartMenu();
				break;
			case 0:
				System.out.println("Finished!!!");
				break;
		}
		inp.close();
	}
	
	public static void storeMenu() {
		System.out.println("---------------------------------");
		DVDStore.display();
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. See a DVD's details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner inp = new Scanner(System.in);
		int storeInp = inp.nextInt();
		switch (storeInp) {
			case 1:
				seeDVDDetailsMenu();
				break;
			case 2:
				addDVDToCart();
				break;
			case 3:
				cartMenu();
				break;
			case 0:
				mainMenu();
				break;
		}
		inp.close();
	}
	
	public static void updateMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. Add a DVD to store");
		System.out.println("2. Remove a DVD from store");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		Scanner inp = new Scanner(System.in);
		int updateInp = inp.nextInt();
		switch (updateInp) {
			case 1:
				addDVDToStore();
				break;
			case 2:
				removeDVDfromStore();
				break;
			case 0:
				mainMenu();
				break;
		}
		inp.close();
	}
	
	public static void cartMenu() {
		System.out.println("---------------------------------");
		cart.display();
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner inp = new Scanner(System.in);
		int cartInp = inp.nextInt();
		switch (cartInp) {
			case 1:
				filterDVDInCart();
				break;
			case 2:
				sortDVDInCart();
				break;
			case 3:
				removeDVDInCart();
				break;
			case 4:
				placeOrder();
				break;
			case 0:
				mainMenu();
				break;
		}
		inp.close();
	}

	private static void seeDVDDetailsMenu() {
		System.out.println("---------------------------------");
		System.out.println("See DVD details:");
		System.out.println("Enter the title: ");
		Scanner inp = new Scanner(System.in);
		String title = inp.nextLine();
		DigitalVideoDisc[] dvds = DVDStore.inStore(title);
		if (dvds != null) {
			for (int i = 0; i < dvds.length; i++) {
				System.out.println((i+1) + ". " + dvds[i].toString());
			}
			System.out.println("Option:");
			System.out.println("---------------------------------");
			System.out.println("1. Add dvd to cart by enter a number from 1 to " + dvds.length);
			System.out.println("0. Back");
			System.out.println("---------------------------------");
			System.out.println("Please choose a number: 0-" + dvds.length);
			int num = inp.nextInt();
			switch(num) {
			case 0:
				storeMenu();
				break;
			case 1:
				cart.addDigitalVideoDisc(dvds[num-1]);
				break;
			}
		} else {
			System.out.println("No matching title '" + title + "' in store");
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			storeMenu();
			break;
		}
		inp.close();
	}
	
	private static void addDVDToCart() {
		System.out.println("---------------------------------");
		System.out.println("Add a DVD to cart");
		System.out.println("Pleas enter the title: ");
		Scanner inp = new Scanner(System.in);
		String title = inp.nextLine();
		DigitalVideoDisc[] dvds = DVDStore.inStore(title);
		if (dvds != null) {
			System.out.println("Option:");
			System.out.println("---------------------------------");
			System.out.println("1. Add dvd to cart by enter a number from 1 to " + dvds.length);
			System.out.println("---------------------------------");
			System.out.println("Please choose a number: 1-" + dvds.length);
			int num = inp.nextInt();
			switch(num) {
			case 0:
				storeMenu();
				break;
			case 1:
				cart.addDigitalVideoDisc(dvds[num-1]);
				break;
			}
		} else {
			System.out.println("No matching dvd title '" + title + "' in store");
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			storeMenu();
			break;
		}
		inp.close();
	};
	
	private static void addDVDToStore() {
		Scanner inp = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Add a DVD to store");
		System.out.println("Enter dvd title:");
		String title = inp.nextLine();
		System.out.println("Enter dvd category:");
		String category = inp.nextLine();
		System.out.println("Enter dvd director:");
		String director = inp.nextLine();
		System.out.println("Enter dvd length:");
		int length = inp.nextInt();
		System.out.println("Enter dvd cost: ");
		float cost = inp.nextFloat();
		DVDStore.addDVD(new DigitalVideoDisc(title, category, director, length, cost));
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num = inp.nextInt();
		switch(num) {
		case 0:
			updateMenu();
			break;
		}
		inp.close();
	}
	
	private static void removeDVDfromStore() {
		Scanner inp = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Remove a DVD from store");
		if (DVDStore.getNumberOfDVDs() == 0) {
			System.out.println("Store is empty!");
		} else {
			DVDStore.display();
			System.out.println("---------------------------------");
			System.out.println("Please choose a number: 1" + (DVDStore.getNumberOfDVDs() == 1 ? "" : "-"+DVDStore.getNumberOfDVDs()));
			int num = inp.nextInt();
			if (num > 0 && num <= DVDStore.getItems().length) {
				DVDStore.removeDVD(DVDStore.getItems()[num-1]);
			}
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			updateMenu();
			break;
		}
		inp.close();
	}
	
	private static void filterDVDInCart() {
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("1. Filter by id");
		System.out.println("2. Filter by title");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 1-2");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		switch(num) {
			case 1:
				System.out.println("Please enter id:");
				int id = inp.nextInt();
				cart.searchById(id);
				break;
			case 2: 
				System.out.println("Please enter title:");
				String title = inp.nextLine();
				cart.searchByTitle(title);
				break;
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			cartMenu();
			break;
		}
		inp.close();
	}
	
	private static void sortDVDInCart() {
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 1-2");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		switch(num) {
			case 1:
				cart.sortByCost();
				cart.sortByTitile();
				break;
			case 2: 
				cart.sortByTitile();
				cart.sortByCost();
				break;
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			cartMenu();
			break;
		}
		inp.close();
		
	}
	
	private static void removeDVDInCart() {
		Scanner inp = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Remove a DVD from cart");
		if (cart.getQtyOrdered() == 0) {
			System.out.println("Cart is empty!");
		} else {
			cart.display();
			System.out.println("---------------------------------");
			System.out.println("Please choose a number: 1" + (cart.getQtyOrdered() == 1 ? "" : "-" + cart.getQtyOrdered()));
			int num = inp.nextInt();
			if (num > 0 && num <= cart.getQtyOrdered()) {
				cart.removeDigitalVideoDisc(cart.getItems()[num-1]);
			}
		}
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		int num1 = inp.nextInt();
		switch(num1) {
			case 0:
				updateMenu();
				break;
		}
		inp.close();
		
	}
	
	private static void placeOrder() {
		System.out.println("An order is created!");
		cart.clear();
		System.out.println("Option:");
		System.out.println("---------------------------------");
		System.out.println("0. Back");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0");
		Scanner inp = new Scanner(System.in);
		int num1 = inp.nextInt();
		switch(num1) {
		case 0:
			cartMenu();
			break;
		}
		inp.close();
	}
	
	private static Store DVDStore = new Store();
	private static Cart cart = new Cart();
	
	public static void main(String[] args) {
		
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
		DVDStore.addDVD(dvd7);
		
		mainMenu();
		
		System.out.println("Finished!!!");
	}
}
