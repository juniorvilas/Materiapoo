

public class Data {
    int day;
    int month;
    int year;

    public Data(int d, int m, int y) throws  DataException
    {
        if (d<1||d>31)
            throw new DataException("Error no día");
        day=d;
        if (d<1||d>31)
            throw new DataException("Error no mês");
        month=m;
        year=y;
        year=y;
    }


}