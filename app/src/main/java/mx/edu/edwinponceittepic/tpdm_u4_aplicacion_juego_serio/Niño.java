package mx.edu.edwinponceittepic.tpdm_u4_aplicacion_juego_serio;

public class Niño  {
    double altura,peso,imc;

    public Niño(double altura,double peso,double imc){
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    public double getIMC(double altura,double peso){
        imc=peso/((altura*0.01)*(altura*0.01));
        return imc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
