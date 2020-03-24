package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.SnsDestinationImpl;

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
@JsonDeserialize(as = SnsDestinationImpl.class)
public interface SnsDestination extends Destination {

   
   @NotNull
   @JsonProperty("accessKey")
   public String getAccessKey();
   
   @NotNull
   @JsonProperty("accessSecret")
   public String getAccessSecret();
   
   @NotNull
   @JsonProperty("topicArn")
   public String getTopicArn();

   public void setAccessKey(final String accessKey);
   
   public void setAccessSecret(final String accessSecret);
   
   public void setTopicArn(final String topicArn);
   
   public static SnsDestinationImpl of(){
      return new SnsDestinationImpl();
   }
   

   public static SnsDestinationImpl of(final SnsDestination template) {
      SnsDestinationImpl instance = new SnsDestinationImpl();
      instance.setAccessKey(template.getAccessKey());
      instance.setTopicArn(template.getTopicArn());
      instance.setAccessSecret(template.getAccessSecret());
      return instance;
   }

}