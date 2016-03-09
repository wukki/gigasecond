import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime date;

    public Gigasecond(LocalDateTime date) {
        this.date=date;
    }

    public Gigasecond(LocalDate date) {
        this.date=LocalDateTime.of(date.getYear(),date.getMonth(),date.getDayOfMonth(),0,0,0);
    }

    public LocalDateTime getDate() {
        return date.plusSeconds((int)Math.pow(10.0,9.0));
    }
}
