package Enum_Static.Date;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public Date(String nomeMes, int dia, int ano) {
        this.mes = converterMesParaNumero(nomeMes);
        this.dia = dia;
        this.ano = ano;
    }

    public Date(int diaDoAno, int ano) {
        this.ano = ano;
        calcularData(diaDoAno);
    }

    private int converterMesParaNumero(String nomeMes) {
        return switch (nomeMes.toLowerCase()) {
            case "janeiro" -> 1;
            case "fevereiro" -> 2;
            case "março" -> 3;
            case "abril" -> 4;
            case "maio" -> 5;
            case "junho" -> 6;
            case "julho" -> 7;
            case "agosto" -> 8;
            case "setembro" -> 9;
            case "outubro" -> 10;
            case "novembro" -> 11;
            case "dezembro" -> 12;
            default -> 1;
        };
    }

    private void calcularData(int diaDoAno) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if (isAnoBissexto(this.ano)) {
            diasPorMes[1] = 29;
        }

        int diasRestantes = diaDoAno;
        this.mes = 1;

        for (int i = 0; i < diasPorMes.length; i++) {
            if (diasRestantes <= diasPorMes[i]) {
                this.mes = i + 1;
                this.dia = diasRestantes;
                break;
            }
            diasRestantes -= diasPorMes[i];
        }
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String formatoPadrao() {
        return String.format("%02d/%02d/%04d", mes, dia, ano);
    }

    public String formatoPorExtenso() {
        String nomeMes = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Janeiro";
        };
        return String.format("%s %d, %04d", nomeMes, dia, ano);
    }

    public String formatoDiaAno() {
        return String.format("%03d %04d", calcularDiaDoAno(), ano);
    }

    private int calcularDiaDoAno() {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if (isAnoBissexto(this.ano)) {
            diasPorMes[1] = 29;
        }

        int diaDoAno = 0;
        for (int i = 0; i < mes - 1; i++) {
            diaDoAno += diasPorMes[i];
        }
        diaDoAno += dia;
        return diaDoAno;
    }

    public void exibirFormatos() {
        System.out.println("MM/DD/YYYY: " + formatoPadrao());
        System.out.println("Texto mes: " + formatoPorExtenso());
        System.out.println("Dia do ano: " + formatoDiaAno());
    }

    public static void main(String[] args) {
        Date data1 = new Date(6, 14, 1992);
        Date data2 = new Date("Junho", 14, 1992);
        Date data3 = new Date(165, 1992);

        System.out.println("Data no formato MM/DD/YYYY:");
        data1.exibirFormatos();

        System.out.println("\nData no formato Texto Mes:");
        data2.exibirFormatos();

        System.out.println("\nData no formato Dia do Ano:");
        data3.exibirFormatos();
    }
}
