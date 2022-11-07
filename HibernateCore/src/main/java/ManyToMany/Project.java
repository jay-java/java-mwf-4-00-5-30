package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	
	private int id;
	private String pname;
	@ManyToMany(mappedBy = "projects")
	private List<EMployee> employees;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<EMployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EMployee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", pname=" + pname + ", employees=" + employees + "]";
	}
	
}
