package com.oopcw.ticketingsystembackend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ticketing")

public class TicketingConfig {
    // Defining Properties
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    // Getter and Setters

    /**
     *
     * @return totalTickets
     */
    public int getTotalTickets() {
        return totalTickets;
    }

    /**
     *
     * @param totalTickets
     */
    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    /**
     *
     * @return ticketReleaseRate
     */
    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    /**
     *
     * @param ticketReleaseRate
     */
    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    /**
     *
     * @return customerRetrievalRate
     */
    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    /**
     *
     * @param customerRetrievalRate
     */
    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }

    /**
     *
     * @return maxTicketCapacity
     */
    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    /**
     *
     * @param maxTicketCapacity
     */
    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }
}
