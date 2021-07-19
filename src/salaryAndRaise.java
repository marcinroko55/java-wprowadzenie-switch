import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class salaryAndRaise {
    public static void main(String[] args) {

        int salary = 2500;
        double salaryAfterRaise = salary;
        System.out.println("Pensja wynosiła: " + salary);

        switch (salary) {
            case 100:
                salaryAfterRaise = salary + 1000;
                break;
            case 2000:
                int raise2 = 200;
                salaryAfterRaise = salary + 200;
                break;
            case 2500:
                int raise3 = 25;
                salaryAfterRaise = salary + 25;
                break;

        }
        System.out.println("Pensja po podwyżce wynosi " + salaryAfterRaise);
        System.out.println("Pensja wzrosła o " + (((salaryAfterRaise - salary) / salary) * 100) + "%");


    }
}
