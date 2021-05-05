public class MembersCheckManager implements MembersCheckServices {

	public boolean ifMembersConfirmation(Members members) {
		
		if (members.getFirstName() == "Yusuf" && members.getLastName() == "Horuz" && members.getNationalIdentit() == "1234567890" 
				&& members.getYearofbirth() == 1998) {
			

			System.out.println(members.getUserName() + " kullacýsýnýn bilgileri doðrulandý.");
			return true;
			
		}
		
		if(members.getFirstName() == "Hüseyin" && members.getLastName() == "DRN" && members.getNationalIdentit() == "1122334455" 
				&& members.getYearofbirth() == 1997) {
			
			System.out.println(members.getUserName() + " kullacýsýnýn bilgileri doðrulandý.");
			return true;
		}
		
		if(members.getFirstName() == "Ahmet" && members.getLastName() == "KLMN" && members.getNationalIdentit() == "1357902468" 
				&& members.getYearofbirth() == 2000) {
			
			System.out.println(members.getUserName() + " kullacýsýnýn bilgileri doðrulandý.");
			return true;
		}
		
		else {
			
			System.out.println(members.getUserName() + " kullacýsýnýn bilgileri doðrulanamadý.");
			
			return false;
		
		}
	}
}
