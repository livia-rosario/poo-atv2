public class Combustao extends Veiculo {
    private double autonomiaComb, capacidadeComb;
    
    public Combustao (String marca, String modelo, int anoFab, int mesFab, 
            int anoMod, double valor, double autonomiaComb, 
            double capacidadeComb){
        super(marca,modelo,anoFab,mesFab, anoMod,valor);
        this.autonomiaComb = autonomiaComb;
        this.capacidadeComb = capacidadeComb;
    }
    
    @Override
    public int getAutonomia() {
        return (int)Math.round(autonomiaComb);
    }
    
    @Override
    public String toString() {
        // Honda HRV 2015/2016 - Autonomia: 400.0km (Combustão)
        return super.toString() + " (Combustão)";
    }
}
