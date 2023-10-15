package br.com.joao.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

	@Id
	@GeneratedValue(generator = "UUID")
	private UUID ID;
	
	private String description;
	
	@Column(length = 50)
	private String title;
	
	private LocalDateTime endAt;
	private LocalDateTime startAt;
	private String priority;
	
	private UUID idUser;
	
	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	public void setTitle(String title) throws Exception {
		if(title.length() > 50) {
			throw new Exception("O campo title deve conter no máximo 50 caracteres");	
		}
		this.title = title;
	}
	
}
