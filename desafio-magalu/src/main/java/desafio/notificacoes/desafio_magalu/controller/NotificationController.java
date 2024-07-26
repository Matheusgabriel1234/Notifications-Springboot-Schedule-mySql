package desafio.notificacoes.desafio_magalu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.notificacoes.desafio_magalu.dto.NotificationDTO;
import desafio.notificacoes.desafio_magalu.entities.Notifications;
import desafio.notificacoes.desafio_magalu.repository.NotificationRepository;
import desafio.notificacoes.desafio_magalu.service.NotificationService;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	

@GetMapping("/{notificationId}")
public ResponseEntity<Optional<Notifications>> getNotification(@PathVariable Long notificationId){
var notification = serv.findById(notificationId);

if(notification.isPresent()) {
	return new ResponseEntity<>(notification,HttpStatus.OK);
}else {
	throw new RuntimeErrorException(null,"Id não encontrado");
}
}

@DeleteMapping("/{notificationId}")
public ResponseEntity<Void> deleteById(@PathVariable Long notificationId){
serv.deleteById(notificationId);
return ResponseEntity.noContent().build();
	
}
	
}
