package org.jellydiss.hongic.inventory.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jellydiss.hongic.configuration.MybatisConfig;
import org.jellydiss.hongic.inventory.Inventory;

public class InventoryDao {

	public void createInventoryTable() {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory()
				.openSession(true);
		try {
			sqlSession
					.update("org.jellydiss.hongic.inventory.dao.InventoryMapper.createInventoryTable");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

	public void insertItem(Inventory item) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory()
				.openSession(true);
		try {
			int testNumber = sqlSession
					.insert("org.jellydiss.hongic.inventory.dao.InventoryMapper.insertItem");
			System.out.println("testNumber : " + testNumber);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	public List<Inventory> getInventoryList(Inventory searchInventory) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory()
				.openSession();

		try {
			List<Inventory> inventoryList = sqlSession
					.selectList(
							"org.jellydiss.hongic.inventory.dao.InventoryMapper.getInventoryList",
							searchInventory);
			return inventoryList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return null;

	}

	public void dropInventoryTable() {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory()
				.openSession(true);
		try {
			sqlSession
					.update("org.jellydiss.hongic.inventory.dao.InventoryMapper.dropInventoryTable");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
