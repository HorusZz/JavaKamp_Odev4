public class Main {

	public static void main(String[] args) {
		
		Members member1 = new Members(1,"YSF", "skdlskd", "dsjdskd@gmail", "1234567890", "Yusuf", "Horuz", 1998);
		
		Members member2 = new Members(2, "HSYN", "sd4546", "sdda@gmail", "1122334455", "Hüseyin", "DRN", 1997);
		
		Members member3 = new Members(3, "KralAhmet", "ksjs1556", "shdsj@hotmail", "1354826795", "Ahmet", "KLMN", 2005);
				
		Product product1 = new Product("GTA V", 60);
		
		Product product2 = new Product("FORZA", 85);
		
		Product product3 = new Product("FÝFA", 40);
		
		Campaigns campaign1 = new Campaigns("EPIC Kampanya", "19 Mayýs-29 EKim", 25);
		
		Campaigns campaign2 = new Campaigns("YAZ Kampanyasý", "1 Haziran-1 Eylül", 15);
		
		Discounts discount1 = new Discounts("Öðrenci Ýndirimi", "'OgrInd", 5);
		
		Selling selling1 = new Selling(1);
 		
		System.out.println("**KÝMLÝK DOÐRULAMA ÝÞLEMÝ**");
		
		MembersCheckManager membersCheckManager = new MembersCheckManager();
	
		membersCheckManager.ifMembersConfirmation(member1);
		
		membersCheckManager.ifMembersConfirmation(member2);
		
		membersCheckManager.ifMembersConfirmation(member3);
		
		System.out.println("**ÜRÜN ÝÞLEMLERÝ**");
		
		ProductManager productManager = new ProductManager();
		
	    productManager.add(product2);
	    
		productManager.configuration(product1);
	    
	    productManager.delete(product3);
	    
	    System.out.println("**SATIÞ ÝÞLEMLERÝ**");
	   
	    SellingManager sellingManager = new SellingManager();
	    
	    sellingManager.DefaultSelling(member1, product3, selling1);
	    
	    sellingManager.DiscountSelling(member1, product1, selling1, discount1);
	    
	    sellingManager.CampaignSelling(member1, product2, selling1, campaign1);
	    
	    sellingManager.CampaignSelling(member2, product3, selling1, campaign2);
	    
	    
	    
	}
}
