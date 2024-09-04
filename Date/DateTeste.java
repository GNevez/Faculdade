package Date;
public class DateTeste {
    public static void main(String[] args) {
        Date date = new Date(10, 8, 2004);
        date.displayDate();

        date.setDia(16);
        date.setMes(10);
        date.setAno(2003);

        date.displayDate();
    }
}
