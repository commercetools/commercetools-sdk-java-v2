package com.commercetools.models.Type;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TypeTextInputHint {

  
  @JsonProperty("SingleLine")
  SINGLE_LINE("SingleLine"),
  
  
  @JsonProperty("MultiLine")
  MULTI_LINE("MultiLine");

  private final String jsonName;

  private TypeTextInputHint(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TypeTextInputHint> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}