package day4solidprinciples.srp;

public class Resume {
    private String candidateName;
    private long mobileNumber;
    private String emailId;
    private String technology;
    private Integer yearsOfExperience;
    
    public Resume() {}
	public Resume(String candidateName, long mobileNumber, String emailId, String technology,
			Integer yearsOfExperience) {
		
		this.candidateName = candidateName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.technology = technology;
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Resume [candidateName=" + candidateName + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", technology=" + technology + ", yearsOfExperience=" + yearsOfExperience + "]";
	}  
    
}

