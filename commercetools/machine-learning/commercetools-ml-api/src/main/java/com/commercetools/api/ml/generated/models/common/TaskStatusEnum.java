package com.commercetools.api.ml.generated.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum TaskStatusEnum {

  
  @JsonProperty("PENDING")
  PENDING("PENDING"),
  
  
  @JsonProperty("SUCCESS")
  SUCCESS("SUCCESS");

  private final String jsonName;

  private TaskStatusEnum(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<TaskStatusEnum> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}
