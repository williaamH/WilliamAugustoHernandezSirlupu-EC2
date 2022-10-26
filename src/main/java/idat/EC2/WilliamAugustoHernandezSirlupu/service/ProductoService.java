package idat.EC2.WilliamAugustoHernandezSirlupu.service;

import java.util.List;
import idat.EC2.WilliamAugustoHernandezSirlupu.model.Producto;

public interface ProductoService {
	
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);

}
