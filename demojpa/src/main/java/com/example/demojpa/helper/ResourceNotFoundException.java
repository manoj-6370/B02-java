package com.example.demojpa.helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)

@Data
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
private String resourceName;
private String fieldName;
private Integer fieldValue;


}
