package com.tmilller.mkSite.controller;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmilller.mkSite.entity.McTask;

@RestController
@RequestMapping("api")
public class TestController {

	@RequestMapping("validate")
	public String test() {
		return "connectected";
	}

	@PostMapping("task")
	public ResponseEntity<Void> create(McTask task) {
		Logger.getGlobal().info(task.toString());
		return ResponseEntity.status(HttpStatus.CREATED).location(URI.create("yourLocation")).build();
	}
	
	@GetMapping("task/{id}")
	public ResponseEntity<McTask> retrieve(@PathVariable String id) {
		
		McTask task = new McTask();
		task.setSubject("retrieved task");
		task.setStartDate(OffsetDateTime.now());
		
		return ResponseEntity.ok(task);
	}
}
