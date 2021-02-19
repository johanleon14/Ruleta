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
public class NodoClientes {
    private int id;
    private String nombre;
    private int valor;        // Variable en la cual se va a guardar el numero al que se va a apostar.
    private NodoClientes sgte;  // Variable para enlazar los nodos.
    private boolean pdocena;// PRIMERA DOCENA///
    private boolean sdocena;// SEGUNDA DOCENA///
    private boolean tdocena;/// TERCERA DOCENA//
    private boolean pfila;/// PRIMERA FILA//
    private boolean sfila;///SEGUNDA FILA//
    private boolean tfila;/// TERCERA FILA///
    private boolean impar;/// NUMERO IMPAR///
    private boolean par;///NUMERO PAR///
    private boolean rojo;/// COLOR ROJO///
    private boolean negro;///COLOR NEGRO///
    private boolean numfijo;/// NUMERO FIJO//
    private boolean pmitad;///PRIMERA MITAD///
    private boolean smitad;///SEGUNDA MITAD///
    
    
    private int pdocenadinero;// PRIMERA DOCENA///
    private int sdocenadinero;// SEGUNDA DOCENA///
    private int tdocenadinero;/// TERCERA DOCENA//
    private int pfiladinero;/// PRIMERA FILA//
    private int sfiladinero;///SEGUNDA FILA//
    private int tfiladinero;/// TERCERA FILA///
    private int pardinero;///NUMERO PAR///
    private int impardinero;///NUMERO IMPAR///
    private int rojodinero;/// COLOR ROJO///
    private int negrodinero;///COLOR NEGRO///
    private int numfijodinero;/// NUMERO FIJO//
    private int pmitaddinero;///PRIMERA MITAD///
    private int smitaddinero;///SEGUNDAMITAD///
   
   
    private int dinerototal;///DINERO TOTAL///
    
    public void NodoClientes(){///constructor vacio
        this.id=0;
        this.nombre="";
        this.valor=0;
        this.sgte=null;
        this.pdocena=false;
        this.sdocena=false;
        this.tdocena=false;
        this.pfila=false;
        this.sfila=false;
        this.tfila=false;
        this.impar=false;
        this.par=false;
        this.rojo=false;
        this.negro=false;
        this.numfijo=false;
        this.pmitad=false;
        this.smitad=false;
        this.pdocenadinero=0;
        this.sdocenadinero=0;
        this.tdocenadinero=0;
        this.pfiladinero=0;
        this.sfiladinero=0;
        this.tfiladinero=0;
        this.impardinero=0;
        this.pardinero=0;
        this.rojodinero=0;
        this.negrodinero=0;
        this.numfijodinero=0;
        this.pmitaddinero=0;
        this.smitaddinero=0;
    }
    public void NodoClientes(int id,String nombre,int valor,NodoClientes sgte,boolean pdocena,boolean sdocena,boolean tdocena,
            boolean pfila,boolean sfila,boolean tfila,boolean impar,boolean par,boolean rojo,boolean negro,boolean numfijo,
            boolean pmitad,boolean smitad,int pdocenadinero,int sdocenadinero,int tdocenadinero,int pfiladinero,int sfiladinero,
            int tfiladinero,int impardinero,int pardinero,int rojodinero,int negrodinero,int numfijodinero,int pmitaddinero,
            int smitaddinero){///constructor 
        this.id=id;
        this.nombre=nombre;
        this.valor=valor;
        this.sgte=sgte;
        this.pdocena=pdocena;
        this.sdocena=sdocena;
        this.tdocena=tdocena;
        this.pfila=pfila;
        this.sfila=sfila;
        this.tfila=tfila;
        this.impar=impar;
        this.par=par;
        this.rojo=rojo;
        this.negro=negro;
        this.numfijo=numfijo;
        this.pmitad=pmitad;
        this.smitad=smitad;
        this.pdocenadinero=pdocenadinero;
        this.sdocenadinero=sdocenadinero;
        this.tdocenadinero=tdocenadinero;
        this.pfiladinero=pfiladinero;
        this.sfiladinero=sfiladinero;
        this.tfiladinero=tfiladinero;
        this.impardinero=impardinero;
        this.pardinero=pardinero;
        this.rojodinero=rojodinero;
        this.negrodinero=negrodinero;
        this.numfijodinero=numfijodinero;
        this.pmitaddinero=pmitaddinero;
        this.smitaddinero=smitaddinero;
    }

    ///////////////////SET////////////////////7
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSgte(NodoClientes sgte) {
        this.sgte = sgte;
    }

    public void setPdocena(boolean pdocena) {
        this.pdocena = pdocena;
    }

    public void setSdocena(boolean sdocena) {
        this.sdocena = sdocena;
    }

    public void setTdocena(boolean tdocena) {
        this.tdocena = tdocena;
    }

    public void setPfila(boolean pfila) {
        this.pfila = pfila;
    }

    public void setSfila(boolean sfila) {
        this.sfila = sfila;
    }

    public void setTfila(boolean tfila) {
        this.tfila = tfila;
    }

    public void setImpar(boolean impar) {
        this.impar = impar;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public void setRojo(boolean rojo) {
        this.rojo = rojo;
    }

    public void setNegro(boolean negro) {
        this.negro = negro;
    }

    public void setNumfijo(boolean numfijo) {
        this.numfijo = numfijo;
    }

    public void setPmitad(boolean pmitad) {
        this.pmitad = pmitad;
    }

    public void setSmitad(boolean smitad) {
        this.smitad = smitad;
    }

    public void setPdocenadinero(int pdocenadinero) {
        this.pdocenadinero = pdocenadinero;
    }

    public void setSdocenadinero(int sdocenadinero) {
        this.sdocenadinero = sdocenadinero;
    }

    public void setTdocenadinero(int tdocenadinero) {
        this.tdocenadinero = tdocenadinero;
    }

    public void setPfiladinero(int pfiladinero) {
        this.pfiladinero = pfiladinero;
    }

    public void setSfiladinero(int sfiladinero) {
        this.sfiladinero = sfiladinero;
    }

    public void setTfiladinero(int tfiladinero) {
        this.tfiladinero = tfiladinero;
    }

    public void setPardinero(int pardinero) {
        this.pardinero = pardinero;
    }

    public void setImpardinero(int impardinero) {
        this.impardinero = impardinero;
    }

    public void setRojodinero(int rojodinero) {
        this.rojodinero = rojodinero;
    }

    public void setNegrodinero(int negrodinero) {
        this.negrodinero = negrodinero;
    }

    public void setNumfijodinero(int numfijodinero) {
        this.numfijodinero = numfijodinero;
    }

    public void setPmitaddinero(int pmitaddinero) {
        this.pmitaddinero = pmitaddinero;
    }

    public void setSmitaddinero(int smitaddinero) {
        this.smitaddinero = smitaddinero;
    }

    public void setDinerototal(int dinerototal) {
        this.dinerototal = dinerototal;
    }

    ////////////////////////GET/////////////////////////
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public NodoClientes getSgte() {
        return sgte;
    }

    public boolean isPdocena() {
        return pdocena;
    }

    public boolean isSdocena() {
        return sdocena;
    }

    public boolean isTdocena() {
        return tdocena;
    }

    public boolean isPfila() {
        return pfila;
    }

    public boolean isSfila() {
        return sfila;
    }

    public boolean isTfila() {
        return tfila;
    }

    public boolean isImpar() {
        return impar;
    }

    public boolean isPar() {
        return par;
    }

    public boolean isRojo() {
        return rojo;
    }

    public boolean isNegro() {
        return negro;
    }

    public boolean isNumfijo() {
        return numfijo;
    }

    public boolean isPmitad() {
        return pmitad;
    }

    public boolean isSmitad() {
        return smitad;
    }

    public int getPdocenadinero() {
        return pdocenadinero;
    }

    public int getSdocenadinero() {
        return sdocenadinero;
    }

    public int getTdocenadinero() {
        return tdocenadinero;
    }

    public int getPfiladinero() {
        return pfiladinero;
    }

    public int getSfiladinero() {
        return sfiladinero;
    }

    public int getTfiladinero() {
        return tfiladinero;
    }

    public int getPardinero() {
        return pardinero;
    }

    public int getImpardinero() {
        return impardinero;
    }

    public int getRojodinero() {
        return rojodinero;
    }

    public int getNegrodinero() {
        return negrodinero;
    }

    public int getNumfijodinero() {
        return numfijodinero;
    }

    public int getPmitaddinero() {
        return pmitaddinero;
    }

    public int getSmitaddinero() {
        return smitaddinero;
    }

    public int getDinerototal() {
        return dinerototal;
    }
    


}
