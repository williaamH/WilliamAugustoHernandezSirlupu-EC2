package idat.EC2.WilliamAugustoHernandezSirlupu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import idat.EC2.WilliamAugustoHernandezSirlupu.model.Bodega;
import idat.EC2.WilliamAugustoHernandezSirlupu.service.BodegaService;

@Controller
@RequestMapping("/bodega")
public class BodegaController {
	
	@Autowired
	private BodegaService servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Bodega>> listar(){
		return new ResponseEntity<List<Bodega>>(servicio.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Bodega bodega){
		servicio.guardar(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Bodega> obtenerPorId(@PathVariable Integer id){
		Bodega bodega = servicio.obtener(id);
		if(bodega != null) {
			return new ResponseEntity<Bodega>(bodega, HttpStatus.OK);
		}else {
			return new ResponseEntity<Bodega>(bodega, HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Bodega bodega){
		Bodega b = servicio.obtener(bodega.getIdBodega());
		if(b != null) {
			servicio.actualizar(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Bodega bodega = servicio.obtener(id);
		if(bodega != null) {
			servicio.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
