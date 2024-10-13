package com.galileo.cu.commons.models.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorFeign {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
