public class MembersManager implements MembersServices{

	@Override
	public void add(Members members) {
		
		System.out.println(members.firstName + "Kullan�c� eklendi.");
		
	}

	@Override
	public void delete(Members members) {
		
		System.out.println(members.firstName + "Kullan�c� silindi.");

	}

	@Override
	public void update(Members members) {
		
		System.out.println(members.firstName + "Kullan�c� bilgileri d�zenlendi.");

	}

	
	
}
