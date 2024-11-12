package com.oopcw.ticketingsystembackend;

import com.oopcw.ticketingsystembackend.config.TicketingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/config")

public class Controller {

    @Autowired
    private TicketingConfig ticketingConfig;

    @GetMapping
    public TicketingConfig getTicketingConfig(){
        return ticketingConfig;
    }

    @PostMapping
    public String updateConfig(@RequestBody TicketingConfig newConfig){
        ticketingConfig.setTotalTickets(newConfig.getTotalTickets());
        ticketingConfig.setTicketReleaseRate(newConfig.getTicketReleaseRate());
        ticketingConfig.setCustomerRetrievalRate(newConfig.getCustomerRetrievalRate());
        ticketingConfig.setMaxTicketCapacity(newConfig.getMaxTicketCapacity());
        return "Configuration updated successfully!";
    }
}
