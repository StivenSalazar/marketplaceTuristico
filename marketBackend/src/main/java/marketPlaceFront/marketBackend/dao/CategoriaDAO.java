package marketPlaceFront.marketBackend.dao;

import java.util.List;

import marketPlaceFront.marketBackend.dto.Categoria;

public interface CategoriaDAO {
	
	List<Categoria> listar();
	Categoria get(int id);
	boolean agregar(Categoria categoria);
	boolean actualizar(Categoria categoria);
	boolean eliminar(Categoria categoria);
	
	

}
