package com.galileo.cu.commons.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@Data
@Getter
@Setter
@AllArgsConstructor
public class BodyDelDevicePermissions {
    private long userId;
    private int deviceId;
}
