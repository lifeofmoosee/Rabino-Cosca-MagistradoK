import java.util.Scanner;
public class Hello {
  private int choice;

  //Using Scanner to input and using static because it is shared to all class
  static Scanner input = new Scanner(System.in);

  public Hello(int choice){
    this.choice = choice;
  }

  public void AllConversion(){
    System.out.println("[5] Hours to Seconds");
    System.out.println("[6] Hours to Minutes");
  }

  public void SwitchConversion(){
    System.out.println("Choose the Conversion");
    choice = input.nextInt();

    switch (choice) {
      case 5:
          //gay ni edgar
          break;
      case 6:
          // Conversion logic for hours to minutes
          break;
      default:
          // Handle invalid input
          break;
  }
  
  }
  //To convert second to minutes
  public double SecondtoMinutes(int seconds){
    return seconds / 60.0;
  }

  public double HourstoSeconds(int hours){
    return hours * 3600;
  }

  
    public static void main(String[] args)
    {
      System.out.println("Hello, world!");
    }
  }