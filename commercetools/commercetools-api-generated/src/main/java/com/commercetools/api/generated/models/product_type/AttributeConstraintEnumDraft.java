package com.commercetools.api.generated.models.product_type;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum AttributeConstraintEnumDraft {

  
  @JsonProperty("None")
  NONE("None"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private AttributeConstraintEnumDraft(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<AttributeConstraintEnumDraft> findEnumViaJsonName(String jsonName) {
    Optional<AttributeConstraintEnumDraft> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}