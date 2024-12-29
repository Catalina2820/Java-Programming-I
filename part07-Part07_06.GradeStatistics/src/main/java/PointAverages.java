
import java.util.ArrayList;

public class PointAverages {

    private ArrayList<Integer> numbers;

    public PointAverages(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> average() {
        ArrayList<String> rta = new ArrayList<>();
        int suma1 = 0;
        int suma2 = 0;
        int cant1 = 0;
        int cant2 = 0;

        for (int number : numbers) {

            if (number >= 0 && number <= 100) {
                suma1 += number;
                cant1 += 1;

                if (number >= 50) {
                    suma2 += number;
                    cant2 += 1;
                }
            }
        }

        rta.add(String.valueOf(suma1 * 1.0 / cant1));

        if (cant2 != 0) {
            rta.add(String.valueOf(suma2 * 1.0 / cant2));
        } else {
            rta.add("-");
        }

        rta.add(String.valueOf(100.0 * cant2 / cant1));

        return rta;

    }

    public void gradeDistribution() {
        String f0 = "0: ", f1 = "1: ", f2 = "2: ", f3 = "3: ", f4 = "4: ", f5 = "5: ";
        for (Integer number : numbers) {

            if (number < 0 || number > 100) {
                continue;
            }

            if (number < 50) {
                f0 += "*";
            } else if (number < 60) {
                f1 += "*";
            } else if (number < 70) {
                f2 += "*";
            } else if (number < 80) {
                f3 += "*";
            } else if (number < 90) {
                f4 += "*";
            } else {
                f5 += "*";
            }
        }

        System.out.println(f5 + "\n" + f4 + "\n" + f3 + "\n" + f2 + "\n" + f1 + "\n" + f0);
    }
}
