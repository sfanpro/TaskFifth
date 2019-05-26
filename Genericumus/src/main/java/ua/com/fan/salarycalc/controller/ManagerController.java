package ua.com.fan.salarycalc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.fan.salarycalc.controller.common.AbstractController;
import ua.com.fan.salarycalc.entity.Manager;
import ua.com.fan.salarycalc.service.ManagerService;

@RestController
@RequestMapping("/manager")
class ManagerController extends AbstractController<Manager, ManagerService> {

	public ManagerController(ManagerService service) {
		super(service);
	}
}
