package org.cquinto.domain.acquisitions;

import org.cquinto.domain.services.Service;

import java.time.LocalDate;

public final class ServiceAcquisition extends Acquisition {
    private final Service service;

    public ServiceAcquisition(String clientName, String clientPhone, String observations, LocalDate currentDate, Service service) {
        super(clientName, clientPhone, observations, currentDate);
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    @Override
    public String getType() {
        return "Service";
    }

}
