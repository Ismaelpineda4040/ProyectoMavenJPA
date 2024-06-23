package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProductoCl2;

	private String descripCl2;

	private String estadoCl2;

	private String nombreCl2;

	private double precioCompCl2;

	private double precioVentaCl2;

	public TblProductocl2() {
	}

	public int getIdProductoCl2() {
		return this.idProductoCl2;
	}

	public void setIdProductoCl2(int idProductoCl2) {
		this.idProductoCl2 = idProductoCl2;
	}

	public String getDescripCl2() {
		return this.descripCl2;
	}

	public void setDescripCl2(String descripCl2) {
		this.descripCl2 = descripCl2;
	}

	public String getEstadoCl2() {
		return this.estadoCl2;
	}

	public void setEstadoCl2(String estadoCl2) {
		this.estadoCl2 = estadoCl2;
	}

	public String getNombreCl2() {
		return this.nombreCl2;
	}

	public void setNombreCl2(String nombreCl2) {
		this.nombreCl2 = nombreCl2;
	}

	public double getPrecioCompCl2() {
		return this.precioCompCl2;
	}

	public void setPrecioCompCl2(double precioCompCl2) {
		this.precioCompCl2 = precioCompCl2;
	}

	public double getPrecioVentaCl2() {
		return this.precioVentaCl2;
	}

	public void setPrecioVentaCl2(double precioVentaCl2) {
		this.precioVentaCl2 = precioVentaCl2;
	}

}