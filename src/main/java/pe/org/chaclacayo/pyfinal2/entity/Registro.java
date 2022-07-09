package pe.org.chaclacayo.pyfinal2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Asus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registro1")
@Entity

public class Registro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idnombre;
    @Column(unique=true)
    private String nombre; 
    private int codigo;
    private String correo;
    private String usuario;
    private String contraseña;
    private String repitecontraseña;

}
