package Clinic;

public class Patient {
    public Plan plan;
    public Patient(Plan plan) {
        this.plan = plan;
    }

    public Doctor getDoctor () {
        if (plan.getNumber() == 1) {
            return new Surgeon();
        } else if (plan.getNumber() == 2) {
            return new Dentist();
        } else  {
            return new Therapist();
        }
    }
}
