package idat.EC2.WilliamAugustoHernandezSirlupu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.EC2.WilliamAugustoHernandezSirlupu.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
