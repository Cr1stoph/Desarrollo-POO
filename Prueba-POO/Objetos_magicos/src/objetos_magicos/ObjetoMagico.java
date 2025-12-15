package objetos_magicos;

public abstract class ObjetoMagico implements BendicionValar{
    private String codigo;
    private String nombre;
    private String tipo;
    private int valorDePoderMagico;
    private double peso;

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getValorDePoderMagico() {return valorDePoderMagico;}
    public void setValorDePoderMagico(int valorDePoderMagico) {this.valorDePoderMagico = valorDePoderMagico;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    
    public abstract String tipo();
    
    public void aumento(){
        if("arma".equalsIgnoreCase(tipo)){
            setValorDePoderMagico((int) Math.round(valorDePoderMagico * 1.15));
            System.out.println("Aumento (15%) aplicado a" + nombre);
        }
    }
    
    @Override
    public Boolean aplicarBendicion(){return false;}

    @Override
    public String toString() {
        return "Objeto Magico" + " codigo = " + codigo + ", nombre = " + nombre + ", tipo = " + tipo + ", Poder Magico = " + valorDePoderMagico + ", peso = " + peso;
    }
    
    
    
    
   
    
}
