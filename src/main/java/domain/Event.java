package domain;

import constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventFinishedDatetime;
    private Integer currentNumberOfPeople;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
