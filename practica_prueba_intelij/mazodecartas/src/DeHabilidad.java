public class DeHabilidad extends Cartas {
    private String efectoEspecial;
    private int costoMana;

    public String getEfectoEspecial() {return efectoEspecial;}
    public void setEfectoEspecial(String efectoEspecial) {this.efectoEspecial = efectoEspecial;}

    public int getCostoMana() {return costoMana;}
    public void setCostoMana(int costoMana) {this.costoMana = costoMana;}

    @Override //identificacion de la subclase que reescribe el mismo metodo de cartas
    public String tipoCarta() {
        return "Habilidad";
    }

    @Override
    public String toString() {
        return "DeHabilidad{" +
                "efectoEspecial='" + efectoEspecial + '\'' +
                ", costoMana=" + costoMana +
                '}';
    }
}
