import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimePattern{

public static void main(String[] args){
String my12HrPattern = "hh:mm:ss a";
String my24HrPattern = "HH:mm:ss";
var time = LocalDateTime.now();
System.out.println("12hr clock format: " + time.format(DateTimeFormatter.ofPattern(my12HrPattern)));
System.out.println("24hr clock format: " + time.format(DateTimeFormatter.ofPattern(my24HrPattern)));
}
}