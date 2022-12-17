package Clinic;

public class Main {
    public static void main(String[] args) {

        Plan plan1 = new Plan(1);
        Plan plan2 = new Plan(2);
        Plan plan = new Plan(9);

        Patient patient1 = new Patient(plan1);
        Patient patient2 = new Patient(plan2);
        Patient patient = new Patient(plan);

        Doctor doctor1 = patient1.getDoctor();
        Doctor doctor2 = patient2.getDoctor();
        Doctor doctor = patient.getDoctor();

        doctor1.treat();
        doctor2.treat();
        doctor.treat();
    }
}
