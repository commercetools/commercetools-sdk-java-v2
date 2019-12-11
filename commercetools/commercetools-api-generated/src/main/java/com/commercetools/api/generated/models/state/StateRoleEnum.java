package com.commercetools.api.generated.models.state;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum StateRoleEnum {

  
  @JsonProperty("ReviewIncludedInStatistics")
  REVIEW_INCLUDED_IN_STATISTICS("ReviewIncludedInStatistics"),
  
  
  @JsonProperty("Return")
  RETURN("Return"),
  
  @JsonProperty("unknown")
  UNKNOWN("unknown");

  private final String jsonName;

  private StateRoleEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<StateRoleEnum> findEnumViaJsonName(String jsonName) {
    Optional<StateRoleEnum> optional = Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    if(!optional.isPresent()) {
      return Optional.of(UNKNOWN);
    }else {
      return optional;
    }
  }
}