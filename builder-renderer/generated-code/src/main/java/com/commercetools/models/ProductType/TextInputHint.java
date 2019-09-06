package com.commercetools.models.ProductType;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TextInputHint {

  
  @JsonProperty("SingleLine")
  SINGLE_LINE("SingleLine"),
  
  
  @JsonProperty("MultiLine")
  MULTI_LINE("MultiLine");

  private final String jsonName;

  private TextInputHint(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TextInputHint> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}