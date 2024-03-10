package com.doctorapp.model;

public enum Specialization {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    NEURO("NEUROLOGIST"),
    PULMO("PULMOLOGIST");

    private String speciality;
    Specialization(String speciality) {
        this.speciality =speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
