package idat.EC2.WilliamAugustoHernandezSirlupu.service;

import java.util.List;

import idat.EC2.WilliamAugustoHernandezSirlupu.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
