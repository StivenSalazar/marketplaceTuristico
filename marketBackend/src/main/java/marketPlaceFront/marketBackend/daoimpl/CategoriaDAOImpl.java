package marketPlaceFront.marketBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import marketPlaceFront.marketBackend.dao.CategoriaDAO;
import marketPlaceFront.marketBackend.dto.Categoria;

@Repository("categoriaDAO")
@Transactional
public class CategoriaDAOImpl implements CategoriaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Categoria> categorias = new ArrayList<>();

//	static {
//		
//		Categoria categoria = new Categoria();
//		
//		categoria.setId(1);
//		categoria.setNombre("Alojamientos");
//		categoria.setDescripcion("Servicios de Alojamiento");
//		categoria.setImagenURL("Cat_1.png");
//		categoria.setVideoURL("Cat_1.mp4");
//
//		categorias.add(categoria);
//		
//		categoria = new Categoria();
//
//		categoria.setId(2);
//		categoria.setNombre("Alimentación");
//		categoria.setDescripcion("Servicios de Alimentación");
//		categoria.setImagenURL("Cat_2.png");
//		categoria.setVideoURL("Cat_2.mp4");
//
//		categorias.add(categoria);
//
//		categoria = new Categoria();
//
//		categoria.setId(3);
//		categoria.setNombre("Paseos Ecológicos");
//		categoria.setDescripcion("Servicios de Paseos Ecológicos guiados");
//		categoria.setImagenURL("Cat_3.png");
//		categoria.setVideoURL("Cat_3.mp4");
//
//		categorias.add(categoria);
//		
//		categoria = new Categoria();
//		categoria.setId(4);
//		categoria.setNombre("PAQUETES");
//		categoria.setDescripcion("Paquetes de Turismo Ecológico");
//		categoria.setImagenURL("Cat_4.png");
//		categoria.setVideoURL("Cat_4.mp4");
//		
//		categorias.add(categoria);
//	}

	@Override
	public List<Categoria> listar() {
		String seleccionarCategoriasActivaString = "FROM Categoria WHERE activo = :activo";
		Query query = sessionFactory.getCurrentSession().createQuery(seleccionarCategoriasActivaString);
		query.setParameter("activo", true);
		return query.getResultList();
	}

	@Override
	@Transactional
	public boolean agregar(Categoria categoria) {

		try {
			// Añadir categoria a la tabla de la base de datos
			sessionFactory.getCurrentSession().persist(categoria);
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	/**
	 * Obtener una categoria mediante su id
	 */
	@Override
	public Categoria get(int id) {

		return sessionFactory.getCurrentSession().get(Categoria.class, Integer.valueOf(id));
	}
	
	
	/**
	 * Actualizar una única categoria
	 */
	@Override
	public boolean actualizar(Categoria categoria) {
		try {
			// Actualizar categoria de la tabla de la base de datos
			sessionFactory.getCurrentSession().update(categoria);
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eliminar(Categoria categoria) {
		
		categoria.setActiva(false);
		
		try {
			// Eliminar categoria de la tabla de la base de datos
			sessionFactory.getCurrentSession().update(categoria);
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
