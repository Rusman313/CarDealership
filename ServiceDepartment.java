import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    public ServiceDepartment() {
        super("Service", 20);
    }
    // Create "association between vehicle and Service Department"
    //Very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v){
        //Because ServiceDepartment doesn't "own"  the lifetime of the object its
        //good practice to ensure a valid object has been passed in 
        if (v != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        //SUNDAY is an example of an enumeration
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }
}