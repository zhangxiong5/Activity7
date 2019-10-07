package bikeproject;

public class Bike implements BikeParts{

  private String handleBars, frame, tyres, seatType;
  private int NumGears;
  private final String make;

  public final String MAKE = "Oracle Bikes";

  //required methods after implementation
  public String getHandleBars(){
    return handleBars;
  };

  public void setHandleBars(String newValue){
    this.handleBars = newValue;
  };

  public String getTyres(){
    return tyres;
  };

  public void setTyres(String newValue){
    this.tyres = newValue;
  };

  public String getSeatType(){
    return seatType;
  };

  public void setSeatType(String newValue){
    this.seatType = newValue;
  };

  public Bike() {
    this.make = "Oracle Cycles";
  }//end constructor

  public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
    this.handleBars = handleBars;
    this.frame = frame;
    this.tyres = tyres;
    this.seatType = seatType;
    NumGears = numGears;
    this.make = "Oracle Cycles";
  }//end constructor

  protected void printDescription() {
    System.out.println("\n" + this.make + "\n"
        + "This bike has " + this.handleBars + " handlebars on a "
        + this.frame + " frame with " + this.NumGears + " gears."
        + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
  }//end method printDescription

}//end class Bike
	
	

