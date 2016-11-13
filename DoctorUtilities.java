/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author niyer
 *
 */
public class DoctorUtilities {

	/**
	 * Returns the list of similar doctors sorted based on rating , for a specific criteria(s)
	 * @param d
	 * @param similarDoctors
	 * @param criteria
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByCriteria(Doctor d, List<Doctor> similarDoctors, List<String> criteria) {

		if (criteria.size() == 0) {
			similarDoctors = findSimilarDoctorsByAge(similarDoctors, d);
			similarDoctors = findSimilarDoctorsBySex(similarDoctors, d);
			similarDoctors = findSimilarDoctorsByRating(similarDoctors, d);
			similarDoctors = findSimilarDoctorsBySpeciality(similarDoctors, d);
			similarDoctors = findSimilarDoctorsByAvailibity(similarDoctors, d);
			similarDoctors = findSimilarDoctorsByLocation(similarDoctors, d);
			similarDoctors = findSimilarDoctorsByYearsOfExperience(similarDoctors, d);

			Collections.sort(similarDoctors);
			return similarDoctors;
		}

		for (int i = 0; i < criteria.size(); i++) {
			switch(criteria.get(i).toLowerCase()) {
			case "age" : 
				similarDoctors = findSimilarDoctorsByAge(similarDoctors, d);
				break;
			case "sex" : 
				similarDoctors = findSimilarDoctorsBySex(similarDoctors, d);
				break;
			case "rating" : 
				similarDoctors = findSimilarDoctorsByRating(similarDoctors, d);
				break;
			case "speciality" : 
				similarDoctors = findSimilarDoctorsBySpeciality(similarDoctors, d);
				break;
			case "availability" : 
				similarDoctors = findSimilarDoctorsByAvailibity(similarDoctors, d);
				break;
			case "location" : 
				similarDoctors = findSimilarDoctorsByLocation(similarDoctors, d);
				break;
			case "yearsofexperience" : 
				similarDoctors = findSimilarDoctorsByYearsOfExperience(similarDoctors, d);
				break;
			}
		}

		Collections.sort(similarDoctors);
		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on age
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByAge(List<Doctor> doctors, Doctor d) {

		final int doctorAge = d.getAge();
		final int DIFF = 5;
		List<Doctor> similarDoctors = new ArrayList<Doctor>();

		for(int i = 0; i < doctors.size(); i++) {
			final int currentDoctorAge = doctors.get(i).getAge();
			if(((doctorAge - DIFF) <= currentDoctorAge) && (currentDoctorAge <= (doctorAge + DIFF))) {
				similarDoctors.add(doctors.get(i));
			}	
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on sex
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsBySex(List<Doctor> doctors, Doctor d) {

		final String doctorSex = d.getSex().toUpperCase();
		List<Doctor> similarDoctors = new ArrayList<Doctor>();

		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctorSex = doctors.get(i).getSex().toUpperCase();

			if(doctorSex.equals(currentDoctorSex)) {
				similarDoctors.add(doctors.get(i));
			}
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on Speciality
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsBySpeciality(List<Doctor> doctors, Doctor d) {

		List<Doctor> similarDoctors = new ArrayList<Doctor>();
		final String doctorSpeciality = d.getSpeciality().toUpperCase();

		for (Doctor tempdoc : doctors) {
			final String currentDoctorSpeciality = tempdoc.getSpeciality().toUpperCase();

			if(doctorSpeciality.equals(currentDoctorSpeciality)) {
				similarDoctors.add(tempdoc);
			}
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on Availibity
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByAvailibity(List<Doctor> doctors, Doctor d) {

		final String availability = d.getAvailablity().toUpperCase();
		List<Doctor> similarDoctors = new ArrayList<Doctor>();

		for(int i = 0; i < doctors.size(); i++) {

			final String currentAvailability = doctors.get(i).getAvailablity().toUpperCase();

			if(availability.equals(currentAvailability)) {
				similarDoctors.add(doctors.get(i));
			}
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on Location
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByLocation(List<Doctor> doctors, Doctor d) {

		List<Doctor> similarDoctors = new ArrayList<Doctor>();
		final String doctorLocation = d.getOfficeLocation().toUpperCase();

		for(int i = 0; i < doctors.size(); i++) {
			final String currentDoctorLocation = doctors.get(i).getOfficeLocation().toUpperCase();

			if(doctorLocation.contains(currentDoctorLocation)) {
				similarDoctors.add(doctors.get(i));
			}
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on Rating
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByRating(List<Doctor> doctors, Doctor d) {

		List<Doctor> similarDoctors = new ArrayList<Doctor>();
		final int doctorRating = d.getRating();
		final int DIFF = 2;

		for(int i = 0; i < doctors.size(); i++) {
			final int currentDoctorRating = doctors.get(i).getRating();

			if(((doctorRating - DIFF) <= currentDoctorRating) && (currentDoctorRating <= (doctorRating + DIFF))) {
				similarDoctors.add(doctors.get(i));
			}
		}

		return similarDoctors;
	}

	/**
	 * Returns the list of similar doctors based on YearsOfExperience
	 * @param doctors
	 * @param d
	 * @return
	 */
	public static List<Doctor> findSimilarDoctorsByYearsOfExperience(List<Doctor> doctors, Doctor d) {

		final int doctorYearsOfExperience = d.getYearsOfExperience();
		final int DIFF = 5;
		List<Doctor> similarDoctors = new ArrayList<Doctor>();

		for(int i = 0; i < doctors.size(); i++) {
			final int currentYearsOfExperience = doctors.get(i).getYearsOfExperience();

			if(((doctorYearsOfExperience - DIFF) <= currentYearsOfExperience) && (currentYearsOfExperience <= (doctorYearsOfExperience + DIFF))) {
				similarDoctors.add(doctors.get(i));
			}
		}

		return similarDoctors;
	}
}
