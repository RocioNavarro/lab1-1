package org.austral.ing.lab1;


import org.austral.ing.lab1.persistence.Medics;
import org.austral.ing.lab1.persistence.Patients;

import javax.persistence.EntityManager;

public class HCSystemRepository {
    private final Patients patients;
    private final Medics medics;

    public HCSystemRepository(EntityManager entityManager) {
        this.patients = new Patients(entityManager);
        this.medics = new Medics(entityManager);
    }

    public static HCSystemRepository create(EntityManager entityManager) {
        return new HCSystemRepository(entityManager);
    }

    public Patients patients() {
        return patients;
    }

    public Medics medics(){
        return medics;
    }
}
