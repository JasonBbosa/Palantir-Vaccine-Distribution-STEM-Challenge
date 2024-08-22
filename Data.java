public class Data {
  private static int weekID = 0;
  private int currentWeek;
  private int givenVaccines;
  private int givenVaccines2;
  private int dailyWalkins;
  private int leftoverVaccines;
  

  public Data() {
    currentWeek = weekID;
    givenVaccines = 0;
    givenVaccines2 = 0;
    dailyWalkins = 0;
    leftoverVaccines = 1000;
  }

  public Data(int givenVac, int givenVac2, int dlyWalk, int leftVac) {
    weekID++;
    currentWeek = weekID;
    if (givenVac >= 0)
      givenVaccines = givenVac;
    if (givenVac2 >= 0)
      givenVac2 = givenVaccines2;
    if (dlyWalk >= 0);
      dailyWalkins = dlyWalk;
    if (leftVac >= 0)
      leftoverVaccines = leftVac;
  }

  public int getWeekID()
  {
    return currentWeek;
  }
  public int getGivenVaccines()
  {
    return givenVaccines;
  }
  public int getGivenVaccines2()
  {
    return givenVaccines2;
  }
  public int getDailyWalkins()
  {
    return dailyWalkins;
  }
  public int getLeftoverVaccines()
  {
    return leftoverVaccines;
  }
  public void setLeftoverVaccines(int leftVac)
  {
    leftoverVaccines = leftVac;
  }

  public String toString()
  {
    String weekString = "";
    weekString += "Week " + getWeekID();
    weekString += "\n\t1st dose vaccines given: " + getGivenVaccines();
    weekString += "\n\t2nd dose vaccines given: " + getGivenVaccines2();
    weekString += "\n\tDaily walkins: " + getDailyWalkins();
    weekString += "\n\tLeftover vaccines: " + getLeftoverVaccines();
    return weekString;
  }
}