package CollectionExample.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    String disease;
    String doctor;
    boolean emergency;

    Patient(int patientId, String name, int age, String disease,
            String doctor, boolean emergency) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.doctor = doctor;
        this.emergency = emergency;
    }

    void display() {
        System.out.println("ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age +
                ", Disease: " + disease +
                ", Doctor: " + doctor +
                ", Emergency: " + emergency);
    }
}

public class PatientManagement {

    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // 1. Add Patient
    static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        System.out.print("Is Emergency? (true/false): ");
        boolean emergency = sc.nextBoolean();

        patients.add(new Patient(id, name, age, disease, doctor, emergency));

        System.out.println("Patient added successfully!");
    }

    // 2. Display Patients
    static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patients) {
            p.display();
        }
    }

    // 3. Search by Patient ID
    static void searchById() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        for (Patient p : patients) {
            if (p.patientId == id) {
                p.display();
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // 4. Search by Disease
    static void searchByDisease() {
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        boolean found = false;

        for (Patient p : patients) {
            if (p.disease.equalsIgnoreCase(disease)) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No patient found with this disease.");
        }
    }

    // 5. Update Patient Details
    static void updatePatient() {
        System.out.print("Enter Patient ID to update: ");
        int id = sc.nextInt();

        for (Patient p : patients) {
            if (p.patientId == id) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                p.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                p.age = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Disease: ");
                p.disease = sc.nextLine();

                System.out.print("Enter New Doctor: ");
                p.doctor = sc.nextLine();

                System.out.print("Is Emergency? (true/false): ");
                p.emergency = sc.nextBoolean();

                System.out.println("Patient updated successfully!");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // 6. Delete Patient
    static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = sc.nextInt();

        for (Patient p : patients) {
            if (p.patientId == id) {
                patients.remove(p);
                System.out.println("Patient deleted successfully!");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // 7. Display Patients Assigned to a Doctor
    static void patientsByDoctor() {
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        boolean found = false;

        for (Patient p : patients) {
            if (p.doctor.equalsIgnoreCase(doctor)) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No patients assigned to this doctor.");
        }
    }

    // 8. Display Emergency Patients
    static void emergencyPatients() {
        boolean found = false;

        for (Patient p : patients) {
            if (p.emergency) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No emergency patients.");
        }
    }

    // 9. Count Patients
    static void countPatients() {
        System.out.println("Total Patients: " + patients.size());
    }

    // 10. Find Oldest Patient
    static void oldestPatient() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }

        Patient oldest = patients.get(0);

        for (Patient p : patients) {
            if (p.age > oldest.age) {
                oldest = p;
            }
        }

        System.out.println("Oldest Patient:");
        oldest.display();
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Patient Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search by Patient ID");
            System.out.println("4. Search by Disease");
            System.out.println("5. Update Patient");
            System.out.println("6. Delete Patient");
            System.out.println("7. Patients Assigned to Doctor");
            System.out.println("8. Emergency Patients");
            System.out.println("9. Count Patients");
            System.out.println("10. Find Oldest Patient");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    displayPatients();
                    break;

                case 3:
                    searchById();
                    break;

                case 4:
                    searchByDisease();
                    break;

                case 5:
                    updatePatient();
                    break;

                case 6:
                    deletePatient();
                    break;

                case 7:
                    patientsByDoctor();
                    break;

                case 8:
                    emergencyPatients();
                    break;

                case 9:
                    countPatients();
                    break;

                case 10:
                    oldestPatient();
                    break;

                case 11:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}