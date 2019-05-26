package ua.com.fan.salarycalc.service;

import org.springframework.stereotype.Service;

import ua.com.fan.salarycalc.entity.Manager;
import ua.com.fan.salarycalc.repository.ManagerRepository;
import ua.com.fan.salarycalc.service.common.AbstractService;

@Service
public class ManagerService extends AbstractService<Manager, ManagerRepository> {

	public ManagerService(ManagerRepository repository) {
		super(repository);
	}
}
