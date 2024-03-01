package day4solidprinciples.srp;

public class ResumeRepository {
		private Resume resumes[];
	
	
		public ResumeRepository() {}
	 	public ResumeRepository(Resume[] resumes) {
		this.resumes = resumes;
	 	}
	 	
	 	public Resume[] getResumes() {
			return resumes;
		}
		public void setResumes(Resume[] resumes) {
			this.resumes = resumes;
		}
//----		
		public void filterResumeByTechnology(String tech)
	    {
	    	for(Resume r1:resumes)//1st Iteration which job seekers Elcid
	    	{
	    		if(r1.getTechnology().equals(tech))
	    		{
	    			System.out.println(r1);
	    		}
	    	}
	    }
	    
	    public void filterResumeByExperience(int exp) //2
	    {
	    	for(Resume r1:resumes)		//Elcid 5
	    	{
	    		if(r1.getYearsOfExperience()>=exp)
	    		{
	    			System.out.println(r1);
	    		}
	    	}
	    }
		

}
