package com.galileo.cu.commons.models.dto;

import java.util.List;
import java.util.Map;

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
public class DevicesTraccar {
    private int id;
    private Map<String, Object> attributes;
    private int groupId;
    private String name;
    private String uniqueId;
    private String status;
    private String lastUpdate; // Se puede usar LocalDateTime si prefieres manejar fechas y horas
    private int positionId;
    private List<Integer> geofenceIds;
    private String phone;
    private String model;
    private String contact;
    private String category;
    private boolean disabled;
}
