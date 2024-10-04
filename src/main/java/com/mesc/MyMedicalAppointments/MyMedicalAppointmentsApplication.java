package com.mesc.MyMedicalAppointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMedicalAppointmentsApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(MyMedicalAppointmentsApplication.class, args);
		Doctor doctor = new Doctor();
		doctor.showName();*/


		Doctor myDoctor = new Doctor("Elena","Pedriatria");
		System.out.println(myDoctor.nombre);
		System.out.println(myDoctor.especialidad);

		Patient myPatient = new Patient("Alejandra", "alejandra@gmail.com");
		System.out.println(myPatient.getweight());
	}

}
