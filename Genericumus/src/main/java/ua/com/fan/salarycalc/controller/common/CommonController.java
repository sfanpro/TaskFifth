package ua.com.fan.salarycalc.controller.common;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;

public interface CommonController<E extends AbstractEmployeeWithLong> {

	@PostMapping
	ResponseEntity<E> save(@RequestBody E entity);

	@PostMapping("/all")
	ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities);

	@PutMapping
	ResponseEntity<E> update(@RequestBody E entity);

	@GetMapping
	ResponseEntity<E> get(@RequestParam Long id);

	@GetMapping("/all")
	ResponseEntity<List<E>> getAll();

	@DeleteMapping
	Boolean delete(@RequestParam Long id);

	@DeleteMapping("/all")
	Boolean deleteAll();
}
