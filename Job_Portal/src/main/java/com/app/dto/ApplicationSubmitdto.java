package com.app.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ApplicationSubmitdto {
	@NotBlank(message = "userName cannot be blank")
	private String userName;

}
