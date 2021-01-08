import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    LocalDateTime gigaSecondLater;

    public Gigasecond(LocalDate moment) {
      gigaSecondLater = moment.atStartOfDay().plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
      gigaSecondLater = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
      return gigaSecondLater;
    }
}
