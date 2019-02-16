package com.example.actuator.api.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Endpoint(id = "endpoint", enableByDefault = true)
public class MyEndPoint {
	@ReadOperation
	public EndPintResponse features()
	{
		return new EndPintResponse(898988, "java techi", "active");

	}
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class EndPintResponse {
	public EndPintResponse() {
		super();
	}
	private int id;
	public int getId() {
		return id;
	}
	public EndPintResponse(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String name;
	private String status;
}