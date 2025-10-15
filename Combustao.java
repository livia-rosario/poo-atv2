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
    public int getAutonomia() { // Conferir também
        return (int)Math.round(autonomiaComb);
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Combustão)";
    }
}
