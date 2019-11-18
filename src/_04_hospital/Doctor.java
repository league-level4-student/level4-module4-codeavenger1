package _04_hospital;

import java.util.ArrayList;


public class Doctor {
	
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	boolean feelsCaredFor = false;
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorFullException {
		System.out.println(patientList.size());
		if (patientList.size() > 2) {
			throw new DoctorFullException();
		}
		
		patientList.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	
	
	public void doMedicine() {
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).checkPulse();
		}
	}
	
}
