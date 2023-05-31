package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private final int MAX_NUMBERS_STORED = 500;
	private int numberOfDVDs = 0;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_STORED];
	
	public DigitalVideoDisc[] getItems() {
		return itemsInStore;
	}
	
	public int getNumberOfDVDs() {
		return numberOfDVDs;
	}

	public int inStore(int id) {
		for (int i = 0; i < MAX_NUMBERS_STORED; i++) {
			if (i == numberOfDVDs) {
				return -1;
			}
			if (id == this.itemsInStore[i].getId()) {
				return i;
			}
		}
		return -1;
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		int index = this.inStore(dvd.getId());
		if (index == -1) {
			this.itemsInStore[numberOfDVDs] = dvd;
			numberOfDVDs += 1;
			System.out.println("The '"+dvd.getTitle()+"' disc has been added to store!");
		} else {
			System.out.println("The '"+dvd.getTitle()+"' disc has already been in the store!");
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		int index = this.inStore(dvd.getId());
		if (index != -1) {
			if (index == numberOfDVDs - 1) {
				this.itemsInStore[numberOfDVDs] = null;
				numberOfDVDs -= 1;
			} else if (index >= 0) {
				for (int i = index; i < numberOfDVDs - 1; i++) {
					if (this.itemsInStore[i+1] == null) {
						this.itemsInStore[i] = null;
						break;
					}
					this.itemsInStore[i] = this.itemsInStore[i+1];
				}
				this.itemsInStore[numberOfDVDs - 1] = null;
				numberOfDVDs -= 1;
			}
			System.out.println("The '"+dvd.getTitle()+"' disc has been removed from store!");
		} else {
			System.out.println("The '"+dvd.getTitle()+"' disc has not been in the store!");
		}
	}
	
	public void display() {
		System.out.println("Store");
		if (numberOfDVDs == 0) {
			System.out.println("Store is empty!");
		}
		for (int i = 0; i < numberOfDVDs; i++) {
			System.out.println((i+1) + ". " + this.itemsInStore[i].toString());	
		}
	}
	
	public DigitalVideoDisc[] inStore(String title) {
		int count = 0;
		int index[] = new int[numberOfDVDs];
		for (int i = 0; i < numberOfDVDs; i++) {
			if (this.itemsInStore[i].getTitle().equals(title)) {
				index[i] = 1;
				count += 1;
			}
		}
		if (count == 0) {
			return null;
		}
		int j = 0;
		DigitalVideoDisc dvds[] = new DigitalVideoDisc[count];
		for (int i = 0; i < count; i++) {
			if (index[i] == 1) {
				dvds[j] = this.itemsInStore[i];
				j++;
			}
		}
		return dvds;
	}
}
