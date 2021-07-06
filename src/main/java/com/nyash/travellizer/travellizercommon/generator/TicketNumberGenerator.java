package com.nyash.travellizer.travellizercommon.generator;


import com.nyash.travellizer.travellizercommon.generator.text.RandomDigitStringGenerator;
import com.nyash.travellizer.travellizerticketservice.model.Ticket;

public class TicketNumberGenerator extends RandomDigitStringGenerator {
    public TicketNumberGenerator() {
        super(Ticket.TICKET_NUMBER_SIZE);
    }
}
