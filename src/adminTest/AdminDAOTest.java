package adminTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import admin.AdminDAO;

public class AdminDAOTest {
	private AdminDAO aDao = new AdminDAO();
	
	@Test
	public void notNullSelectThisMonth() {
		assertNotNull(aDao.selectThisMonth());
	}
	

}
