/** 
 * Project Name:springdao 
 * File Name:Employee.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月1日 下午8:43:12 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import cn.bjfu.springdao.jpa.enums.EmployeeType;
import cn.bjfu.springdao.jpa.enums.PhoneType;

/** 
 * ClassName:Employee <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月1日 下午8:43:12 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
// 通知持久化引擎该类是一个实体
@Entity
@Table(name = "employee", schema="springdao")
public class Employee implements Serializable {

	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -581308461934077076L;

	// 注解了持久化标识，即唯一的标识键
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Long salary;
	private String phoneNum;
	
	@Basic(fetch = FetchType.LAZY)
	@Lob @Column(name = "picture")		// 大型对象的延迟加载
	private Byte[] picture;
	
	@Enumerated(EnumType.STRING)		// 默认的是插入序号 用插入值可以避免增加新的枚举类型序号的变化
	private EmployeeType type;
	
	@Temporal(TemporalType.DATE)		//java.util 日期类型需要指明隐射时JDBC处理的方式
	private Calendar dob;
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Transient
	private String combineArrt;		// 忽略，不将其映射到数据库
	
	// 当定义双向一对多（或多对一）关系时：
	// 多对一一方是所有方，在该方定义连接列
	// 一对多是反方，所以必须使用 mappedBy 元素，否则会生成一个中间联结表
	@ManyToOne
	@JoinColumn(name = "dept_id")	// JoinColumn 来实现外键关联，默认的话为
	private Department department;	// 源实体中的关系特性的名称_目标实体的主键名 
									// 按照惯例逻辑映射先出现，因为物理映射有默认值
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pspace_id")
	private ParkingSpace parkingSpace;
	
	// 多对多关系的实现是中间表(join table)，但是必须要有一方是mappedBy
	@ManyToMany
	@JoinTable(name = "emp_proj",
		joinColumns = @JoinColumn(name = "emp_id"),
		inverseJoinColumns = @JoinColumn(name = "proj_id")
			)
	private Collection<Project> projects;
	
	// 单项一对多关系，需要中间表
	@OneToMany
	@JoinTable(name = "emp_phone",
		joinColumns = @JoinColumn(name = "emp_id"),
		inverseJoinColumns = @JoinColumn(name = "phone_id")
			)
	private Collection<Phone> phones;
	
	@ElementCollection
	@CollectionTable(name = "emp_phoneNumber")
	@MapKeyEnumerated(EnumType.STRING)
	@MapKeyColumn(name = "phone_type")
	@Column(name = "phone_num")
	private Map<PhoneType, String> phoneNumbers;
	
	public Employee() {}
	public Employee(Integer id) { this.id = id; }
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getSalary() {
		return salary;
	}
	
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public Byte[] getPicture() {
		return picture;
	}
	
	public void setPicture(Byte[] picture) {
		this.picture = picture;
	}
	
	public EmployeeType getType() {
		return type;
	}
	
	public void setType(EmployeeType type) {
		this.type = type;
	}
	
	public String getCombineArrt() {
		return this.id + "; " + this.name;
	}
	
	public void setCombineArrt(String combineArrt) {
		this.combineArrt = combineArrt;
	}
	
	public Calendar getDob() {
		return dob;
	}
	
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}
	
	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	
	public Collection<Project> getProjects() {
		return projects;
	}
	
	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", phoneNum=" + phoneNum + ", picture="
				+ Arrays.toString(picture) + ", type=" + type + ", dob=" + dob
				+ ", startDate=" + startDate + ", combineArrt=" + combineArrt
				+ "]";
	}
}
 