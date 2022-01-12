package com.fastcampus.getinline.controller.api;

import com.fastcampus.getinline.exception.GeneralException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {

    @GetMapping("/events")
    public List<String> getEvents(){
        throw new RuntimeException("테스트런타임메세지");
       //return List.of("event1", "event2");
    }

    @PostMapping("/eventss")
    public boolean createEvent(){
        throw new GeneralException("테스트메세지");
//        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId){
        return "event : " + eventId;
    }

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId){
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId){
        return true;
    }

}
