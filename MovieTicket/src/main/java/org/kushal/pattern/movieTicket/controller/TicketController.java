package org.kushal.pattern.movieTicket.controller;

import org.kushal.pattern.movieTicket.businessObject.TicketBo;
import org.kushal.pattern.movieTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}

	@RequestMapping("/createTicket")
	public String bookTicket(TicketBo ticket, ModelMap modelMap) {
		ticketService.purchaseTicket(ticket);
		modelMap.addAttribute("msg", "Ticket Booked Successfully");
		return "createTicket";
	}

}
