package com.galileo.cu.commons.models;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class DataMinerParameter implements Serializable {

  private String connection;
  private Integer dmaID;
  private Integer elementID;
  private Integer parameterID;
  private Integer tableIndex;
  private String parameterValue;
  private String includeCells;
}
