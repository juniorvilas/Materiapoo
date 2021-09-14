public class Data2 {
    private int day;
    private int month;
    private int year;

    public Data2(int d, int m, int y)  throws Exception{
        if (d < 1 || d > 31 || m < 1 || m > 12)
            throw new Exception("Os valores não são válidos");
        day = d;
        month = m;
        year = y;
    }
}
