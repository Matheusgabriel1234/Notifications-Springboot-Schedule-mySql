package desafio.notificacoes.desafio_magalu.entities;


import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_notification")
public class Notifications {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String message;
private LocalDateTime dateTime;
private String destination;

@ManyToOne
@JoinColumn(name = "channel_id")
private Channel channel;

@ManyToOne
@JoinColumn(name = "status")
private Status status;



public Notifications() {
	
}



public Notifications(Long id, String message, LocalDateTime dateTime, String destination, Channel channel) {
	super();
	this.id = id;
	this.message = message;
	this.dateTime = dateTime;
	this.destination = destination;
	this.channel = channel;
}



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public LocalDateTime getDateTime() {
	return dateTime;
}

public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}






public Channel getChannel() {
	return channel;
}



public void setChannel(Channel channel) {
	this.channel = channel;
}





public Status getStatus() {
	return status;
}



public void setStatus(Status status) {
	this.status = status;
}



@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Notifications other = (Notifications) obj;
	return Objects.equals(id, other.id);
}








}
