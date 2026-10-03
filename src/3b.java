import java.util.Scanner;
class WasteCollection{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("please enter the waste collected (in kg's):");
double waste = in.nextDouble();

if(waste >= 100){
System.out.println("Collection Target Achieved");
}
else{
System.out.println("More Waste Collection Required");
}
}
}
