package in.soumyait.request;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "PassangerInfo")
public class PassangerInfo {
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;

}
