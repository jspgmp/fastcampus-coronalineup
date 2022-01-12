package domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Place {

    private Long id;
    private String placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private int capacity;
    private String memo;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
