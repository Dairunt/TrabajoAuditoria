package Model;
// Generated 11-11-2014 07:19:28 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Liga generated by hbm2java
 */
public class Liga  implements java.io.Serializable {


     private int idLiga;
     private String nombre;
     private Set<Equipo> equipos = new HashSet<Equipo>(0);

    public Liga() {
    }

	
    public Liga(int idLiga, String nombre) {
        this.idLiga = idLiga;
        this.nombre = nombre;
    }
    public Liga(int idLiga, String nombre, Set<Equipo> equipos) {
       this.idLiga = idLiga;
       this.nombre = nombre;
       this.equipos = equipos;
    }
   
    public int getIdLiga() {
        return this.idLiga;
    }
    
    public void setIdLiga(int idLiga) {
        this.idLiga = idLiga;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Equipo> getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }




}

