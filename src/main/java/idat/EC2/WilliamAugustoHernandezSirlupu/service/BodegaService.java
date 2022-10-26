package idat.EC2.WilliamAugustoHernandezSirlupu.service;

import java.util.List;
import idat.EC2.WilliamAugustoHernandezSirlupu.model.Bodega;

public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
