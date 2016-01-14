package com.example.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/test")
public class TestController {
	
	@Autowired
	private Service service;
	
	@RequestMapping(path="/message/{message}",method = RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getMsg(@PathVariable(value="message")String msg){
		return new ResponseEntity<String>(service.getFactoryMessage(msg), HttpStatus.OK);
	}

}
