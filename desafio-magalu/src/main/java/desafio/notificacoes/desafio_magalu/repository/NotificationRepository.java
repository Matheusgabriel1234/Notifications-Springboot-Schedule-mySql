package desafio.notificacoes.desafio_magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.notificacoes.desafio_magalu.entities.Channel;
import desafio.notificacoes.desafio_magalu.entities.Notifications;
import desafio.notificacoes.desafio_magalu.entities.Status;

public interface NotificationRepository extends JpaRepository<Notifications, Long>{

}
