package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuarioCl2;

	private String passwordCl2;

	private String usuarioCl2;

	public TblUsuariocl2() {
	}

	public int getIdUsuarioCl2() {
		return this.idUsuarioCl2;
	}

	public void setIdUsuarioCl2(int idUsuarioCl2) {
		this.idUsuarioCl2 = idUsuarioCl2;
	}

	public String getPasswordCl2() {
		return this.passwordCl2;
	}

	public void setPasswordCl2(String passwordCl2) {
		this.passwordCl2 = passwordCl2;
	}

	public String getUsuarioCl2() {
		return this.usuarioCl2;
	}

	public void setUsuarioCl2(String usuarioCl2) {
		this.usuarioCl2 = usuarioCl2;
	}

}