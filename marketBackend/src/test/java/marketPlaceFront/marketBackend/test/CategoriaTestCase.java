package marketPlaceFront.marketBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import marketPlaceFront.marketBackend.dao.CategoriaDAO;
import marketPlaceFront.marketBackend.dto.Categoria;

public class CategoriaTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoriaDAO categoriaDAO;
	private Categoria categoria;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("marketPlaceFront.marketBackend");
		context.refresh();
		
		categoriaDAO = (CategoriaDAO)context.getBean("categoriaDAO");
	}
	
//	@Test
//	public void testAgregarCategoria() {
//		categoria = new Categoria();
//		categoria.setNombre("Paseos Ecológicos");
//		categoria.setDescripcion("Servicios de Paseos Ecológicos guiados");
//		categoria.setImagenURL("Cat_3.png");
//		categoria.setVideoURL("Cat_3.mp4");
//		
//		assertEquals("Categoria Agregada con éxito en tabla de BD", true, categoriaDAO.agregar(categoria));
//		
//	}
	
//	@Test
//	public void testGetCategoria() {
//		categoria = categoriaDAO.get(2);
//		assertEquals("Categoria Obtenida con éxito de tabla de BD", "Paseos Ecológicos", categoria.getNombre());
//		
//	}
	
//	@Test
//	public void testActualizarCategoria() {
//		categoria = categoriaDAO.get(2);
//		categoria.setNombre("Ecológicos");
//		assertEquals("Categoria Actualizada con éxito de tabla de BD", true, categoriaDAO.actualizar(categoria));
//	}
	
//	@Test
//	public void testEliminarCategoria() {
//		categoria = categoriaDAO.get(2);
//		assertEquals("Categoria Actualizada con éxito de tabla de BD", true, categoriaDAO.eliminar(categoria));
//	}
	
//	@Test
//	public void testListarCategorias() {
//		
//		assertEquals("Categorias obtenidas con éxito de tabla de BD", 1, categoriaDAO.listar().size());
//	}
	
	@Test
	public void testCRUDCategoria() {
		
		//Operación "Add"
		
		categoria = new Categoria();
		categoria.setNombre("Caminatas Deportivas");
		categoria.setDescripcion("Servicios de Caminatas Deportivas");
		categoria.setImagenURL("Cat_4.png");
		categoria.setVideoURL("Cat_4.mp4");
		
		assertEquals("Categoria Agregada con éxito en tabla de BD", true, categoriaDAO.agregar(categoria));
		
		
		categoria = new Categoria();
		
		categoria.setNombre("PAQUETES");
		categoria.setDescripcion("Paquetes de Turismo Ecológico");
		categoria.setImagenURL("Cat_4.png");
		categoria.setVideoURL("Cat_4.mp4");
		
		assertEquals("Categoria Agregada con éxito en tabla de BD", true, categoriaDAO.agregar(categoria));
		
		//Obteniendo y actualizando el nombre de una categoria
		
		categoria = categoriaDAO.get(2);
		categoria.setNombre("Paquetes de Turismo");
		assertEquals("Categoria Actualizada con éxito de tabla de BD", true, categoriaDAO.actualizar(categoria));
		
		//Eliminar una categoria
		
		assertEquals("Categoria Actualizada con éxito de tabla de BD", true, categoriaDAO.eliminar(categoria));
		
		//Obtener lista de categorias activas
		
		assertEquals("Categorias obtenidas con éxito de tabla de BD", 1, categoriaDAO.listar().size());
	}
	
}
