package org.kushal.pattern.movieTicket.service;

import org.kushal.pattern.movieTicket.businessObject.TicketBo;
import org.kushal.pattern.movieTicket.dao.TicketDao;
import org.kushal.pattern.movieTicket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao ticketDao;

	@Override
	public void purchaseTicket(TicketBo ticketBo) {
		// Additional Logic for Payment

		Ticket ticket = new Ticket();
		ticket.setMovie(ticketBo.getMovieName());
		ticket.setScreen(ticketBo.getScreenNo());
		ticket.setSeat(ticketBo.getSeatNo());
		
		ticketDao.bookTicket(ticket);

		// Message OR Email the Ticket
	}
}
