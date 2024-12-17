package patil.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //map the entity class with database table
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="empid")
	private int id;
	@Column(name="empname")
	private String name;
	@Column(name="empsal")
	private int sal;
	@Column(name="empqual")
	private String qual;
	
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
