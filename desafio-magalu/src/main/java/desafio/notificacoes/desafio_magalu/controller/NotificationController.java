package desafio.notificacoes.desafio_magalu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.notificacoes.desafio_magalu.dto.NotificationDTO;
import desafio.notificacoes.desafio_magalu.entities.Notifications;
import desafio.notificacoes.desafio_magalu.repository.NotificationRepository;
import desafio.notificacoes.desafio_magalu.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notifications")
public class NotificationController {

private final NotificationService serv;

public NotificationController(NotificationService serv) {
	this.serv = serv;
}





@PostMapping()
public ResponseEntity<Void> scheduleNotification(@RequestBody NotificationDTO dto){
	serv.scheduleNotification(dto);
	return ResponseEntity.accepted().build();
}
	
	
}
