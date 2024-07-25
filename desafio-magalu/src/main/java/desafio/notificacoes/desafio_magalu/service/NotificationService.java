package desafio.notificacoes.desafio_magalu.service;

import org.springframework.stereotype.Service;

import desafio.notificacoes.desafio_magalu.dto.NotificationDTO;
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






}
