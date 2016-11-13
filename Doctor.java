/**
 * 
 */
package main;

/**
 * @author niyer
 *
 */
public class Doctor implements Comparable<Doctor> {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAvailablity() {
		return availablity;
	}
	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getOfficeLocation() {
		return location;
	}
	public void setOfficeLocation(String area) {
		this.location = area;
	}

	public Doctor() {	
	}

	public Doctor(String name, Integer age, String sex, Integer rating, String speciality, String availablity, String location, Integer yearsOfExperience) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.speciality = speciality;
		this.availablity = availablity;
		this.yearsOfExperience = yearsOfExperience;
		this.rating = rating;
		this.location = location;
	}

	@Override
	public int compareTo(Doctor d) {

		/* For Ascending order*/
		return this.rating - d.rating;
	}

	private String name;
	private Integer age;
	private String sex;
	private Integer rating;
	private String speciality;
	private String availablity;
	private String location;
	private Integer yearsOfExperience;
}
