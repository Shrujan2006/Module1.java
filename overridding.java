
class overridding {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[] {
            new Doctor("Dr. Patel"),
            new Dentist("Dr. Mehta"),
            new Cardiologist("Dr. Roy"),
            new Surgeon("Dr. Singh")
        };

        for (Doctor d : doctors) {
            d.consultationFee();
        }
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    
    void consultationFee() {
        System.out.println(name + " (General Doctor) consultation fee: Rs. 500");
    }
}

class Dentist extends Doctor {
    Dentist(String name) {
        super(name);
    }

    @Override
    void consultationFee() {
        System.out.println(name + " (Dentist) consultation fee: Rs. 800");
    }
}

class Cardiologist extends Doctor {
    Cardiologist(String name) {
        super(name);
    }

    @Override
    void consultationFee() {
        System.out.println(name + " (Cardiologist) consultation fee: Rs. 1200");
    }
}

class Surgeon extends Doctor {
    Surgeon(String name) {
        super(name);
    }

    @Override
    void consultationFee() {
        System.out.println(name + " (Surgeon) consultation fee: Rs. 2000");
    }
}



    
