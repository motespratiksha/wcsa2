package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//open browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//for login
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginActiTime(flib.readPropertyFile(PROP_PATH, "username"),flib.readPropertyFile(PROP_PATH,"password"));  
		  
		
		//for logout
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.logoutActiTime();                   
		
		
		
		
		}

}
