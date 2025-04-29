package com.mowltnow.tondeuse.controller;


import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TondeuseController {
	
	
	
	@GetMapping("test")
	public ResponseEntity<String>  test() throws IOException {
			
        return ResponseEntity.ok("test n8n !!") ;
			
	}
	
	


}
