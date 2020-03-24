package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.GoogleCloudPubSubDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GoogleCloudPubSubDestinationImpl.class)
public interface GoogleCloudPubSubDestination extends Destination {

   
   @NotNull
   @JsonProperty("projectId")
   public String getProjectId();
   
   @NotNull
   @JsonProperty("topic")
   public String getTopic();

   public void setProjectId(final String projectId);
   
   public void setTopic(final String topic);
   
   public static GoogleCloudPubSubDestinationImpl of(){
      return new GoogleCloudPubSubDestinationImpl();
   }
   

   public static GoogleCloudPubSubDestinationImpl of(final GoogleCloudPubSubDestination template) {
      GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
      instance.setTopic(template.getTopic());
      instance.setProjectId(template.getProjectId());
      return instance;
   }

}