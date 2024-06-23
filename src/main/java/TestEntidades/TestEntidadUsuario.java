package TestEntidades;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {
	
	public static void main (String[] args){
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		
		
		usuario.setUsuarioCl2("IsmaelPineda224441");
		usuario.setPasswordCl2("Elpituco2024");
		
		crud.RegistrarUsuario(usuario);
	}

}
