package org.jellydiss.hongic.inventory;

public class Inventory {
	int itemSeq;
	
	int tabNumber;
	
	String itemName;
	
	int currentAmount;
	
	int warningAmount;
	
	int dangerAmount;
	
	String imgPath;
	
	String delYn;
	
	
	
	@Override
	public String toString() {
		return "Inventory [itemSeq=" + itemSeq + ", tabNumber=" + tabNumber
				+ ", itemName=" + itemName + ", currentAmount=" + currentAmount
				+ ", warningAmount=" + warningAmount + ", dangerAmount="
				+ dangerAmount + ", imgPath=" + imgPath + ", delYn=" + delYn
				+ "]";
	}


	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Inventory(int itemSeq, int tabNumber, String itemName,
			int currentAmount, int warningAmount, int dangerAmount,
			String imgPath, String delYn) {
		super();
		this.itemSeq = itemSeq;
		this.tabNumber = tabNumber;
		this.itemName = itemName;
		this.currentAmount = currentAmount;
		this.warningAmount = warningAmount;
		this.dangerAmount = dangerAmount;
		this.imgPath = imgPath;
		this.delYn = delYn;
	}


	public int getItemSeq() {
		return itemSeq;
	}

	public void setItemSeq(int itemSeq) {
		this.itemSeq = itemSeq;
	}

	public int getTabNumber() {
		return tabNumber;
	}

	public void setTabNumber(int tabNumber) {
		this.tabNumber = tabNumber;
	}

	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public int getWarningAmount() {
		return warningAmount;
	}

	public void setWarningAmount(int warningAmount) {
		this.warningAmount = warningAmount;
	}

	public int getDangerAmount() {
		return dangerAmount;
	}

	public void setDangerAmount(int dangerAmount) {
		this.dangerAmount = dangerAmount;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDelYn() {
		return delYn;
		
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

}
