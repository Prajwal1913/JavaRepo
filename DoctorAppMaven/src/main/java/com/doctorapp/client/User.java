package com.doctorapp.client;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
        Specialization specialization = Specialization.PEDIA;
        String speciality = specialization.getSpeciality();
        // Doctor doctor = new Doctor("Harish", speciality,200,9,8);
        // doctor = new Doctor("Suresh", speciality,150,7,12);
        // doctor = new Doctor("Kumar", speciality,300,10,15);
        // doctor = new Doctor("Naveen", speciality, 400, 8, 10);
        // doctor = new Doctor("Nandish", speciality, 200, 10, 18);

        //doctorService.addDoctor(doctor);

        Doctor doctor = new Doctor();
        doctorService.updateDoctor(11, 150);

        doctorService.deleteDoctor(1);
        try {
            System.out.println(doctorService.getById(12));
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Doctor> doctors = doctorService.getAll();
        for (Doctor allDoctors : doctors) {
            System.out.println(allDoctors);
        }

        System.out.println("-----------------------");
        List<Doctor> doctorBySpecialityAndExp= null;
        try {
            doctorBySpecialityAndExp = doctorService.getBySpecialityAndExp("PULMOLOGIST",18);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Doctor doctorsBySpecialityAndExp:doctorBySpecialityAndExp){
            System.out.println(doctorsBySpecialityAndExp);
        }

        System.out.println("-----------------------");
        List<Doctor> doctorBySpecialityAndLessFees=null;
        try {
            doctorBySpecialityAndLessFees = doctorService.getBySpecialityAndLessFees("ORTHOPEDIC",300);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Doctor doctorsBySpecialityAndLessFees:doctorBySpecialityAndLessFees){
            System.out.println(doctorsBySpecialityAndLessFees);
        }
    }
}
