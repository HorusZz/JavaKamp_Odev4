public class MembersManager implements MembersServices{

	@Override
	public void add(Members members) {
		
		System.out.println(members.firstName + "Kullanýcý eklendi.");
		
	}

	@Override
	public void delete(Members members) {
		
		System.out.println(members.firstName + "Kullanýcý silindi.");

	}

	@Override
	public void update(Members members) {
		
		System.out.println(members.firstName + "Kullanýcý bilgileri düzenlendi.");

	}

	
	
}
