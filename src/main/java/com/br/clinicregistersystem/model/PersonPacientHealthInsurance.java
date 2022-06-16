package com.br.clinicregistersystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PersonPacientHealthInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long pacientHealthInsuranceId;

    @Column
    @Enumerated(EnumType.STRING)
    private PersonPacientHealthInsuranceName name;

    @Column
    private Long number;

    @Column
    @Enumerated(EnumType.STRING)
    private PersonPacientHealthInsuranceCoverage coverage;

    @Column
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime personRegisterDate;

    @Column
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime personLastUpdate;

    private Long personId;

}
