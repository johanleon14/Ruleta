/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;
/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

import interfaz.tablero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ruleta {

    private NodoClientes cabeza;
    private int tam;
    private int numerowin;///numero ganador

    public void Clientes() {////constructor vacio
        cabeza = null;  //puntero a tierra
        tam = 0;
        numerowin=0;
    }
    
    public void Clientes(NodoClientes cabeza, int tam, int numerowin){///constructor
        cabeza=this.cabeza;
        tam=this.tam;
        numerowin=this.numerowin;
    }

    public NodoClientes getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoClientes cabeza) {
        this.cabeza = cabeza;
    }

    public boolean esVacia() {
        return cabeza == null;  // if(cabeza == null)
    }

    public int getTam() {
        return tam;
    }

    public int getNumerowin() {
        return numerowin;
    }

    public void setNumerowin(int numerowin) {
        this.numerowin = numerowin;
    }

    //////////////////MUESTRA LA LISTA SIMPLE USADA PARA GUARDAR LOS DATOS DE LOS USUARIOS//////////////
    public void MostrarLista() {
        int pos = 1;
        NodoClientes aux = cabeza;
        if (cabeza != null) {
            while (aux != null) {
                System.out.print(pos + "[" + aux.getId() + " - " + aux.getDinerototal() + "]" + "->");
                pos++;
                aux = aux.getSgte();
            }
        } else {
            System.out.println("LA LISTA ESTA VACIA");
        }
    }

    ////////////////METODO EMPLEADO PARA AGREGAR NUEVOS JUGADORES///////////////
    public void agregarAlFinal(int id, String Nombre, long dinero) {
        NodoClientes nuevo = new NodoClientes();
        nuevo.setId(id);
        nuevo.setDinerototal((int) dinero);
        nuevo.setNombre(Nombre);

        if (esVacia()) {
            cabeza = nuevo;

        } else {
            NodoClientes aux = cabeza;
            while (aux.getSgte() != null) {
                aux = aux.getSgte();
            }
            aux.setSgte(nuevo);
        }

        tam++;

    }

    ///////////////////////INICIA A LOS JUGADORES GUARDANDO SUS DATOS EN ARCHIVOS//////////////////7
    public void IniciarJugadores() throws IOException {

        boolean flag = true;
        int id = 1;
        while (flag == true) {
            try {
                File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");

                if (ruta.exists()) {
                    FileReader fr = new FileReader(ruta.getAbsolutePath());
                    BufferedReader bf = new BufferedReader(fr);

                    String texto;
                    while ((texto = bf.readLine()) != null) {

                        String Separar[] = texto.split("_");

                        agregarAlFinal(id, Separar[0], Long.parseLong(Separar[1]));

                        id++;
                    }
                    fr.close();
                    bf.close();
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("");

    }

    //////////////////////GUARDA EN EL ARCHIVO LAS GANANCIAS DEL JUGADOR/////////////
    public void PagarJugador(int id, String Nombre, long dinerototal) {

        try {
            File ruta = new File("src\\ArchivosClientes\\" + id + ".txt");
            if (ruta.exists()) {

                FileWriter fw = new FileWriter(ruta.getAbsolutePath());
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                pw.write(Nombre + "_" + dinerototal);

                pw.close();
                bw.close();
                fw.close();

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    ////////////////////REINICIA LA APUESTA CADA VEZ QUE LA RULETA TERMINE SU CICLO/////////////
    public void ReiniciarApuestas() {
        NodoClientes aux = cabeza;

        while (aux != null) {

            aux.setPdocena(false);
            aux.setPdocenadinero(0);
            aux.setSdocena(false);
            aux.setSdocenadinero(0);
            aux.setTdocena(false);
            aux.setTdocenadinero(0);
            aux.setPfila(false);
            aux.setPfiladinero(0);
            aux.setSfila(false);
            aux.setSfiladinero(0);
            aux.setTfila(false);
            aux.setTfiladinero(0);
            aux.setImpar(false);
            aux.setImpardinero(0);
            aux.setPar(false);
            aux.setPardinero(0);
            aux.setRojo(false);
            aux.setRojodinero(0);
            aux.setNegro(false);
            aux.setNegrodinero(0);
            aux.setPmitad(false);
            aux.setPmitaddinero(0);
            aux.setSmitad(false);
            aux.setSmitaddinero(0);
            aux.setNumfijo(false);
            aux.setValor(0);
            aux.setNumfijodinero(0);

            aux = aux.getSgte();
        }
    }

    /////////////////////INICIA LAS APUESTAS, VERIFICANDO SU APUESTA////////////////////////
    public void apuesta(int id, boolean pdocena, int pdocenadinero, boolean sdocena, int sdocenadinero, boolean tdocena, int tdocenadinero, boolean pfila, int pfiladinero, boolean sfila, int sfiladinero, boolean tfila, int tfiladinero, boolean impar, int impardinero, boolean par, int pardinero, boolean rojo, int rojodinero, boolean negro, int negrodinero, boolean pmitad, int pmitaddinero, boolean smitad, int smitaddinero) {

        NodoClientes aux = cabeza;
        while (aux != null) {
            if (pdocena == true && id == aux.getId()) {
                aux.setPdocena(true);
                aux.setPdocenadinero(pdocenadinero);
            }
            if (sdocena == true && id == aux.getId()) {
                aux.setSdocena(true);
                aux.setSdocenadinero(sdocenadinero);
            }
            if (tdocena == true && id == aux.getId()) {
                aux.setTdocena(true);
                aux.setTdocenadinero(tdocenadinero);
            }
            if (pfila == true && id == aux.getId()) {
                aux.setPfila(true);
                aux.setPfiladinero(pfiladinero);
            }
            if (sfila == true && id == aux.getId()) {
                aux.setSfila(true);
                aux.setSfiladinero(sfiladinero);
            }
            if (tfila == true && id == aux.getId()) {
                aux.setTfila(true);
                aux.setTfiladinero(tfiladinero);
            }
            if (impar == true && id == aux.getId()) {
                aux.setImpar(true);
                aux.setImpardinero(impardinero);
            }
            if (par == true && id == aux.getId()) {
                aux.setPar(true);
                aux.setPardinero(pardinero);
            }
            if (rojo == true && id == aux.getId()) {
                aux.setRojo(true);
                aux.setRojodinero(rojodinero);
            }
            if (negro == true && id == aux.getId()) {
                aux.setNegro(true);
                aux.setNegrodinero(negrodinero);
            }
            if (pmitad == true && id == aux.getId()) {
                aux.setPmitad(true);
                aux.setPmitaddinero(pmitaddinero);
            }
            if (smitad == true && id == aux.getId()) {
                aux.setSmitad(true);
                aux.setSmitaddinero(smitaddinero);
            }

            aux = aux.getSgte();

        }

    }

    ///////////////////////////METODO PARA PAGAR DEPENDIENDO DE LA APUESTA/////////////////
    public void pagar() {

        NodoClientes aux = cabeza;

        int numeroganador = this.getNumerowin();

        System.out.println("pagar. numero ganador" + numeroganador);

        boolean flag = false;//VARIABLE QUE VALIDA SI EL JUGADOR GANO EN SU APUSTE (LO UTILIZAN TODAS LAS APUESTAS)
        boolean flagGanador = false;// VARIABLE QUE AVISA SI SE REGISTRO ALMENOS UN GANADOR
        int ganancia = 0;
        int perdida = 0;
        String gananciatotal = "";//VARIABLE QUE CONCATENA EL NOMBRE Y DINERO GANADO POR CIERTOS JUGADORES
        String perdidatotal = "";//VARIABLE QUE CONCATENA EL NOMBRE Y DINERO PERDIDO POR CIERTOS JUGADORES
        boolean aviso = false;//ESTA VARIABLE SIRVE PARA VER SI SE REGISTRO ALMENOS UNA APUESTA, SI NO, AVISAR QUE NO SE REGISTRO NINGUNA APUESTA

///////////////////////ARREGLOS AUXILIAR DEL COLOR ROJO PARA VALIDAR LAS APUESTAS///////////////////////////////////////////
        int rojo[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        int negro[] = {2, 4, 6, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

        while (aux != null) {
            ganancia = 0;//VARIABLE QUE ACUMULA LA GANANCIA DEL JUGADOR TEMPORALMENTE
            perdida = 0;//VARIABLE QUE ACUMULA LA PERDIDA DEL JUGADOR  TEMPORALMENTE
            boolean omitir = true;//ESTA VARIABLE SIRVE PARA VER SI EL JUGADOR APOSTO O DECIDIO NO JUGAR Y EN CASO DE QUE NO, OMITIRLO DE LA TABLA

/////////////////////////////////////////////PAGAR A NUMERO FIJO 35 A 1 //////////////////////////////////////////////
            if (aux.isNumfijo() == true) {
                if (aux.getDinerototal() - aux.getNumfijodinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else if (numeroganador == aux.getValor()) {
                    flagGanador = true;
                    ganancia = ganancia + (aux.getNumfijodinero() * 35);
                    aux.setDinerototal((int) aux.getDinerototal() + (aux.getNumfijodinero() * 35));

                } else {
                    perdida = perdida + aux.getNumfijodinero();
                    aux.setDinerototal((int) aux.getDinerototal() - aux.getNumfijodinero());

                }
                aviso = true;
                omitir = false;
            }
///////////////////////////////////////////////PAGAR A PRIMERA DOCENA 2 A 1/////////////////////////////////////
            if (aux.isPdocena() == true) {
                if (aux.getDinerototal() - aux.getPdocenadinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 1; i <= 12; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getPdocenadinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getPdocenadinero() * 11));

                    } else {
                        perdida = perdida + aux.getPdocenadinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getPdocenadinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }
/////////////////////////////////////////////////PAGAR A SEGUNDA DOCENA 2 A 1/////////////////////////////////////7
            if (aux.isSdocena() == true) {
                if (aux.getDinerototal() - aux.getSdocenadinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 13; i <= 24; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getSdocenadinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getSdocenadinero() * 11));

                    } else {
                        perdida = perdida + aux.getSdocenadinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getSdocenadinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }

/////////////////////////////////////////////PAGAR A TERCERA DOCENA 2 A 1////////////////////////////////////
            if (aux.isTdocena() == true) {
                if (aux.getDinerototal() - aux.getTdocenadinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 24; i <= 36; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getTdocenadinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getTdocenadinero() * 11));

                    } else {
                        perdida = perdida + aux.getTdocenadinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getTdocenadinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }
/////////////////////////////////////PAGAR A PRIMERA FILA 2 A 1////////////////////////////////////////////////
            if (aux.isPfila() == true) {
                if (aux.getDinerototal() - aux.getPfiladinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 3; i <= 36; i = i + 3) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getPfiladinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getPfiladinero() * 11));

                    } else {
                        perdida = perdida + aux.getPfiladinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getPfiladinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }

/////////////////////////////////////PAGAR A SEGUNDA FILA 2 A 1//////////////////////////////////////
            if (aux.isSfila() == true) {
                if (aux.getDinerototal() - aux.getSfiladinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 2; i <= 35; i = i + 3) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getSfiladinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getSfiladinero() * 11));

                    } else {
                        perdida = perdida + aux.getSfiladinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getSfiladinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }

//////////////////////////////////////PAGAR A TERCERA FILA 2 A 1////////////////////////////////////////
            if (aux.isTfila() == true) {
                if (aux.getDinerototal() - aux.getTfiladinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 1; i <= 34; i = i + 3) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getTfiladinero() * 11);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getTfiladinero() * 11));

                    } else {
                        perdida = perdida + aux.getTfiladinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getTfiladinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }

//////////////////////////////////PAGAR A PAR O IMPAR  2 A 1//////////////////////////////////////////////////
            if (aux.isPar() == true) {
                if (aux.getDinerototal() - aux.getPardinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 2; i <= 36; i = i + 2) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getPardinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getPardinero() * 2));

                    } else {
                        perdida = perdida + aux.getPardinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getPardinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }
            if (aux.isImpar() == true) {
                if (aux.getDinerototal() - aux.getImpardinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 1; i <= 35; i = i + 2) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getImpardinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getImpardinero() * 2));

                    } else {
                        perdida = perdida + aux.getImpardinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getImpardinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }
///////////////////////////////// //PAGAR PRIMERA MITAD /////////////////////////////////////////////////
            if (aux.isPmitad() == true) {
                if (aux.getDinerototal() - aux.getPmitaddinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 1; i <= 18; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }

                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getPmitaddinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getPmitaddinero() * 2));

                    } else {
                        perdida = perdida + aux.getPmitaddinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getPmitaddinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }

////////////////////////////////////////////////PAGAR SEGUNDA MITAD/////////////////////////////////////////////////
            if (aux.isSmitad() == true) {
                if (aux.getDinerototal() - aux.getSmitaddinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 19; i <= 36; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getSmitaddinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getSmitaddinero() * 2));

                    } else {
                        perdida = perdida + aux.getSmitaddinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getSmitaddinero());

                    }
                    flag = false;

                }
                aviso = true;
                omitir = false;
            }
///////////////////////////////////////////////PAGAR COLOR ROJO////////////////////////////////////////////
            if (aux.isRojo() == true) {
                if (aux.getDinerototal() - aux.getRojodinero() < 0) {
                    JOptionPane.showMessageDialog(null, "LA APUESTA DEL USUARIO " + aux.getNombre() + " NO SE PUDO REALIZAR POR QUE ESTA EN BANCARROTA");
                } else {
                    for (int i = 0; i <= rojo.length; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getRojodinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getRojodinero() * 2));

                    } else {
                        perdida = perdida + aux.getRojodinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getRojodinero());

                    }
                    flag = false;
                }
                aviso = true;
                omitir = false;
            }
///////////////////////////////////////////////PAGAR COLOR NEGRO//////////////////////////////////////
            if (aux.isNegro() == true) {
                if (aux.getDinerototal() - aux.getNegrodinero() < 0) {

                } else {
                    for (int i = 0; i <= negro.length; i++) {
                        if (numeroganador == i) {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        flagGanador = true;
                        ganancia = ganancia + (aux.getNegrodinero() * 2);
                        aux.setDinerototal((int) aux.getDinerototal() + (aux.getNegrodinero() * 2));

                    } else {
                        perdida = perdida + aux.getNegrodinero();
                        aux.setDinerototal((int) aux.getDinerototal() - aux.getNegrodinero());

                    }
                    flag = false;
                }
                aviso = true;
                omitir = false;
            }

            ///////////////////////PAGA AL GANADOR O DESCUENTA LA PERDIDA///////////////////////
            PagarJugador(aux.getId(), aux.getNombre(), (int) aux.getDinerototal());
            if (omitir == false) {
                if (aviso == true) {
                    if (ganancia >= perdida) {

                        gananciatotal = gananciatotal.concat(aux.getNombre() + " +" + String.valueOf(ganancia-perdida) + "\n");
                    } else {
                        perdidatotal = perdidatotal.concat(aux.getNombre() + " -" + String.valueOf(perdida-ganancia) + "\n");
                    }

                }
            }

            aux = aux.getSgte();
        }
        //////////////////////MUESTRA POR PANTALLA EL GANADOR Y SU GANANCIA, EL PERDOR Y SI NO SE REALIZA APUESTA/////////////
        Icon i = new ImageIcon(getClass().getResource("/img/dineropequeño.png"));
        if (aviso == true) {
            if (flagGanador == true) {
                if (!perdidatotal.equals("")) {
                    JOptionPane.showMessageDialog(null, "Ganador(es): \n" + gananciatotal + "\n" + "Perdedor(es):\n" + perdidatotal, "TABLA DE PREMIOS", 3, i);
                } else {
                    JOptionPane.showMessageDialog(null, "Ganador(es): \n" + gananciatotal + "\n", "TABLA DE PREMIOS", 3, i);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Perdedor(es) \n" + perdidatotal, "TABLA DE PREMIOS", 3, i);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No se registraron apuestas", "TABLA DE PREMIOS", 3, i);
        }

    }

    //////////////////////RECIBE Y MODIFICA LAS APUESTAS DESDE CERO//////////////////////////
    public void setApuesta(int id, boolean pdocena, int pdocenadinero, boolean sdocena, int sdocenadinero, boolean tdocena,
            int tdocenadinero, boolean pfila, int pfiladinero, boolean sfila,
            int sfiladinero, boolean tfila, int tfiladinero, boolean impar,
            int impardinero, boolean par, int pardinero, boolean rojo, int rojodinero,
            boolean negro, int negrodinero, boolean pmitad, int pmitaddinero, boolean smitad, int smitaddinero) {

        NodoClientes aux = cabeza;
        boolean flag = false;

        while (flag != true) {
            if (aux.getId() == id) {
                flag = true;
            } else {
                aux = aux.getSgte();
            }
        }
        this.apuesta(id, pdocena, pdocenadinero, sdocena, sdocenadinero,
                tdocena, tdocenadinero, pfila, pfiladinero, sfila,
                sfiladinero, tfila, tfiladinero, impar, impardinero,
                par, pardinero, rojo, rojodinero, negro,
                negrodinero, pmitad, pmitaddinero, smitad, smitaddinero);

    }

    ////////////////////APUESTA A NUMERO FIJO //////////////////////
    public void apuestafija(int id, boolean numfijo, int numero, int dinero) {

        NodoClientes aux = cabeza;
        while (aux != null) {
            if (numfijo == true && id == aux.getId()) {
                aux.setNumfijo(true);
                aux.setValor(numero);
                aux.setNumfijodinero(dinero);
            }
            aux = aux.getSgte();
        }

    }

    ////////////////MODIFICA Y RECIBE LA APUESTA//////////////////////////////
    public void setApuestaFija(int id, boolean numfijo, int numero, int dinero) {
        NodoClientes aux = cabeza;
        boolean flag = false;

        while (flag != true) {
            if (aux.getId() == id) {
                flag = true;
            } else {
                aux = aux.getSgte();
            }
        }
        this.apuestafija(id, numfijo, numero, dinero);
    }

    ///////////////////////////VERIFICA QUE EL JUGADOR TENGA DINERO PARA SUS APUESTAS//////////////////
    public boolean validarDinero(int id, String Nombre, int DineroApuesta) {
        NodoClientes aux = cabeza;
        boolean flag = true;
        long dineroJugador = 0;
        boolean retornado = false;

        while (aux != null && flag != false) {
            if (aux.getId() == id) {
                flag = false;
                dineroJugador = aux.getDinerototal();

            }
            aux = aux.getSgte();
        }
        if (DineroApuesta > dineroJugador) {
            retornado = false;
        } else {
            retornado = true;
        }

        return retornado;
    }

   
   

    

}
