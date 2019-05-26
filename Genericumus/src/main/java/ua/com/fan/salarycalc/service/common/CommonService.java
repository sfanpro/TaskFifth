package ua.com.fan.salarycalc.service.common;

import java.util.List;
import java.util.Optional;

import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;

public interface CommonService<E extends AbstractEmployeeWithLong> {

	Optional<E> save(E entity);

	List<E> saveAll(List<E> entities);

	Optional<E> update(E entity);

	Optional<E> get(Long id);

	List<E> getAll();

	Boolean deleteById(Long id);

	Boolean deleteAll();
}
