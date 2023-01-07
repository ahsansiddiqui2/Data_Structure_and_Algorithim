/**
 * Question2
 */
public class Question2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Saddar");
		e.setLastName("Babar");
		e.setSalary(9000);
		e.YearlySalary(10);
	}
}
class Employee{
	private String FirstName;
	private String LastName;
	private int Salary;

	public void setFirstName(String FirstName){
		this.FirstName= FirstName;
	}
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public void setSalary(int Salary){
		if(Salary>0)
		this.Salary = Salary;
		else
		this.Salary=0;
	}
	public String getfirstName(){
		return FirstName;
	}
	public String getlastName(){
		return LastName;
	}
	public int getSalary(){
		return Salary;
	}
	public void YearlySalary(int percentage){
		int yearly = Salary*12;
		int raise = yearly*percentage/100;
		yearly+=raise;
		System.out.println("yearly income is : "+yearly);
	}
	Employee(){
		FirstName = "";
		LastName = "";
		Salary = 0;
	}


}