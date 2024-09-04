public class CombustivelViagem {

    private double km;
    private int gas;
    private static int kmTotal = 0;
    private static int gasTotal = 0;

    public void CombustivelViagem(){
        kmTotal += km;
        gasTotal += gas;

        double kmpl = km / gas;

        System.out.printf("O automovel gasta %.2f Km por Litro \n", kmpl);
        System.out.println("Foi gasto ao total " + gasTotal +" litros de gasolina em "+ kmTotal +" quilometros.");

    }

    public void setKm(double km){
        this.km = km;
    }

    public double getKm(){
        return this.km;
    }
    
    public void setGas(int gas){
        this.gas = gas;
    }

    public int getGas(){
        return this.gas;
    }
    
}
