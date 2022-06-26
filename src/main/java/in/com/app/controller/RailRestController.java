package in.com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailRestController {

	@GetMapping("/ticket")
	public ResponseEntity<String> getTicketStatus(@RequestParam("pnr") String pnr) {
		String ticketStatus = "Ticket Status is Confirmed";
		return new ResponseEntity<String>(ticketStatus, HttpStatus.OK);
	}

	@GetMapping("/ticket/{pnr}/info")
	public ResponseEntity<String> getTicketStatusDetails(@PathVariable("pnr") String pnr) {
		String ticketStatus = "Ticket Status is Waiting";
		return new ResponseEntity<String>(ticketStatus, HttpStatus.OK);
	}

}
