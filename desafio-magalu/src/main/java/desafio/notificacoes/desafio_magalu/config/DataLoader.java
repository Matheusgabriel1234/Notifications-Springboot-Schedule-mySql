package desafio.notificacoes.desafio_magalu.config;

import java.util.Arrays;

import org.hibernate.grammars.hql.HqlParser.ValuesContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import desafio.notificacoes.desafio_magalu.entities.Channel;
import desafio.notificacoes.desafio_magalu.entities.Status;
import desafio.notificacoes.desafio_magalu.repository.ChannelRepository;
import desafio.notificacoes.desafio_magalu.repository.StatusRepository;

@Configuration
public class DataLoader implements CommandLineRunner {
	
	private final ChannelRepository channelRepo;
	
	private final StatusRepository statusRepo;
	
	
	

	public DataLoader(ChannelRepository channelRepo, StatusRepository statusRepo) {
		super();
		this.channelRepo = channelRepo;
		this.statusRepo = statusRepo;
	}




	@Override
	public void run(String... args) throws Exception {
		Arrays.stream(Channel.values.values()).map(Channel.values::toChannel).forEach(channelRepo::save);
		Arrays.stream(Status.values.values()).map(Status.values::toStatus).forEach(statusRepo::save);
		
	}

}
