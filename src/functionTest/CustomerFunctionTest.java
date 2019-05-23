package functionTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import function.CustomerFunction;

public class CustomerFunctionTest {
	private CustomerFunction cf = null;
	
	@Before
	public void cf() {
		cf = new CustomerFunction();
	}
	
	//지역코드 찾는 메소드 테스트
	@Test
	public void iAreaCodeTest() {
		assertEquals("1area",cf.iAreaCode("경기도"));
	}
	
	@Test
	public void iCodeProc() {
		assertEquals("10001a1190523",cf.iCodeProc("aShop", "1area"));
	}
	
	@Test
	public void sCodeCreate() {
		assertEquals("A190523101",cf.sCodeCreate("A101"));
	}
	

}
