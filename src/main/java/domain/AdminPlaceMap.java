package domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {

    public Long id;
    public Long adminId;
    public Long placeId;
    public LocalDateTime createdAt;
    public LocalDateTime modifiedAt;
}
