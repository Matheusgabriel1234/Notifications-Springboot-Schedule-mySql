package desafio.notificacoes.desafio_magalu.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import desafio.notificacoes.desafio_magalu.dto.NotificationDTO;
import desafio.notificacoes.desafio_magalu.entities.Notifications;
import desafio.notificacoes.desafio_magalu.entities.Status;
import desafio.notificacoes.desafio_magalu.repository.NotificationRepository;

@Service
public class NotificationService {

private final NotificationRepository repo;

public NotificationService(NotificationRepository repo) {
this.repo = repo;
}

public void scheduleNotification(NotificationDTO notification) {
	repo.save(notification.toNotification());
}


public Optional<Notifications> findById(Long notificationId){
return repo.findById(notificationId);
}

public void deleteById(Long notificationId){
var id = findById(notificationId);

if(id.isPresent()) {
	id.get().setStatus(Status.values.CANCELED.toStatus());
	repo.save(id.get());
}



}



}
