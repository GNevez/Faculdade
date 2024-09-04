package Date;
public class Date {
    private int Dia = 0;
    private int Mes = 0;
    private int Ano = 0;

    public Date(int dia, int mes, int ano) {
        this.Dia = dia;
        this.Mes = mes;
        this.Ano = ano;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public void displayDate() {
        System.out.println("Data: " + Dia + "/" + Mes + "/" + Ano);
    }

}
