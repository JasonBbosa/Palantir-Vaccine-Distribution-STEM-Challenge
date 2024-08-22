import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int answer;
    String answer2;

    String name = "";
    int app = 0;
    int app2 = 0;
    int currentVac = 0;
    int currentWk = 0;

    ArrayList<Data> list = new ArrayList<Data>();

    for (int i = 0; i < 2; i++) {
      if (i == 0) {
        System.out.println("Welcome to Palintir: Vaccine Distribution. Please complete the setup to start using the system. \n\nWhat is the name of the vaccination site?");
        name = scan.next();

        list.add(new Data());
        System.out.println();
        System.out.println(list.get(currentWk).toString());
        System.out.println("\nSetup complete.");
      }
      System.out.println("\n\nWelcome to Palintir: Vaccine Distribution. What would you like to do? \n\n(1) Submit data for resupply");
      answer = scan.nextInt();
      if (answer == 1) {
        currentWk++;
        int leftVac = list.get(currentWk - 1).getLeftoverVaccines();
        int givenVac;
        int givenVac2;
        int dlyWalk;
        System.out.println("\nHow many 1st dose vaccines were given this week?");
        givenVac = scan.nextInt();
        if (currentWk <= 3) {
          givenVac2 = 0;
        }
        else {
          System.out.println("\nHow many 2nd dose vaccines were given this week?");
          givenVac2 = scan.nextInt();
        }
        System.out.println("How many daily walk-ins did you get?");
        dlyWalk = scan.nextInt();

        leftVac -= (givenVac + givenVac2 + dlyWalk);
        list.add(new Data(givenVac, givenVac2, dlyWalk, leftVac));
        System.out.println(list.get(currentWk).toString());


        System.out.println("\nHow many 1st dose appointments do you have booked for next week?");
        app = scan.nextInt();

        if (currentWk >= 4)
          app2 = list.get(currentWk - 3).getGivenVaccines();

        System.out.println("Do you expect any daily walk-ins next week? (Y or N)");
        answer2 = scan.next();
        if (answer2.equals("Y")) {
          System.out.println("How many daily walk-ins do you expect?");
          dlyWalk = scan.nextInt();
        }
        else if(answer2.equals("N"))
          dlyWalk = 0;

        int resupply;

        if (list.get(currentWk).getLeftoverVaccines() < (app + dlyWalk)) {
          resupply = (app + dlyWalk) - (list.get(currentWk).getLeftoverVaccines());

          System.out.println("You will be resupplied with " + resupply + " vaccines for Week " + (currentWk + 1));
        }
        else  
          System.out.println("No resupply is needed");
      }
      System.out.println("\nThank you. Returning to main menu...");
    }
  }
}
    
    /*System.out.println(
        "\nWelcome to Palintir: Vaccine Distribution. In order to begin, you must get through the setup phase. Please input the data from Week 1.");
    
    System.out.println("\nHow many 1st dose vaccines were given this week?");
    answer = scan.nextInt();
    int givenVac = answer;
    int givenVac2 = 0;
    int dlyWalk = 0;

    System.out.println("Do you allow daily walk-ins? (Y or N)");
    answer2 = scan.next();
    if (answer2.equals("Y")) {
      System.out.println("How many daily walk-ins did you get?");
      answer = scan.nextInt();
      dlyWalk = answer;
    }

    list.add(new Data(givenVac, givenVac2, dlyWalk));

    System.out.println(list.get(currentWk).toString());

    System.out.println("Setup complete.");*/
/*
    if (option == 1) {
      System.out.println("\nWhat Week # is it currently?");
      answer = scan.nextInt();
      currentWk = answer;

      System.out.println("\nHow many 1st dose appointments do you have booked for next week?");
      app = scan.nextInt();

      if (currentWk >= 4)
        app2 = list.get(currentWk - 4).getGivenVaccines();

      if (answer2.equals("Y")) {
        System.out.println("How many daily walk-ins do you expect next week?");
        dlyWalk = scan.nextInt();
      }

      list.add(new Data(app, app2, dlyWalk));
      /*list.get(currentWk - 1).setLeftoverVaccines(list.get(currentWk - 2).getLeftoverVaccines());*/

    // for (int i = 0; i < list.size(); i++)
    // System.out.println(list.get(i).toString());
/*
    int resupply;

    System.out.println(list.get(currentWk - 1).toString());

    if (app + list.get(currentWk - 1).getDailyWalkins() > list.get(currentWk - 2).getLeftoverVaccines()) {
      resupply = (app + list.get(currentWk - 1).getDailyWalkins() - list.get(currentWk - 2).getLeftoverVaccines());
      System.out.println("\nYou will be resupplied with " + resupply + " vaccines");
    } else
      System.out.println("\nNo resupply is needed");*/