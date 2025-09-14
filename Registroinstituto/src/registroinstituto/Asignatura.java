package registroinstituto;

public class Asignatura {
    //atributos
    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private Docente docente;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double notaPresentacion;
    private Double notaExamen;
    private Double notaFinal;
    private String estado;
    
    //Constructores

    public Asignatura(String codigoAsignaturaIngresado, String nombreAsignaturaIngresado, Estudiante estudiante_var, Docente docente_var) {
    }

    public Asignatura(String codigo, String nombre, Estudiante estudiante, Docente docente, double nota1, double nota2, double nota3, double notaPresentacion, double notaExamen, double notaFinal, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaPresentacion = notaPresentacion;
        this.notaExamen = notaExamen;
        this.notaFinal = notaFinal;
        this.estado = estado;
    }
    
    //getter and setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotaPresentacion() {
        return notaPresentacion;
    }

    public void setNotaPresentacion(double notaPresentacion) {
        this.notaPresentacion = notaPresentacion;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //toString
    
    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", estudiante=" + estudiante + ", docente=" + docente + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", notaPresentacion=" + notaPresentacion + ", notaExamen=" + notaExamen + ", notaFinal=" + notaFinal + ", estado=" + estado + '}';
    }
    
    
}
