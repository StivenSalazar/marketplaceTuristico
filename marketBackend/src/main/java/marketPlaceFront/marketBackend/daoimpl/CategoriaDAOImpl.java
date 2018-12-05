package marketPlaceFront.marketBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import marketPlaceFront.marketBackend.dao.CategoriaDAO;
import marketPlaceFront.marketBackend.dto.Categoria;

@Repository("categoriaDAO")
public class CategoriaDAOImpl implements CategoriaDAO{

	private static List<Categoria> categorias = new ArrayList<>();
	
	static {
		
		Categoria categoria = new Categoria();
		
		categoria.setId(1);
		categoria.setNombre("Turisticos");
		categoria.setDescripcion("Para planes turísticos");
		categoria.setImagenURL("Cat_1.png");
		categoria.setVideoURL("Cat_1.mp4");

		categorias.add(categoria);
		
		categoria = new Categoria();

		categoria.setId(2);
		categoria.setNombre("Guiados");
		categoria.setDescripcion("Para planes guiados");
		categoria.setImagenURL("Cat_2.png");
		categoria.setVideoURL("Cat_2.mp4");

		categorias.add(categoria);

		categoria = new Categoria();

		categoria.setId(3);
		categoria.setNombre("Libres");
		categoria.setDescripcion("Para planes libres");
		categoria.setImagenURL("Cat_3.png");
		categoria.setVideoURL("Cat_3.mp4");

		categorias.add(categoria);
		
	}
	
	
	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return categorias;
	}

}
