package clases;
// Generated 12-jun-2016 12:16:22 by Hibernate Tools 4.3.1



/**
 * Preguntas generated by hbm2java
 */
public class Preguntas  implements java.io.Serializable {


     private Integer idPregunta;
     private int idTrivia;
     private String enunciado;
     private String area;
     private String tema;
     private String curso;

    public Preguntas() {
    }

    public Preguntas(int idTrivia, String enunciado, String area, String tema, String curso) {
       this.idTrivia = idTrivia;
       this.enunciado = enunciado;
       this.area = area;
       this.tema = tema;
       this.curso = curso;
    }
   
    public Integer getIdPregunta() {
        return this.idPregunta;
    }
    
    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }
    public int getIdTrivia() {
        return this.idTrivia;
    }
    
    public void setIdTrivia(int idTrivia) {
        this.idTrivia = idTrivia;
    }
    public String getEnunciado() {
        return this.enunciado;
    }
    
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }




}

