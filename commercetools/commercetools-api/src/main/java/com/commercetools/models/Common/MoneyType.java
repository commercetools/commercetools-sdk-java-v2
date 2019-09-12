package com.commercetools.models.Common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum MoneyType {

  
  @JsonProperty("centPrecision")
  CENT_PRECISION("centPrecision"),
  
  
  @JsonProperty("highPrecision")
  HIGH_PRECISION("highPrecision");

  private final String jsonName;

  private MoneyType(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<MoneyType> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}