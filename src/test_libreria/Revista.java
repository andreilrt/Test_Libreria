package test_libreria;

public class Revista extends Texto implements IsVenta {

    private int Numero;

    public Revista(int Codigo, String Titulo, int AñodePublicacion, int Numero) {
        this.setCodigo(Codigo);
        this.setTitulo(Titulo);
        this.setAñoDePublicacion(AñodePublicacion);
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public void MostrarSalidaTexto() {
        System.out.println("Has comprado la revista " + this.getTitulo());
    }

    @Override
    public String Astring(int A) {
        String R = Integer.toString(A) + ". Titulo: " + this.getTitulo() + " Año: " + Integer.toString(this.getAñoDePublicacion()) + " Codigo: " + this.getCodigo()
                + " Numero: " + this.getNumero();
        return R;
    }

    @Override
    public void AVender() {
        System.out.println("Gracias por preferirnos!!!");
    }
}
