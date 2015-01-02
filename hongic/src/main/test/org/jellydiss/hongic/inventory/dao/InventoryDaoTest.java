package org.jellydiss.hongic.inventory.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.jellydiss.hongic.inventory.Inventory;
import org.junit.Test;

public class InventoryDaoTest {

	InventoryDao inventoryDao = new InventoryDao();
	
	@Test
	public void createInventoryTable() {
		try{
			inventoryDao.createInventoryTable();
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertFalse("createInventoryTable is fail",true);
		}
	}
	
	@Test
	public void insertItem() {
		Inventory testItem = new Inventory();
		testItem.setItemName("testItem");
		testItem.setCurrentAmount(5);
		testItem.setDangerAmount(2);
		testItem.setWarningAmount(4);
		testItem.setDelYn("N");
		testItem.setImgPath("testpath");
		testItem.setTabNumber(1);
		try {
			inventoryDao.insertItem(testItem);
			assertTrue(true);
		} catch(Exception e) {
			e.printStackTrace();
			assertFalse("insertItem is fail", true);
		}
	}
	
	@Test
	public void getInventoryList(){
		Inventory searchTestItem = new Inventory();
		List<Inventory> listInventory = null;
		searchTestItem.setTabNumber(1);
		try {
			listInventory = inventoryDao.getInventoryList(searchTestItem);
			for(Inventory inventory : listInventory){
				System.out.println(inventory);
			}
			assertTrue(true);
		} catch (Exception e){
			e.printStackTrace();
			assertFalse("getInventoryList is fail" ,true);
		} 
	}

	
// 	테이블 삭제를 위한 임시용 코드로서 주석처리함 
//	@Test
//	public void dropInventoryTable(){
//		try {
//			inventoryDao.dropInventoryTable();
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//	}
}
