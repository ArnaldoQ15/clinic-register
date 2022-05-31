package com.br.clinicregistersystem.model;

import lombok.Getter;

@Getter
public enum PacientHealthInsuranceName {

    NOTREDAME_INTERMEDICA("NotreDame Intermédica"),
    HAPVIDA_ASSISTENCIA_MEDICA("Hapvida Assistência Médica"),
    BRADESCO_SAUDE("Bradesco Saúde"),
    AMIL_ASSISTENCIA_MEDICA("Amil Assistência Médica"),
    SULAMERICA_SAUDE("SulAmérica Saúde"),
    SEGUROS_UNIMED_SAUDE("Seguros Unimed Saúde"),
    PREVENT_SENIOR("Prevent Senior"),
    ASSIM_SAUDE("Assim Saúde"),
    PORTO_SEGURO_SAUDE("Porto Seguro Saúde");

    private final String description;

    PacientHealthInsuranceName(String description) {
        this.description = description;
    }

}
