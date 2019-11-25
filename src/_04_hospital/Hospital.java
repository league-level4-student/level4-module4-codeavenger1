package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	ArrayList<Doctor> docArray = new ArrayList<Doctor>();
	
	ArrayList<Patient> patientArray = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		docArray.add(d);
	}

	public ArrayList<Doctor> getDoctors() {
		return docArray;
	}
	
	public void addPatient (Patient p) {
		patientArray.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patientArray;
	}
	
	public void assignPatientsToDoctors() {
		for (int i = 0; i < patientArray.size(); i++) {
			for (int j = 0; j < docArray.size(); j++) {
				
				if (docArray.get(j).patientList.size()<3) {
					docArray.get(j).patientList.add(patientArray.get(i));
					break;
				}
			}
		}
	}
	}
