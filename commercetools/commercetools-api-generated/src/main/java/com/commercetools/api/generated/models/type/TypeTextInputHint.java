package com.commercetools.api.generated.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.vrap.rmf.base.client.utils.Generated;

import java.util.Arrays;
import java.util.Optional;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TypeTextInputHint {

  
  @JsonProperty("SingleLine")
  SINGLE_LINE("SingleLine"),
  
  
  @JsonProperty("MultiLine")
  MULTI_LINE("MultiLine"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private TypeTextInputHint(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TypeTextInputHint> findEnumViaJsonName(String jsonName) {
    Optional<TypeTextInputHint> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}