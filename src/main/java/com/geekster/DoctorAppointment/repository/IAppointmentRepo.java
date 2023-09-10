package com.geekster.DoctorAppointment.repository;

import com.geekster.DoctorAppointment.model.Appointment;
import com.geekster.DoctorAppointment.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

    Appointment findFirstByPatient(Patient patient);
}