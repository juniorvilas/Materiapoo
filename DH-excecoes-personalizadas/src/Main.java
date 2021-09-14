public class Main {

    public static void main(String[] args) {

        try {
            Data data= new Data(100,10,2000);}
        catch (DataException e){
            System.err.println(e.getMessage());

        }
    }
}