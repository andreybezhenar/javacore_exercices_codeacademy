//problem: define the state and behavior of the droids using instance fields and methods. 
//decision: 


//class:
public class Droid
{

//fields:
String name;
int batteryLevel;


//constructor:
public Droid(String droidName)
{
  name = droidName;
  batteryLevel = 100;
}


//methods:
public void performTask(String task)
{
  System.out.print(name + " is performing task: " + task);
}

public void whatIsBatteryLevel(int afterOneAction)
{
int newBatterLevel = batteryLevel - afterOneAction;
batteryLevel = newBatterLevel;
}


//method toString():
public String toString()
{
return "Droid name is: " + name + " and battery level is: " + batteryLevel;
}


//main:
public static void main(String[] args)
{


//create instance:
Droid myDroid = new Droid("Andrey");


//print information about our instance:
System.out.println(myDroid.name);
System.out.println(myDroid.batteryLevel);


//or:
System.out.println();
System.out.println(myDroid);


//using method 1 – task:
System.out.println();
myDroid.performTask("programming on Java");


//using method 2 – battery level after task:
System.out.println();
myDroid.whatIsBatteryLevel(10);


//print information about our instance:
System.out.println(myDroid);

}
}
