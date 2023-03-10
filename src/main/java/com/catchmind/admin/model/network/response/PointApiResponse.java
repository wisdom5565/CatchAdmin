package com.catchmind.admin.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PointApiResponse {
    private Long poIdx;
    private Long prIdx;
    private String poList;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
}
