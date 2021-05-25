package org.kushal.pattern.movieTicket.dao;

import org.kushal.pattern.movieTicket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl implements TicketDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String insertSql ="Insert into ticket (movie, screen, seat) values (?,?,?)";

	@Override
	public void bookTicket(Ticket ticket) {
				
		jdbcTemplate.update(insertSql,ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
		
	}

}
