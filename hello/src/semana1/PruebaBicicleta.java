package semana1;

public class PruebaBicileta {
    pubic static void main(String[] args){
    def();
    }

   public static void def(){
        Bicicleta biciMountain = new Bicicleta();
        Bicicleta biciPista = new Bicicleta(color:"Blanco");

        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);

       String msg = "Soy una bici de montaña con estas caracteristicas";
       msg += "\nColor: "+biciMountain.getColor();
       msg += "\nVelocidad: "+biciMountain.getVelocidad();
       msg += "\nPins: "+biciMountain.getPins();
       msg += "\nRodada: "+biciMountain.getRodada();

       System.out.print(msg);
   }
}
