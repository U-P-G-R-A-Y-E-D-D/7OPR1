package cz.osu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person("Aleš", 22);
        p.print();

        Student s = new Student("Petr", 18, "Informatika");
        s.print();

        Person p2 = new Student("Jiří", 23, "Matematika");
        p2.print();


        int[] numbers = new int[] {5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double mean = (double)sum/numbers.length;
        System.out.println(mean);


        sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }
        mean = (double)sum/count;
        System.out.println(mean);
    }
}
