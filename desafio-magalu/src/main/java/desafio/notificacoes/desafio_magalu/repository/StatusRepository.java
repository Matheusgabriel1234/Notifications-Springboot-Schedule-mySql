package desafio.notificacoes.desafio_magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.notificacoes.desafio_magalu.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{

}
