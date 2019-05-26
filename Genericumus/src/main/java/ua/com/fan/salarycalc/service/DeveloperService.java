package ua.com.fan.salarycalc.service;

import org.springframework.stereotype.Service;

import ua.com.fan.salarycalc.entity.Developer;
import ua.com.fan.salarycalc.repository.DeveloperRepository;
import ua.com.fan.salarycalc.service.common.AbstractService;

@Service
public class DeveloperService extends AbstractService<Developer, DeveloperRepository> {

	public DeveloperService(DeveloperRepository repository) {
		super(repository);
	}
}
