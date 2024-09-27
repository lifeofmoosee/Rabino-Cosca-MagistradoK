import java.util.Scanner;
public class clock {

  public int MinutestoSeconds(int minutes) {
    return minutes * 60;
}

public double MinutestoHours(int minutes) {
    return minutes / 60.0;
}

public int HourstoSeconds(int hours) {
    return hours * 3600;
}

public int HourstoMinutes(int hours) {
  return hours * 60;
}
 
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  clock clock = new clock();
  boolean continueConversion = true;

  while (continueConversion) {
      System.out.println("[3] Minutes to Seconds");
      System.out.println("[4] Minutes to Hours");
      System.out.println("[5] Hours to Seconds");
      System.out.println("[6] Hours to Minutes");
    int choice = scanner.nextInt();
      System.out.print("Enter the value: ");
            int value = scanner.nextInt();
            double result = 0;

    switch (choice) {
      case 3:
          result = clock.MinutestoSeconds(value);
          System.out.println("Minutes to seconds: " + result);
          break;
      case 4:
          result = clock.MinutestoHours(value);
          System.out.println("Minutes to hours: " + result);
          break;
      case 5:
          result = clock.HourstoSeconds(value);
          System.out.println("Hours to seconds: " + result);
          break;
      case 6:
          result = clock.HourstoMinutes(value);
          System.out.println("Hours to minutes: " + result);
          break;
      default:
          System.out.println("Invalid choice.");

    }
    System.out.print("Do you want to convert time? (Y/N): ");
    char continueChoice = scanner.next().charAt(0);
    continueConversion = (continueChoice == 'Y' || continueChoice == 'y');
  }

  scanner.close();
}
}
