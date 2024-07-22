package desafio.notificacoes.desafio_magalu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status {

@Id
private long statusId;

private String description;

public Status() {
	
}




public Status(long statusId, String description) {
	super();
	this.statusId = statusId;
	this.description = description;
}




public long getStatusId() {
	return statusId;
}

public void setStatusId(long statusId) {
	this.statusId = statusId;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
	

public enum values{
	PENDING(1L,"pending"),
	SUCESS(2L,"sucess"),
	ERROR(3L,"error"),
	CANCELED(4L,"canceled");
	
	private Long id;
	private String description;
	
	private values(Long id, String description) {
		this.id = id;
		this.description = description;
	}
	
	
	public Status toStatus() {
		return new Status(id,description);
	}
	
	
	
}


}
