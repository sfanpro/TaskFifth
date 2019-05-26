package ua.com.fan.salarycalc.controller.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.fan.salarycalc.base.ErrorType;
import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;
import ua.com.fan.salarycalc.exception.SampleException;
import ua.com.fan.salarycalc.service.common.CommonService;

public abstract class AbstractController<E extends AbstractEmployeeWithLong, S extends CommonService<E>>
		implements CommonController<E> {

	private final S service;

	@Autowired
	protected AbstractController(S service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<E> save(@RequestBody E entity) {
		return service
				.save(entity)
				.map(ResponseEntity::ok)
				.orElseThrow(() -> new SampleException(
						String.format(ErrorType.ENTITY_NOT_SAVED.getDescription(), entity.toString())));
	}

	@Override
	public ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities) {
		return ResponseEntity.ok(service.saveAll(entities));
	}

	@Override
	public ResponseEntity<E> update(@RequestBody E entity) {
		return service
				.update(entity)
				.map(ResponseEntity::ok)
				.orElseThrow(() -> new SampleException(
						String.format(ErrorType.ENTITY_NOT_UPDATED.getDescription(), entity)));
	}

	@Override
	public ResponseEntity<E> get(@RequestParam Long id) {
		return service
				.get(id)
				.map(ResponseEntity::ok)
				.orElseThrow(() -> new SampleException(String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)));
	}

	@Override
	public ResponseEntity<List<E>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@Override
	public Boolean delete(@RequestParam Long id) {
		return service.deleteById(id);
	}

	@Override
	public Boolean deleteAll() {
		return service.deleteAll();
	}
}
