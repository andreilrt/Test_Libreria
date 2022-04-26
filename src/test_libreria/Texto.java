package test_libreria;

public abstract class Texto {

    private int Codigo;
    private String Titulo;
    private int AñoDePublicacion;

    public Texto() {
        Codigo = 0;
        Titulo = " ";
        AñoDePublicacion = 0;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAñoDePublicacion() {
        return AñoDePublicacion;
    }

    public void setAñoDePublicacion(int AñoDePublicacion) {
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public void MostrarIngresoTexto(){
        
    }

    public abstract void MostrarSalidaTexto();

    public abstract String Astring(int A);
}
