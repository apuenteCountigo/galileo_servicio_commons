package com.galileo.cu.commons.models.dto;

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
public class GroupsTraccar {
    private int id;
    private Map<String, Object> attributes;
    private int groupId;
    private String name;
}
