package memento;

//备忘录类
public class EmpMemento {
	private String ename;
	private int age;
	private double salary;

	public EmpMemento(Emp emp) {
		// TODO Auto-generated constructor stub
		this.ename = emp.getEname();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
