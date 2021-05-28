package TestSelenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

class Selenium {

	private static WebDriver webDriver;
	
	@BeforeAll
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver.exe");
		webDriver = new ChromeDriver();
	}

	/*
	@Test
	public void loginTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		assertEquals("https://www.olx.ba/mojpik" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		*/
	
	
	
	/*
		@Test
		public void acceptCookies() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement cookies = webDriver.findElement(By.xpath("//button[contains(text(),'Prihvati i zatvori')]"));
		assertEquals("PRIHVATI I ZATVORI" , cookies.getText());
		cookies.click();
		
		
		Thread.sleep(1000);
		*/
	
	
	/*
		@Test
		public void searchTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement search = webDriver.findElement(By.id("searchinput"));
		search.sendKeys("iPhone 8");
		
		Thread.sleep(3000);
		
		WebElement startsearch = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]/i[1]"));
		startsearch.click();
		
		assertEquals("https://www.olx.ba/pretraga?trazilica=iPhone+8" , webDriver.getCurrentUrl());
		
		Thread.sleep(2000);
		
	*/
	
	
	
	/*
	    @Test
		public void checkMsgTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
	    WebElement Poruke = webDriver.findElement(By.xpath("//a[@id='porukel']"));
		Poruke.click();
		
		assertEquals("https://www.olx.ba/poruke" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		
		WebElement checkmsg = webDriver.findElement(By.xpath("//p[contains(text(),'Dobrodošli na OLX!')]"));
		checkmsg.click();
		
		assertEquals("https://www.olx.ba/poruke/k-188540401" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		
		assertEquals("https://www.olx.ba/poruke" , webDriver.getCurrentUrl());
		
		Thread.sleep(1500);
		*/
	
	
	
	/*
		@Test
		public void settingsTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement checksettings = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
		checksettings.click();
		
		assertEquals("https://www.olx.ba/postavke/verifikacija" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		*/
	
	
	
/*
		@Test
		public void KategorijaMobiteliPikLogoTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement kategorije = webDriver.findElement(By.id("km"));
		kategorije.click();
		
		Thread.sleep(3000);
		
		WebElement mob = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]"));
		mob.click();
		
		assertEquals("https://www.olx.ba/mobilni-uredjaji" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		WebElement backToOlx = webDriver.findElement(By.id("piklogo"));
		backToOlx.click();
		
		assertEquals("https://www.olx.ba/" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		*/
	
	
	
	    /*
		@Test
		public void tabShopovi() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement Shopovi = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]"));		
		Shopovi.click();
		
		assertEquals("https://www.olx.ba/shopovi" , webDriver.getCurrentUrl());
		
		assertEquals("OLX shopovi - OLX.ba" , webDriver.getTitle());
		
		Thread.sleep(2000);
		*/
	
	
	
	   /* 
		@Test
		public void tabVozila() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement Vozila = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]"));
		Vozila.click();
		
		Thread.sleep(2000);
		
        assertEquals("https://www.olx.ba/vozila" , webDriver.getCurrentUrl());
		
		assertEquals("Polovna i nova vozila, automobili, motori, kamioni, traktori, teretna vozila - OLX.ba" , webDriver.getTitle());
	*/
	
	
	    /*
		@Test
		public void tabNekretnine() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement Nekretnine = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]"));
		Nekretnine.click();
		
		Thread.sleep(2000);
		
		
		assertEquals("https://www.olx.ba/nekretnine" , webDriver.getCurrentUrl());
		assertEquals("Nekretnine - OLX.ba" , webDriver.getTitle());
		*/
	
	
	
	    /*
		@Test
		public void tabNajnovije() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement Najnovije = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[10]/a[1]"));
		Najnovije.click();
		
		Thread.sleep(2000);
		
		assertEquals("https://www.olx.ba/zadnje" , webDriver.getCurrentUrl());
		assertEquals("Tek objavljeni artikli - OLX.ba" , webDriver.getTitle());
	*/
	
	
	   /* 
		@Test
		public void tabHitno() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement Hitno = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[11]/a[1]"));
		Hitno.click();
		
		Thread.sleep(2000);
		
		assertEquals("olx.ba/" , webDriver.getCurrentUrl());
	*/
	
	
	    /*
		@Test
		public void tabUsluge() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		WebElement cookies = webDriver.findElement(By.xpath("//button[contains(text(),'Prihvati i zatvori')]"));
		cookies.click();
		
		Thread.sleep(3000);
		
		WebElement Usluge = webDriver.findElement(By.xpath("//a[@id='siul']"));
		Usluge.click();
		
		String link = "https://www.olx.ba/servisi-i-usluge";
		assertEquals(link, webDriver.getCurrentUrl());
	
		
		Thread.sleep(2000);
		
		WebElement domkanc = webDriver.findElement(By.xpath("//a[contains(text(),'Dom i kancelarija')]"));
		domkanc.click();
		
		Thread.sleep(1500);

		assertEquals("https://www.olx.ba/dom-i-kancelarija/2159/2175" , webDriver.getCurrentUrl());
		
		Thread.sleep(1500);
	*/
	
	
	
	    /*
		@Test
		public void PublishArticleTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		WebElement cookies = webDriver.findElement(By.xpath("//button[contains(text(),'Prihvati i zatvori')]"));
		cookies.click();
		
		Thread.sleep(3000);
		
		WebElement Objavite1 = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]"));
		Objavite1.click();
		
		Thread.sleep(1500);
		
		WebElement Objavite2 = webDriver.findElement(By.xpath("//body/div[@id='objavadiv']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
		Objavite2.click();
		
		Thread.sleep(1500);
		
		WebElement Prodaja = webDriver.findElement(By.id("kategorija_sug"));
		Prodaja.sendKeys("iPhone 8");
		
		WebElement predlozikat = webDriver.findElement(By.id("pronadjikat"));
		predlozikat.click();
		
		Thread.sleep(1500);
	
		WebElement katmob = webDriver.findElement(By.xpath("//a[@id='prijedlog_kat_31']"));
		katmob.click();
		
		Thread.sleep(1500);
		
		WebElement sljkorak1 = webDriver.findElement(By.id("korak1btn"));
		sljkorak1.click();
		
		Thread.sleep(1500);
		
		Select dropdown = new Select(webDriver.findElement(By.xpath("//select[@id='polje2079']")));
		dropdown.selectByVisibleText("iOS");
		
		Thread.sleep(1500);
		
		WebElement detopis = webDriver.findElement(By.xpath("//body/div[@id='objavadiv']/div[1]/div[1]/div[1]/div[3]/div[7]/div[2]/div[1]"));
		detopis.sendKeys("dobar");
		
		Thread.sleep(3000);
		
		WebElement nextstep = webDriver.findElement(By.xpath("//input[@id='korak3btn']"));
		nextstep.click();
		
		Thread.sleep(3000);
		
		WebElement cijena = webDriver.findElement(By.xpath("//input[@id='cijena']"));
		cijena.sendKeys("500");
		
		Thread.sleep(3000);
		
		WebElement sljkorak2 = webDriver.findElement(By.xpath("//input[@id='korak4btn']"));
		sljkorak2.click();
		
		Thread.sleep(3000);
		
		WebElement stanje = webDriver.findElement(By.xpath("//body/div[@id='objavadiv']/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]"));
		stanje.click();
		
		Thread.sleep(3000);
		
		WebElement sljkorak3 = webDriver.findElement(By.xpath("//body/div[@id='objavadiv']/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/input[1]"));
		sljkorak3.click();
		
		assertEquals("https://www.olx.ba/objava" , webDriver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		WebElement zavrsi = webDriver.findElement(By.xpath("//input[@id='dugmeizdvoji']"));
		zavrsi.click();
		
		WebElement zavrsi1 = webDriver.findElement(By.xpath("//input[@id='dugmeizdvoji']"));
		zavrsi1.click();
		
		assertEquals("https://www.olx.ba/mojpik/aktivni" , webDriver.getCurrentUrl());
		assertEquals("Aktivni artikli - OLX.ba" , webDriver.getTitle());
		
		Thread.sleep(2000);
		*/
	
	
	
	
		/*
		@Test
		public void SendMessageTest() throws InterruptedException {
		webDriver.get("https://www.olx.ba/");
		
		webDriver.manage().window().maximize();
		
		WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
		prijava.click();
		
		Thread.sleep(3000);
		
		WebElement username = webDriver.findElement(By.id("username"));
		WebElement password = webDriver.findElement(By.id("password"));
		username.sendKeys("faris@bekta.me");
		password.sendKeys("svvtprojekat");
		
		Thread.sleep(3000);
		
		WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
		loginbtn.click();
		
		
		Thread.sleep(3000);
		
		WebElement search2 = webDriver.findElement(By.id("searchinput"));
		search2.sendKeys("katalegacy");
		
		Thread.sleep(3000);
		
		WebElement startsearch2 = webDriver.findElement(By.xpath("//b[contains(text(),'katalegacy')]"));
		startsearch2.click();
		
		assertEquals("https://www.olx.ba/profil/katalegacy" , webDriver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		WebElement sendmsg = webDriver.findElement(By.xpath("//p[contains(text(),'POŠALJI PORUKU')]"));
		sendmsg.click();
		
		Thread.sleep(2000);
		
		WebElement txtmsg = webDriver.findElement(By.id("tekst_poruke"));
		txtmsg.sendKeys("Testiranje za projekat");
		
		Thread.sleep(2000);
		
		
		WebElement sendmsgfinal = webDriver.findElement(By.id("posaljiporuku-final"));
		sendmsgfinal.click();
		Thread.sleep(1500);
		
		WebElement uspjesno = webDriver.findElement(By.xpath("//div[contains(text(),'Poruka je uspješno poslana.')]"));
		assertEquals("Poruka je uspješno poslana." , uspjesno.getText());
		
		Thread.sleep(2000);
		*/
	
	
	
	/*
	@Test
	public void searchFilteredCars() throws InterruptedException {
	webDriver.get("https://www.olx.ba/");
	
	webDriver.manage().window().maximize();
	
	WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
	prijava.click();
	
	Thread.sleep(3000);
	
	WebElement username = webDriver.findElement(By.id("username"));
	WebElement password = webDriver.findElement(By.id("password"));
	username.sendKeys("faris@bekta.me");
	password.sendKeys("svvtprojekat");
	
	Thread.sleep(3000);
	
	WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
	loginbtn.click();
	
	WebElement cookies = webDriver.findElement(By.xpath("//button[contains(text(),'Prihvati i zatvori')]"));
	cookies.click();
	
	Thread.sleep(3000);
	
	WebElement Vozila = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]"));
	Vozila.click();
	
	Thread.sleep(2000);
	
	WebElement polovna = webDriver.findElement(By.xpath("//label[contains(text(),'Polovna vozila')]"));
	polovna.click();
	
	Thread.sleep(1500);
	
	Select dropdown1 = new Select(webDriver.findElement(By.xpath("//select[@id='v_b']")));
	dropdown1.selectByVisibleText("BMW (5552)");
	
	Thread.sleep(1500);
	
	WebElement od = webDriver.findElement(By.name("od"));
	od.sendKeys("5000");
	
	WebElement oddo = webDriver.findElement(By.name("do"));
	oddo.sendKeys("15000");
	
	Thread.sleep(2000);
	
	Select lokacija = new Select(webDriver.findElement(By.id("kanton")));
	lokacija.selectByIndex(1);
	
	Thread.sleep(1500);
	
	WebElement dizel = webDriver.findElement(By.xpath("//label[contains(text(),'Dizel')]"));
	dizel.click();
	
	Thread.sleep(1500);
	
	WebElement trazivozila = webDriver.findElement(By.id("trazivozila"));
	trazivozila.click();
	
	assertEquals("https://www.olx.ba/pretraga?kategorija=18&stanje=2&v_b=3500&v_m=&od=5000&do=15000&kanton=&godiste_min=&godiste_max=&kilometra-a_min=0&kilometra-a_max=0&gorivo_select_dizel=Dizel&konjskih-snaga_min=&konjskih-snaga_max=&kilovata-kw_min=&kilovata-kw_max=&kubikaza_min=&kubikaza_max=" , webDriver.getCurrentUrl());
	
	
	Thread.sleep(3000);
	*/
	
	
	
	/*
	@Test
	public void checkMyProfileTest() throws InterruptedException {
	webDriver.get("https://www.olx.ba/");
	
	webDriver.manage().window().maximize();
	
	WebElement prijava = webDriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]/i[1]"));
	prijava.click();
	
	Thread.sleep(3000);
	
	WebElement username = webDriver.findElement(By.id("username"));
	WebElement password = webDriver.findElement(By.id("password"));
	username.sendKeys("faris@bekta.me");
	password.sendKeys("svvtprojekat");
	
	Thread.sleep(3000);
	
	WebElement loginbtn = webDriver.findElement(By.id("btnlogin1"));
	loginbtn.click();
	
	WebElement cookies = webDriver.findElement(By.xpath("//button[contains(text(),'Prihvati i zatvori')]"));
	cookies.click();
	
	Thread.sleep(3000);
	
	WebElement SVVTProjekat = webDriver.findElement(By.id("u_h"));
	SVVTProjekat.click();
	
	Thread.sleep(1500);
	
	WebElement myprofile = webDriver.findElement(By.xpath("//body/div[@id='headergore']/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]"));
	myprofile.click();
	
	Thread.sleep(2000);
	
	String mojprofil = "https://www.olx.ba/profil/SVVTProjekat";
	
	assertEquals(mojprofil , webDriver.getCurrentUrl());
	*/
	
	
	
	
		webDriver.quit();
		
		}
	


	
	

}
