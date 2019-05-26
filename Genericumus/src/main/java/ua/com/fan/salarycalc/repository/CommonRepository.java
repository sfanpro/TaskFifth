package ua.com.fan.salarycalc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import ua.com.fan.salarycalc.entity.AbstractEmployeeWithLong;

@NoRepositoryBean
public interface CommonRepository<E extends AbstractEmployeeWithLong> extends CrudRepository<E, Long> {

}
