package App;

public class Role {
	private String monRole;
	
	public Role(String role) {
		this.monRole=role;
	}
	
	public boolean equals(Role role) {
		if(this.monRole==role.getMonRole()) return true;
		return false;
	}
	
	public int  hashCode() {
		
		return 0;
	}

	public String getMonRole() {
		return monRole;
	}



}
