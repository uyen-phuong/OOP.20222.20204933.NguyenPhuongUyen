package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.utils.DVDUtils;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public DigitalVideoDisc[] getItems() {
		return this.itemsOrdered;
	}

	// Add single dvd to the first null index of the array
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.getItems()[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("The '"+disc.getTitle()+"' disc has been added to cart!");
		} else {
			System.out.println("The cart is full");
		}
	}
	
	// Add a list of dvds
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc dvd : dvdList) {
			if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is full");
				break;
			}
			this.addDigitalVideoDisc(dvd);
		}
	}
	
	// Add 2 dvds 
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		} else {
			this.addDigitalVideoDisc(dvd1);
			if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is full");
			} else {
				this.addDigitalVideoDisc(dvd2);
			}
		}
	}
	
	// remove a dvd and then shift all dvd after that removed dvd
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int count = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (this.getItems()[i].equals(disc)) {
				for (int j = i; j < MAX_NUMBERS_ORDERED-1; j++) {
					if (this.getItems()[j+1] == null) {
						this.getItems()[j] = null;
						break;
					}
					this.getItems()[j] = this.getItems()[j+1];
				}
				this.getItems()[MAX_NUMBERS_ORDERED-1] = null;
				
				System.out.println("The '"+disc.getTitle()+"' disc has been removed from cart!");
				this.qtyOrdered -= 1;
				break;
			} else {
				count += 1;
				if (count == MAX_NUMBERS_ORDERED) {
					System.out.println("The disc isn't in the cart");
				}
			}
		}
	}
	
	// return total cost of dvds
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			cost += this.getItems()[i].getCost();		
		}
		return cost;
	}
	
	// sort by title (alphabetical)
	public void sortByTitile() {
		DVDUtils.sortByTitle(this.itemsOrdered);
//		System.out.println("Cart is sorted by title");
		
	}
	
	// sort by cost (decreasing)
	public void sortByCost() {	
		DVDUtils.sortByCost(this.itemsOrdered);
//		System.out.println("Cart is sorted by cost");
	}
	
	// sort by length (decreasing)
	public void sortByLength( ) {
		for (int i = 0; i < this.qtyOrdered-1; i++) {
			for (int j = i+1; j < this.qtyOrdered; j++) {
				if (this.getItems()[i].getLength() > this.getItems()[j].getLength()) {
					DigitalVideoDisc temp = this.getItems()[i];
					this.getItems()[i] = this.getItems()[j];
					this.getItems()[j] = temp;
				}
			}
		}
//		System.out.println("Cart is sorted by length");
	}
	
	public void print() {
		if (this.qtyOrdered > 0) {
			int len = 0;
			for(int i = 0; i < this.qtyOrdered; i++) {
				len = Math.max(len, this.getItems()[i].toString().length()+3);
			}
			this.sortByLength();
			this.sortByCost();
			this.sortByTitile();
			for (int i = 0; i < (len-4)/2; i++) {
				System.out.print("*");
			}
			System.out.print("CART");
			for (int i = 0; i < (len-4)/2; i++) {
				System.out.print("*");
			}
			System.out.println();
			for(int i = 0; i < this.qtyOrdered; i++) {
				System.out.println((i+1) + ". " + this.getItems()[i].toString());
			}
			System.out.println(String.format("Total cost: %.2f", this.totalCost()));
			for (int i = 0; i < len; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void searchById(int id) {
		System.out.println(String.format("search by id: " + id));
		boolean found = false;
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.getItems()[i].getId() == id) {
				System.out.println(this.getItems()[i].toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No matching id");
		}

	}
	
	public void searchByTitle(String title) {
		System.out.println("search by title: " + title);
		int count = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.getItems()[i].isMatch(title)) {
				System.out.println(this.getItems()[i].toString());
			}
		}
		if (count == 0) {
			System.out.println("No matching title");
		} 
		
	}
	
	public void display() {
		System.out.println("Cart");
		if (qtyOrdered == 0) {
			System.out.println("Cart is empty!");
		}
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println((i+1) + ". " + this.itemsOrdered[i].toString());	
		}
	}

	public void clear() {
		for (int i = 0; i < qtyOrdered; i++) {
			this.itemsOrdered[i] = null;
		}
		qtyOrdered = 0;
	}
	
}
