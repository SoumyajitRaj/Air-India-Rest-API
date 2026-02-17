package in.soumyait.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.soumyait.request.PassangerInfo;
import in.soumyait.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	@PostMapping(value="/bookFlightTicket",consumes={"application/json","application/xml"},produces={"application/json","application/xml"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassangerInfo pinfo){
		//logic to book TicketInfo
		
		//send ticket info
		TicketInfo ticket=new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("4500.00 INR");
		ticket.setFlightId(pinfo.getFlightId());
		ticket.setJourneyDate(pinfo.getJourneyDate());
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

}
