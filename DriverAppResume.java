package day4solidprinciples.srp;

public class DriverAppResume {

	public static void main(String[] args) {
		
		Resume r1=new Resume("Alice",98901112,"alice@gmail.com","java",1);
		Resume r2=new Resume("Ben",98901113,"ben@gmail.com","java",2);
		Resume r3=new Resume("Chris",98901114,"chris@gmail.com","phthon",3);
		Resume r4=new Resume("Dom",98901115,"dom@gmail.com","fsd",4);
		Resume r5=new Resume("Elcid",98901116,"elcid@gmail.com","fsd",5);
		
		Resume jobseekers[]= {r1,r2,r3,r4,r5};
		ResumeRepository shinedotcom=new ResumeRepository(jobseekers);
		
		System.out.println("Resume Filetred based on profile FSD");
		shinedotcom.filterResumeByTechnology("fsd");
		System.out.println("Resume Filetred based on exp >=2");
		shinedotcom.filterResumeByExperience(2);
	}

}
