package com.galileo.cu.commons.models.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorFeign {
    public String timestamp;
    public int status;
    public String error;
    public String message;
    public String path;
}
