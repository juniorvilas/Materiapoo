

public class Data1 {
    private int day;
    private int month;
    private int year;

    public Data1(int d, int m, int y) {
        if (d < 1 || d > 31 || m < 1 || m > 12)
            throw new RuntimeException("OS valores não são válidos");
        day = d;
        month = m;
        year = y;
    }
}
