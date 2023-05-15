package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public DigitalVideoDisc[] getItems() {
		return this.itemsOrdered;
	}

	// Add single dvd to the first null index of the array
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.getItems()[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("The '"+disc.getTitle()+"' disc has been added");
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
			if (this.getItems()[i] == disc) {
				for (int j = i; j < MAX_NUMBERS_ORDERED-1; j++) {
					if (this.getItems()[j+1] == null) {
						this.getItems()[j] = null;
						break;
					}
					this.getItems()[j] = this.getItems()[j+1];
				}
				this.getItems()[MAX_NUMBERS_ORDERED-1] = null;
				
				System.out.println("The '"+disc.getTitle()+"' disc has been removed");
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
}
