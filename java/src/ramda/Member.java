package ramda;

public class Member {
	private String id;
	private Address address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Member(String id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
}
