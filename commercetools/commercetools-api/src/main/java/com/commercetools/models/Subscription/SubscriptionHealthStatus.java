package com.commercetools.models.Subscription;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum SubscriptionHealthStatus {

  
  @JsonProperty("Healthy")
  HEALTHY("Healthy"),
  
  
  @JsonProperty("ConfigurationError")
  CONFIGURATION_ERROR("ConfigurationError"),
  
  
  @JsonProperty("ConfigurationErrorDeliveryStopped")
  CONFIGURATION_ERROR_DELIVERY_STOPPED("ConfigurationErrorDeliveryStopped"),
  
  
  @JsonProperty("TemporaryError")
  TEMPORARY_ERROR("TemporaryError");

  private final String jsonName;

  private SubscriptionHealthStatus(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<SubscriptionHealthStatus> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}