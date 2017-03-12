package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    
    private String etqVerdadero;
    private String etqFalso;
    
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String etq1, String etq2){
        this.cad = cad;
        this.etqVerdadero = etq1;
        this.etqFalso = etq2;
    }
    
    public String getCad(){
        return cad;
    }
    public String getEtqV(){
        return etqVerdadero;
    }
    public String getEtqF(){
        return etqFalso;
    }
    
    
        
}
