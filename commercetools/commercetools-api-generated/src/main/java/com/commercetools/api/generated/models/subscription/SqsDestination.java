package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.SqsDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = SqsDestinationImpl.class)
public interface SqsDestination extends Destination {

   
   @NotNull
   @JsonProperty("accessKey")
   public String getAccessKey();
   
   @NotNull
   @JsonProperty("accessSecret")
   public String getAccessSecret();
   
   @NotNull
   @JsonProperty("queueUrl")
   public String getQueueUrl();
   
   @NotNull
   @JsonProperty("region")
   public String getRegion();

   public void setAccessKey(final String accessKey);
   
   public void setAccessSecret(final String accessSecret);
   
   public void setQueueUrl(final String queueUrl);
   
   public void setRegion(final String region);
   
   public static SqsDestinationImpl of(){
      return new SqsDestinationImpl();
   }
   

   public static SqsDestinationImpl of(final SqsDestination template) {
      SqsDestinationImpl instance = new SqsDestinationImpl();
      instance.setAccessKey(template.getAccessKey());
      instance.setQueueUrl(template.getQueueUrl());
      instance.setRegion(template.getRegion());
      instance.setAccessSecret(template.getAccessSecret());
      return instance;
   }

}