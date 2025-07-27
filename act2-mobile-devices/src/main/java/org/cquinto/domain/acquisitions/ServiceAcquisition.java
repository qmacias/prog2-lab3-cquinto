package org.cquinto.domain.acquisitions;

import java.time.LocalDate;

public final class ServiceAcquisition extends Acquisition {
    private final String serviceCompany;

    public ServiceAcquisition(String clientName, String clientPhone, String observations, LocalDate currentDate, String serviceCompany) {
        super(clientName, clientPhone, observations, currentDate);
        this.serviceCompany = serviceCompany;
    }

    public String getServiceCompany() {
        return serviceCompany;
    }

    @Override
    public String getType() {
        return "Service";
    }

    @Override
    public String toString() {
        return String.format("%s, Company: %s", super.toString(), serviceCompany);
    }

}
