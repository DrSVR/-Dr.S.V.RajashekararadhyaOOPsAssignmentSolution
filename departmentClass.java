package mainDepartment;
	//Dr.S.V.RajashekararadhyaOOPsAssignmentSolution
	
class SuperDepartment {
    
	void departmentName()
    {
    	System.out.println("Super Department");
    }
    
	void getTodaysWork()
	{
    	System.out.println("No Work as of now");
	}
    
	void  getWorkDeadline()
	{

	 System.out.println("Nil");
	}
	void isTodayAHoliday()
	{
		
	 System.out.println("Today is not a Holiday");
    }
} 

class AdminDepartment extends SuperDepartment {
	void departmentName()
	{
	   	    	 
 	 System.out.println("Welcome to Admin Department");
    }

	void getTodaysWork()
    {
    	
	 System.out.println("Complete your documents Submission");
    }
    
     void getWorkDeadline()
    {
    	 
	 System.out.println("Complete by EOD");
    }
    
     void isTodayAHoliday()
    {
     	
 	System.out.println("Today is not a Holiday");
     	
 	System.out.println("");
    } 
}
class HRDepartment extends SuperDepartment {
    void departmentName()
    {
    	    
	System.out.println("Welcome to HR Department");
    	
    }
    void getTodaysWork()
    {
    	
	System.out.println("Fill today's timesheet and mark your attendance");
    	
    }
        
    void getWorkDeadline()
    {
	
	System.out.println("Complete by EOD");
	
    }
    void doActivity()
    {
	
	System.out.println("team Lunch");
    } 
   
    void isTodayAHoliday()
    {
   
    System.out.println("Today is not a Holiday");
    
    System.out.println("");
    }
}  

class TechDepartment extends SuperDepartment {
	void departmentName()
	{
 	      
	System.out.println("Welcome to Tech Department");
 
	}


	void getTodaysWork()
	{

	System.out.println("Complete coding of module 1");
 
	}
      
	void getWorkDeadline()
	{
 	 	
 	System.out.println("Complete by EOD");
 	
	}


	void getTechStackInformation()
	{
	 	     	
	System.out.println("core Java");
	} 


	void isTodayAHoliday()
	{
	    
	System.out.println("Today is not a Holiday");
	}
}

public class departmentClass {

	public static void main(String[] args) {
		
		AdminDepartment AD = new AdminDepartment ();
        
        AD.departmentName();
        AD.getTodaysWork();
        AD.getWorkDeadline();
        AD.isTodayAHoliday();
   
        HRDepartment HR =new HRDepartment();
    
        HR.departmentName();
        HR.doActivity();
        HR.getTodaysWork();
        HR.getWorkDeadline();
        HR.isTodayAHoliday();
        
        TechDepartment Tech = new TechDepartment();
        
        Tech.departmentName();
        Tech.getTodaysWork();
        Tech.getWorkDeadline();
        Tech.getTechStackInformation();
        Tech.isTodayAHoliday();
		
		
	}

}
