package com.commercetools.models.subscription;

import com.commercetools.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.models.subscription.ResourceDeletedDeliveryImpl;

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
@JsonDeserialize(as = ResourceDeletedDeliveryImpl.class)
public interface ResourceDeletedDelivery extends SubscriptionDelivery {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("modifiedAt")
   public ZonedDateTime getModifiedAt();

   public void setVersion(final Long version);
   
   public void setModifiedAt(final ZonedDateTime modifiedAt);
   
   public static ResourceDeletedDeliveryImpl of(){
      return new ResourceDeletedDeliveryImpl();
   }
   

   public static ResourceDeletedDeliveryImpl of(final ResourceDeletedDelivery template) {
      ResourceDeletedDeliveryImpl instance = new ResourceDeletedDeliveryImpl();
      instance.setProjectKey(template.getProjectKey());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setModifiedAt(template.getModifiedAt());
      instance.setVersion(template.getVersion());
      return instance;
   }

}