package in.soumyait.response;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "TicketInfo")
public class TicketInfo {
	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;

}
