package bibleHW;

public class Bible {
	public static void main(String[] args) {
        System.out.println("You need " + yearsToTrain(13, 2) + " years to convert the whole world!");
        traineesRequired();
        howManyToTrain();
    }

    public static int yearsToTrain(long count, int studentsEach) {
        long total = 7700000000L;
        int yearCount = 0;

        do {
            long temp;
            temp = (count * studentsEach) + count;
            count = temp;
            yearCount++;
        }
        while(count < total);

        int totalYears1 = yearCount * 3;

          return totalYears1;
    }

    public static void traineesRequired() {
        long num = 1;
        while(yearsToTrain(num, 2) > 50) {
            num++;

        }
        System.out.println("You need " + num + " starting disciples to conver the world in 50 years.");
    }

    public static void howManyToTrain() {
        int num = 2;

        while (yearsToTrain(13, num) > 50) {
            num++;
        }

        System.out.println("Each disciple would need to train " + num + " students to convert the world in 50 years.");

    }
}