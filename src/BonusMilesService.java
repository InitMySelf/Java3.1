import java.util.concurrent.atomic.AtomicInteger;

public class BonusMilesService {
    public int calculate(int cost) {
        int miles = cost / 20;
        return miles;
    }
}




