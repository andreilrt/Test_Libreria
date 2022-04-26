package test_libreria;

import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    private int Opc;
    private int OpcLibro;
    private int OpcRevista;
    private int OpcPeriodico;
    private Libro[] ArregloObjLibro;
    private Revista[] ArregloObjRevista;
    private Periodicos[] ArregloObjPeriodico;
    private Persona ObjPersona;
    private Scanner Input;

    public Menu() {
        Opc = 0;
        OpcLibro = 0;
        OpcRevista = 0;
        OpcPeriodico = 0;
        ArregloObjLibro = new Libro[10];
        ArregloObjRevista = new Revista[10];
        ArregloObjPeriodico = new Periodicos[10];
        ObjPersona = new Persona();
        Input = new Scanner(System.in);
    }

    public int getOpc() {
        return Opc;
    }

    public void setOpc(int Opc) {
        this.Opc = Opc;
    }

    public int getOpcLibro() {
        return OpcLibro;
    }

    public void setOpcLibro(int OpcLibro) {
        this.OpcLibro = OpcLibro;
    }

    public int getOpcRevista() {
        return OpcRevista;
    }

    public void setOpcRevista(int OpcRevista) {
        this.OpcRevista = OpcRevista;
    }

    public int getOpcPeriodico() {
        return OpcPeriodico;
    }

    public void setOpcPeriodico(int OpcPeriodico) {
        this.OpcPeriodico = OpcPeriodico;
    }

    public void TipoTexto() {
        System.out.println("\nHola " + this.ObjPersona.getNombre() + " ingrese la opcion que desea:"
                + "\n1. Menu de Libros"
                + "\n2. Menu de revistas"
                + "\n3. Menu de periodicos"
                + "\n4. Salir");
        this.setOpc(Input.nextInt());
    }

    public void MenuLibro() {
        System.out.println(this.ObjPersona.getNombre() + " te encuentras en el Menu de Libros, que deseas hacer? "
                + "\n1. Sacar un libro prestado"
                + "\n2. Devolver un libro prestado"
                + "\n3. Comprar un libro"
                + "\n4. Salir");
        this.setOpcLibro(Input.nextInt());
    }

    public void MenuRevista() {
        System.out.println(this.ObjPersona.getNombre() + " te encuentras en el Menu de Revistas, que deseas hacer? "
                + "\n1. Comprar una Revista"
                + "\n2. Salir");
        this.setOpcRevista(Input.nextInt());
    }

    public void MenuPeriodico() {
        System.out.println(this.ObjPersona.getNombre() + " te encuentras en el Menu de Periodico, que deseas hacer? "
                + "\n1. Comprar un Periodico"
                + "\n2. Salir");
        this.setOpcPeriodico(Input.nextInt());
    }

    public String ListaLibros(int C) {
        String L = " ";
        if (C == 0) {
            L = "Luces de Bohemia";
        }
        if (C == 1) {
            L = "100 Años de Soledad";
        }
        if (C == 2) {
            L = "Don Quijote de la Mancha";
        }
        if (C == 3) {
            L = "Viaje al Fin de la Noche";
        }
        if (C == 4) {
            L = "Todo se desmorona";
        }
        if (C == 5) {
            L = "Orgullo y prejuicio";
        }
        if (C == 6) {
            L = "Cumbres Borrascosas";
        }
        if (C == 7) {
            L = "Grandes Esperanzas";
        }
        if (C == 8) {
            L = "Ulises";
        }
        if (C == 9) {
            L = "Moby-Dick";
        }
        return L;
    }

    public int ListaAños(int A) {
        int Año = 0;
        if (A == 0) {
            Año = 1985;
        }
        if (A == 1) {
            Año = 1982;
        }
        if (A == 2) {
            Año = 2004;
        }
        if (A == 3) {
            Año = 1932;
        }
        if (A == 4) {
            Año = 1958;
        }
        if (A == 5) {
            Año = 1813;
        }
        if (A == 6) {
            Año = 1847;
        }
        if (A == 7) {
            Año = 1861;
        }
        if (A == 8) {
            Año = 1922;
        }
        if (A == 9) {
            Año = 1851;
        }
        return Año;
    }

    public String ListaRevistas(int C) {
        String L = " ";
        if (C == 0) {
            L = "Revista Emergencias";
        }
        if (C == 1) {
            L = "Historia Social";
        }
        if (C == 2) {
            L = "Al-Qantara";
        }
        if (C == 3) {
            L = "América Latina Hoy";
        }
        if (C == 4) {
            L = "Nature";
        }
        if (C == 5) {
            L = "Lancet";
        }
        if (C == 6) {
            L = "Blood";
        }
        if (C == 7) {
            L = "Jimmunol";
        }
        if (C == 8) {
            L = "Harvard Magazine";
        }
        if (C == 9) {
            L = "PW Magazine";
        }
        return L;
    }

    public String ListaCiudades(int C) {
        String L = " ";
        if (C == 0) {
            L = "Bogotá";
        }
        if (C == 1) {
            L = "Medellin";
        }
        if (C == 2) {
            L = "Barranquilla";
        }
        if (C == 3) {
            L = "Cali";
        }
        if (C == 4) {
            L = "Villavicencio";
        }
        if (C == 5) {
            L = "Cartagena";
        }
        if (C == 6) {
            L = "ValleDupar";
        }
        if (C == 7) {
            L = "Bucaramanga";
        }
        if (C == 8) {
            L = "Quibdo";
        }
        if (C == 9) {
            L = "Armenia";
        }
        return L;
    }

    public String ListaPeriodicos(int C) {
        String L = " ";
        if (C == 0) {
            L = "El Tiempo";
        }
        if (C == 1) {
            L = "El Colombiano";
        }
        if (C == 2) {
            L = "El Heraldo";
        }
        if (C == 3) {
            L = "El País";
        }
        if (C == 4) {
            L = "LLanos siete días";
        }
        if (C == 5) {
            L = "El Universal";
        }
        if (C == 6) {
            L = "El Pilón";
        }
        if (C == 7) {
            L = "Vanguardia Liberal";
        }
        if (C == 8) {
            L = "El Manduco";
        }
        if (C == 9) {
            L = "Vea Pues! Quindio";
        }
        return L;
    }

    public void InicializacionLibros() {
        int P;
        for (int c = 0; c < 10; c++) {
            P = (int) Math.floor(Math.random() * 2 + 1);
            if (P == 1) {
                ArregloObjLibro[c] = new Libro(((int) Math.floor(Math.random() * 9999 + 5000)), (ListaLibros(c)), (ListaAños(c)), true);
            }
            if (P == 2) {
                ArregloObjLibro[c] = new Libro((int) Math.floor(Math.random() * 9999 + 5000), ListaLibros(c), ListaAños(c), false);
            }
        }
    }

    public void InicializacionRevistas() {
        int P;
        for (int c = 0; c < 10; c++) {
            ArregloObjRevista[c] = new Revista((int) Math.floor(Math.random() * 9999 + 5000), this.ListaRevistas(c),
                    (int) Math.floor(Math.random() * 2018 + 2021),
                    (int) Math.floor(Math.random() * 15 + 1));
        }
    }

    public void InicializacionPeriodico() {
        int P;
        for (int c = 0; c < 10; c++) {
            ArregloObjPeriodico[c] = new Periodicos((int) Math.floor(Math.random() * 9999 + 5000), this.ListaPeriodicos(c),
                    (int) Math.floor(Math.random() * 2018 + 2021), this.ListaCiudades(c));
        }
    }

    public void Proceso() {
        this.InicializacionLibros();
        this.InicializacionRevistas();
        this.InicializacionPeriodico();
        System.out.println("Bienvenid@ a la libreria A&S");
        this.ObjPersona.PedirNombre();
        while (true) {
            this.TipoTexto();
            if (this.getOpc() < 1 || this.getOpc() > 4) {
                System.out.println("Ingrese una opción Valida");
            }
            while (this.getOpc() < 1 || this.getOpc() > 4) {
                this.TipoTexto();
                if (this.getOpc() < 1 || this.getOpc() > 4) {
                    System.out.println("Ingrese una opción Valida");
                }
            }
            if (this.getOpc() == 1) {
                this.MenuLibro();
                if (this.getOpcLibro() < 1 || this.getOpcLibro() > 4) {
                    System.out.println("Ingrese una opción Valida");
                }
                while (this.getOpcLibro() < 1 || this.getOpcLibro() > 4) {
                    this.MenuLibro();
                    if (this.getOpcLibro() < 1 || this.getOpcLibro() > 4) {
                        System.out.println("Ingrese una opción Valida");
                    }
                }
                if (this.getOpcLibro() == 1) {
                    int OpcL = 0;
                    System.out.println(this.ObjPersona.getNombre() + " qué libro deseas sacar prestado? ");
                    for (int c = 0; c < 10; c++) {
                        System.out.println(this.ArregloObjLibro[c].Astring(c + 1));
                    }
                    System.out.print("Digite su opcion: ");
                    OpcL = Input.nextInt() - 1;
                    for (int c = 0; c < 10; c++) {
                        if (OpcL == c) {
                            if (this.ArregloObjLibro[c].getPrestado()) {
                                this.ArregloObjLibro[c].EnPrestamo();
                            } else {
                                this.ArregloObjLibro[c].MostrarSalidaTexto();
                                this.ArregloObjLibro[c].APrestar();
                            }
                        }
                    }
                }
                if (this.getOpcLibro() == 2) {
                    int OpcL = 0;
                    System.out.println(this.ObjPersona.getNombre() + " qué libro deseas devolver? ");
                    for (int c = 0; c < 10; c++) {
                        System.out.println(this.ArregloObjLibro[c].Astring(c + 1));
                    }
                    System.out.print("Digite su opcion: ");
                    OpcL = Input.nextInt() - 1;
                    for (int c = 0; c < 10; c++) {
                        if (OpcL == c) {
                            if (this.ArregloObjLibro[c].getPrestado()) {
                                this.ArregloObjLibro[c].Devovuelto();
                                this.ArregloObjLibro[c].MostrarIngresoTexto();
                            } else {
                                System.out.println("Este libro no está prestado");
                            }
                        }
                    }
                }
                if (this.getOpcLibro() == 3) {
                    int OpcL = 0;
                    System.out.println(this.ObjPersona.getNombre() + " qué libro deseas comprar? ");
                    for (int c = 0; c < 10; c++) {
                        System.out.println(this.ArregloObjLibro[c].Astring(c + 1));
                    }
                    System.out.print("Digite su opcion: ");
                    OpcL = Input.nextInt() - 1;
                    for (int c = 0; c < 10; c++) {
                        if (OpcL == c) {
                            this.ArregloObjLibro[c].AVender();
                        }
                    }
                }
                if (this.getOpcLibro() == 4) {
                    exit(0);
                }
            }
            if (this.getOpc() == 2) {
                this.MenuRevista();
                if (this.getOpcRevista() < 1 || this.getOpcRevista() > 2) {
                    System.out.println("Ingrese una opción Valida");
                }
                while (this.getOpcRevista() < 1 || this.getOpcRevista() > 2) {
                    this.MenuRevista();
                    if (this.getOpcRevista() < 1 || this.getOpcRevista() > 2) {
                        System.out.println("Ingrese una opción Valida");
                    }
                }
                if (this.getOpcRevista() == 1) {
                    int OpcR = 0;
                    System.out.println(this.ObjPersona.getNombre() + " qué revista quieres comprar? ");
                    for (int c = 0; c < 10; c++) {
                        System.out.println(this.ArregloObjRevista[c].Astring(c + 1));
                    }
                    System.out.println("11. Otra");
                    OpcR = Input.nextInt() - 1;
                    for (int c = 0; c < 10; c++) {
                        if (OpcR == c) {
                            this.ArregloObjRevista[c].MostrarSalidaTexto();
                            this.ArregloObjRevista[c].AVender();
                        }
                    }
                    if (OpcR == 10) {
                        String R = " ";
                        System.out.print("Ingresa el nombre de la revista que deseas:");
                        R = Input.next();
                        System.out.println(this.ObjPersona.getNombre() + " el pedido de la revista " + R + " ha sido realizado!!!");
                    }
                }
                if (this.getOpcRevista() == 2) {
                    exit(0);
                }
            }
            if (this.getOpc() == 3) {
                this.MenuPeriodico();
                if (this.getOpcPeriodico() < 1 || this.getOpcPeriodico() > 2) {
                    System.out.println("Ingrese una opción Valida");
                }
                while (this.getOpcPeriodico() < 1 || this.getOpcPeriodico() > 2) {
                    this.MenuPeriodico();
                    if (this.getOpcPeriodico() < 1 || this.getOpcPeriodico() > 2) {
                        System.out.println("Ingrese una opción Valida");
                    }
                }
                if (this.getOpcPeriodico() == 1) {
                    int OpcR = 0;
                    System.out.println(this.ObjPersona.getNombre() + " qué periodico quieres comprar? ");
                    for (int c = 0; c < 10; c++) {
                        System.out.println(this.ArregloObjPeriodico[c].Astring(c + 1));
                    }
                    System.out.println("11. Otro");
                    OpcR = Input.nextInt() - 1;
                    for (int c = 0; c < 10; c++) {
                        if (OpcR == c) {
                            this.ArregloObjPeriodico[c].MostrarSalidaTexto();
                            this.ArregloObjPeriodico[c].AVender();
                        }
                    }
                    if (OpcR == 10) {
                        String P = " ";
                        System.out.print("Ingresa el nombre del periodico que deseas:");
                        P = Input.next();
                        System.out.println(this.ObjPersona.getNombre() + " el pedido del periodico " + P + " ha sido realizado!!!");
                    }
                }
                if (this.getOpcPeriodico() == 2) {
                    exit(0);
                }
            }
            if (this.getOpc() == 4) {
                exit(0);
            }
        }
    }
}
