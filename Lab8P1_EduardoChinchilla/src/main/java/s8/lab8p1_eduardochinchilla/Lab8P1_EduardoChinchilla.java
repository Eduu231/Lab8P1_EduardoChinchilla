package s8.lab8p1_eduardochinchilla;

import java.util.Scanner;
import java.util.Random;

public class Lab8P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();
    static Libro m = new Libro();

    public static void main(String[] args) {
        int opcion = 0;
        boolean entro = false;

        while (opcion != 3) {

            opcion = menu();

            switch (opcion) {

                case 1: {
                    int cont = 0;

                    impr(llenarLibrero());

                    if (cont < 1) {
                        entro = true;
                    }
                    cont++;
                    break;

                }

                case 2: {
                    if (entro == true) {
                        read.nextLine();
                        System.out.println("Ingrese titulo del libro");
                        String n = read.nextLine();
                        System.out.println("Ingrese el escritor");
                        String e = read.nextLine();
                        System.out.println("Ingrese el año de publicacion: ");
                        int p = read.nextInt();

                        impr(modificarLibro(n, e, p, m.getMod()));
                    } else {
                        System.out.println("Debe de ingresar libros primero");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ha salido");
                    break;
                }

                default:
            }
        }
    }

    public static int menu() {
        int op = 0;

        System.out.println("1. Ingresar");
        System.out.println("2. Modificar");
        System.out.println("3. Salir");

        op = read.nextInt();

        return op;
    }

    public static Libro[][] llenarLibrero() {

        System.out.println("Ingrese cuantas filas desea en el libero: ");
        int x = read.nextInt();
        System.out.println("Ingrese cuantas col desea en el librero: ");
        int y = read.nextInt();

        while (x <= 0 || y <= 0) {
            System.out.println("Ingrese cuantas filas desea en el libero: ");
            x = read.nextInt();
            System.out.println("Ingrese cuantas col desea en el librero: ");
            y = read.nextInt();
        }

        Libro[][] librero = new Libro[x][y];
        
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                read.nextLine();
                System.out.println("Ingrese titulo del libro");
                String n = read.nextLine();
                System.out.println("Ingrese el escritor");
                String e = read.nextLine();
                System.out.println("Ingrese el año de publicacion: ");
                int p = read.nextInt();
                System.out.println("El libro fue agregado exitosamente");

                Libro l = new Libro(n, e, p);
                l.setLibro(n);
                librero[i][j] = l;
            }

        }
        System.out.println("El libro completo es: ");
        m.setMod(librero);

        return librero;
    }

    public static void impr(Libro[][] librero) {

        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                System.out.print("[" + librero[i][j].getLibro() + "]" + " ");
            }
            System.out.println(" ");
        }

    }

    public static Libro[][] modificarLibro(String n, String e, int p, Libro[][] librero) {
        boolean encontrado = false;
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                librero[i][j].getLibro();
                if (librero[i][j].getLibro().equals(n) && librero[i][j].getNombre().equals(e) && librero[i][j].getAño() == p) {
                    encontrado = true;
                    System.out.println("Se encontro el libro: " + "En la fila: " + i + " " + "En la columna: " + j);

                    read.nextLine();
                    System.out.println("Ingrese el nuevo titulo del libro: ");
                    String t = read.nextLine();
                    System.out.println("Ingrese el nuevo escritor del libro: ");
                    String et = read.nextLine();
                    System.out.println("Ingrese el año de publicacion: ");
                    int ep = read.nextInt();

                    librero[i][j].setNombre(et);
                    librero[i][j].setTitulo(t);
                    librero[i][j].setAño(ep);

                    System.out.println("El libro se modifico exitosamente");
                    break;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("El libro no fue encontrado");
        } else {

        }
        return librero;
    }
}
