/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.List;

import main.Doctor;
import main.DoctorUtilities;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author niyer
 *
 */
public class FindSimilarDoctorsTest {

	@Test
	public void test() {

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

		List<String> criteria1 = new ArrayList<String>();
		criteria1.add("age");

		List<Doctor> resdoctors1 = DoctorUtilities.findSimilarDoctorsByCriteria(doctor, doctors, criteria1);

		List<Doctor> outputdoctors1 = new ArrayList<Doctor>();
		outputdoctors1.add(doctor4);
		outputdoctors1.add(doctor5);

		Assert.assertEquals(resdoctors1, outputdoctors1);



		List<String> criteria2 = new ArrayList<String>();
		criteria2.add("age");
		criteria2.add("location");
		criteria2.add("speciality");

		List<Doctor> resdoctors2 = DoctorUtilities.findSimilarDoctorsByCriteria(doctor, doctors, criteria2);

		List<Doctor> outputdoctors2 = new ArrayList<Doctor>();
		outputdoctors2.add(doctor5);

		Assert.assertEquals(resdoctors2, outputdoctors2);




		List<String> criteria3 = new ArrayList<String>();
		criteria3.add("rating");

		List<Doctor> resdoctors3 = DoctorUtilities.findSimilarDoctorsByCriteria(doctor, doctors, criteria3);

		List<Doctor> outputdoctors3 = new ArrayList<Doctor>();
		outputdoctors3.add(doctor4);
		outputdoctors3.add(doctor1);

		Assert.assertEquals(resdoctors3, outputdoctors3);



		List<String> criteria4 = new ArrayList<String>();

		List<Doctor> resdoctors4 = DoctorUtilities.findSimilarDoctorsByCriteria(doctor, doctors, criteria4);

		List<Doctor> outputdoctors4 = new ArrayList<Doctor>();

		Assert.assertEquals(resdoctors4, outputdoctors4);
	}
}
