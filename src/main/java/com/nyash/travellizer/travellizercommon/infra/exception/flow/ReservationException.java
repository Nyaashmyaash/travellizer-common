package com.nyash.travellizer.travellizercommon.infra.exception.flow;


import com.nyash.travellizer.travellizercommon.infra.exception.base.AppException;

public class ReservationException extends AppException {

    private static final long serialVersionUID = -4354969163379642678L;

    public ReservationException(String message) {
        super(message);
    }
}
