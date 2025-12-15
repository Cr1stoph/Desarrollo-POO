public class Asignatura {

    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private Docente docente;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double notaPresentacion;
    private Double notaExamen;
    private Double ntoafinal;
    private String estado;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, Estudiante estudiante, Docente docente, Double nota1, Double nota2, Double nota3, Double notaPresentacion, Double notaExamen, Double ntoafinal, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaPresentacion = notaPresentacion;
        this.notaExamen = notaExamen;
        this.ntoafinal = ntoafinal;
        this.estado = estado;
    }

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

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNotaPresentacion() {
        return notaPresentacion;
    }

    public void setNotaPresentacion(Double notaPresentacion) {
        this.notaPresentacion = notaPresentacion;
    }

    public Double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(Double notaExamen) {
        this.notaExamen = notaExamen;
    }

    public Double getNtoafinal() {
        return ntoafinal;
    }

    public void setNtoafinal(Double ntoafinal) {
        this.ntoafinal = ntoafinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estudiante=" + estudiante +
                ", docente=" + docente +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", notaPresentacion=" + notaPresentacion +
                ", notaExamen=" + notaExamen +
                ", ntoafinal=" + ntoafinal +
                ", estado='" + estado + '\'' +
                '}';
    }
}
