package desafio.notificacoes.desafio_magalu.dto;

import java.time.LocalDateTime;

import desafio.notificacoes.desafio_magalu.entities.Channel;
import desafio.notificacoes.desafio_magalu.entities.Notifications;
import desafio.notificacoes.desafio_magalu.entities.Status;
import jakarta.transaction.Transactional;


public record NotificationDTO(LocalDateTime dateTime,
		String destination,
		String message,
		Channel.values channel
		) {


	@Transactional
public Notifications toNotification() {
Notifications notification = new Notifications();
notification.setDateTime(dateTime);
notification.setDestination(destination);
notification.setMessage(message);
notification.setChannel(channel.toChannel());
notification.setStatus(Status.values.PENDING.toStatus());
return notification;
}
}
