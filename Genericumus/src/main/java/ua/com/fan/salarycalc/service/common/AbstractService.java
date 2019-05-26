package ua.com.fan.salarycalc.service.common;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;

import ua.com.fan.salarycalc.base.ErrorType;
import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;
import ua.com.fan.salarycalc.exception.SampleException;
import ua.com.fan.salarycalc.repository.CommonRepository;

public abstract class AbstractService<E extends AbstractEmployeeWithLong, R extends CommonRepository<E>>
		implements CommonService<E> {

	private final R repository;

	@Autowired
	public AbstractService(R repository) {
		this.repository = repository;
	}

	@Override
	public Optional<E> save(E entity) {
		return Optional.of(repository.save(entity));
	}

	@Override
	public List<E> saveAll(List<E> entities) {
		return Lists.newArrayList(repository.saveAll(entities));
	}

	@Override
	public Optional<E> update(E entity) {
		return Optional.of(repository.save(entity));
	}

	@Override
	public Optional<E> get(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<E> getAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Boolean deleteById(Long id) {
		E entity = get(id)
				.orElseThrow(() -> new SampleException(String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)));
		repository.delete(entity);
		return !repository.findById(entity.getId()).isPresent();
	}

	@Override
	public Boolean deleteAll() {
		repository.deleteAll();
		return Lists.newArrayList(repository.findAll()).isEmpty();
	}
}
