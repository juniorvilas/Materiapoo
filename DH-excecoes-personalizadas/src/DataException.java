public class DataException extends  Exception{

    public DataException()
    {
        super();
    }
    public DataException(String mensagem)
    {
        super(mensagem);
    }
    public String toString()
    {
        return "A seguinte exceção ocorreu" + this.getClass().getName() +"\n" +
                " Mensagem: " + this.getMessage() + "\n" ;
    }
}