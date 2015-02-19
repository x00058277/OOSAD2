package Week4.week3;

public class Doctor extends Professional {

	private boolean GP;
	private String gender;

	public boolean isGP() {
		return this.GP;
	}

	public void setGP(boolean GP) {
		this.GP = GP;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}