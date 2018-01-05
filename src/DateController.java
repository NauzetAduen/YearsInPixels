import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateController {
    private Date today;

    public DateController() {
        Calendar day = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        this.today = day.getTime();

    }

    public Date getToday() {
        return today;
    }

    public boolean isNotValid(int day, int month){

        return !(getToday().after(passedDate(day, month)));
    }

    private Date passedDate(int day, int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
