package org.cquinto.domain.acquisitions;

import java.time.LocalDate;

public abstract class Acquisition {
    protected final String clientName;
    protected final String clientPhone;
    protected final String observations;
    protected final LocalDate currentDate;
    protected final int acquisitionNumber;

    protected Acquisition(String clientName, String clientPhone, String observations, LocalDate currentDate, int acquisitionNumber) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.observations = observations;
        this.currentDate = currentDate;
        this.acquisitionNumber = acquisitionNumber;
    }

    public abstract String getType();

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public int getAcquisitionNumber() {
        return acquisitionNumber;
    }

    @Override
    public String toString() {
        return String.format("Client Name: %s, Client Phone: %s, Observations: %s", clientName, clientPhone, observations);
    }

}
