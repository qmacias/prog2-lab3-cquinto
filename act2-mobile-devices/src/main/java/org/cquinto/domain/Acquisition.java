package org.cquinto.domain;

import java.time.LocalDate;

public abstract class Acquisition {
    protected final String clientName;
    protected final String clientPhone;
    protected final String observations;
    protected final LocalDate currentDate;

    protected Acquisition(String clientName, String clientPhone, String observations, LocalDate currentDate) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.observations = observations;
        this.currentDate = currentDate;
    }

    public abstract String getType();

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public String getObservations() {
        return observations;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    @Override
    public String toString() {
        return String.format("Acquisition(clientName='%s', clientPhone='%s', observations='%s', currentDate='%s')", clientName, clientPhone, observations, currentDate);
    }

}
