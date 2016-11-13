/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niyer
 *
 */
public class FindSimilarDoctors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Doctor> doctors = new ArrayList<Doctor>();

		Doctor doctor1 = new Doctor("Edward Homes", 39, "Male", 6, "Orthopedics", "DayTime", "San Francisco", 21);
		Doctor doctor2 = new Doctor("Ryan Edward", 38, "Male", 2, "Skin care", "Night", "Sunnyvale", 19);
		Doctor doctor3 = new Doctor("Akexis Johnson", 55, "Female", 10, "Orthopedics", "DayTime", "San Francisco", 30);
		Doctor doctor4 = new Doctor("Lucas Homberg", 20, "Male", 5, "Child care", "Night", "San Francisco", 8);
		Doctor doctor5 = new Doctor("Brooke Wells", 21, "Female", 9, "Orthopedics", "DayTime", "San Francisco", 3);

		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);

		Doctor doctor = new Doctor("Sara Sigmund", 23, "Female", 6, "Orthopedics", "DayTime", "San Francisco", 5);

		List<String> criteria = new ArrayList<String>();
		criteria.add("yearsofexperience");
		
		for(Doctor d: DoctorUtilities.findSimilarDoctorsByCriteria(doctor, doctors, criteria)) {
			System.out.println(d.getName());
		}
	}
}
