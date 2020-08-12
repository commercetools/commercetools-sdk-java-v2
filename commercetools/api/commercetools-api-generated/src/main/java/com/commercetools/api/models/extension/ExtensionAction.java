package com.commercetools.api.models.extension;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ExtensionAction {

  
  @JsonProperty("Create")
  CREATE("Create"),
  
  
  @JsonProperty("Update")
  UPDATE("Update");

  private final String jsonName;

  private ExtensionAction(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ExtensionAction> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}
