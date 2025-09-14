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
    private Double examen;
    private Double notaFinal;
    private String estado;

    //constructores
    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, Estudiante estudiante, Docente docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
    }

    //accesadores y mutadores
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public Docente getDocente() { return docente; }
    public void setDocente(Docente docente) { this.docente = docente; }

    public Double getNota1() { return nota1; }
    public void setNota1(Double nota1) { this.nota1 = nota1; }

    public Double getNota2() { return nota2; }
    public void setNota2(Double nota2) { this.nota2 = nota2; }

    public Double getNota3() { return nota3; }
    public void setNota3(Double nota3) { this.nota3 = nota3; }

    public Double getNotaPresentacion() { return notaPresentacion; }
    public void setNotaPresentacion(Double notaPresentacion) { this.notaPresentacion = notaPresentacion; }

    public Double getExamen() { return examen; }
    public void setExamen(Double examen) { this.examen = examen; }

    public Double getNotaFinal() { return notaFinal; }
    public void setNotaFinal(Double notaFinal) { this.notaFinal = notaFinal; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    //to string devuelve una versión en texto de tu objeto
    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", estudiante=" + estudiante + ", docente=" + docente + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", notaPresentacion=" + notaPresentacion + ", examen=" + examen + ", notaFinal=" + notaFinal + ", estado=" + estado + '}';
    }
    
    // metodo retona promedio asignatura
    public Double promedio() {
    // Precondición SIMPLE: que las 3 notas estén cargadas
    if (getNota1() == null || getNota2() == null || getNota3() == null) {
        return null; // aún faltan notas
    }
    return (getNota1() + getNota2() + getNota3()) / 3.0;
    }
    
}
