package test_libreria;

public class Periodicos extends Texto implements IsVenta {

    private String Ciudad;

    public Periodicos(int Codigo, String Titulo, int AñodePublicacion, String Ciudad) {
        this.setCodigo(Codigo);
        this.setTitulo(Titulo);
        this.setAñoDePublicacion(AñodePublicacion);
        this.Ciudad = Ciudad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public void MostrarSalidaTexto() {
        System.out.println("Has comprado el periodico " + this.getTitulo());
    }

    @Override
    public String Astring(int A) {
        String R = Integer.toString(A) + ". Titulo: " + this.getTitulo() + " Año: " + Integer.toString(this.getAñoDePublicacion()) + " Codigo: " + this.getCodigo()
                + " Ciudad: " + this.getCiudad();
        return R;
    }

    @Override
    public void AVender() {
        System.out.println("Gracias por preferirnos!!!");
    }
}
