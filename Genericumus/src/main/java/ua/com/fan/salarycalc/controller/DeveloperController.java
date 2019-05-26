package ua.com.fan.salarycalc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.fan.salarycalc.controller.common.AbstractController;
import ua.com.fan.salarycalc.entity.Developer;
import ua.com.fan.salarycalc.service.DeveloperService;

@RestController
@RequestMapping("/developer")
class DeveloperController extends AbstractController<Developer, DeveloperService> {

	public DeveloperController(DeveloperService service) {
		super(service);
	}
}
