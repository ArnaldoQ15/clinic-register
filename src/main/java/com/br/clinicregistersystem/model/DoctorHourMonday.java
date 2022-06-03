package com.br.clinicregistersystem.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity(name = "doctorHourMonday")
public class DoctorHourMonday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "doctorHourMondayId",unique=true, nullable=false)
    private Long doctorHourMondayId;

    @ManyToOne(cascade=CascadeType.ALL)
    private Doctor doctor;

    @Column(name = "doctorName")
    @NotNull
    private String doctorName;

    @Column(name = "doctorEspeciality")
    @NotNull
    private String doctorEspeciality;

    @Column(name = "all_doctor_hours_monday")
    private String todasHorasDoutor;

    @Column
    @NotNull
    private Boolean m0800;

    @Column
    @NotNull
    private Boolean m0830;

    @Column
    @NotNull
    private Boolean m0900;

    @Column
    @NotNull
    private Boolean m0930;

    @Column
    @NotNull
    private Boolean m1000;

    @Column
    @NotNull
    private Boolean m1030;

    @Column
    @NotNull
    private Boolean m1100;

    @Column
    @NotNull
    private Boolean m1130;

    @Column
    @NotNull
    private Boolean a1400;

    @Column
    @NotNull
    private Boolean a1430;

    @Column
    @NotNull
    private Boolean a1500;

    @Column
    @NotNull
    private Boolean a1530;

    @Column
    @NotNull
    private Boolean a1600;

    @Column
    @NotNull
    private Boolean a1630;

    @Column
    @NotNull
    private Boolean a1700;

    @Column
    @NotNull
    private Boolean a1730;

    @Column
    @NotNull
    private Boolean n1800;

    @Column
    @NotNull
    private Boolean n1830;

    @Column
    @NotNull
    private Boolean n1900;

    @Column
    @NotNull
    private Boolean n1930;

    public DoctorHourMonday() {
        this.m0800 = false;
        this.m0830 = false;
        this.m0900 = false;
        this.m0930 = false;
        this.m1000 = false;
        this.m1030 = false;
        this.m1100 = false;
        this.m1130 = false;
        this.a1400 = false;
        this.a1430 = false;
        this.a1500 = false;
        this.a1530 = false;
        this.a1600 = false;
        this.a1630 = false;
        this.a1700 = false;
        this.a1730 = false;
        this.n1800 = false;
        this.n1830 = false;
        this.n1900 = false;
        this.n1930 = false;
    }

    @Override
    public String toString() {
        return "DoctorHourMonday{" +
                "m0800=" + m0800 +
                ", m0830=" + m0830 +
                ", m0900=" + m0900 +
                ", m0930=" + m0930 +
                ", m1000=" + m1000 +
                ", m1030=" + m1030 +
                ", m1100=" + m1100 +
                ", m1130=" + m1130 +
                ", a1400=" + a1400 +
                ", a1430=" + a1430 +
                ", a1500=" + a1500 +
                ", a1530=" + a1530 +
                ", a1600=" + a1600 +
                ", a1630=" + a1630 +
                ", a1700=" + a1700 +
                ", a1730=" + a1730 +
                ", n1800=" + n1800 +
                ", n1830=" + n1830 +
                ", n1900=" + n1900 +
                ", n1930=" + n1930 +
                '}';
    }
}