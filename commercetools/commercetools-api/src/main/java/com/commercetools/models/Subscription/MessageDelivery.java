package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.PayloadNotIncluded;
import com.commercetools.models.Subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Subscription.MessageDeliveryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = MessageDeliveryImpl.class)
public interface MessageDelivery extends SubscriptionDelivery {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   
   @NotNull
   @JsonProperty("sequenceNumber")
   public Long getSequenceNumber();
   
   @NotNull
   @JsonProperty("resourceVersion")
   public Long getResourceVersion();
   
   @NotNull
   @Valid
   @JsonProperty("payloadNotIncluded")
   public PayloadNotIncluded getPayloadNotIncluded();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setSequenceNumber(final Long sequenceNumber);
   
   public void setResourceVersion(final Long resourceVersion);
   
   public void setPayloadNotIncluded(final PayloadNotIncluded payloadNotIncluded);
   
   public static MessageDeliveryImpl of(){
      return new MessageDeliveryImpl();
   }
   

   public static MessageDeliveryImpl of(final MessageDelivery template) {
      MessageDeliveryImpl instance = new MessageDeliveryImpl();
      instance.setProjectKey(template.getProjectKey());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setPayloadNotIncluded(template.getPayloadNotIncluded());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      return instance;
   }

}