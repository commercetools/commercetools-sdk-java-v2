package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Subscription.ResourceUpdatedDeliveryImpl;

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
@JsonDeserialize(as = ResourceUpdatedDeliveryImpl.class)
public interface ResourceUpdatedDelivery extends SubscriptionDelivery {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("oldVersion")
   public Long getOldVersion();
   
   @NotNull
   @JsonProperty("modifiedAt")
   public ZonedDateTime getModifiedAt();

   public void setVersion(final Long version);
   
   public void setOldVersion(final Long oldVersion);
   
   public void setModifiedAt(final ZonedDateTime modifiedAt);
   
   public static ResourceUpdatedDeliveryImpl of(){
      return new ResourceUpdatedDeliveryImpl();
   }
   

   public static ResourceUpdatedDeliveryImpl of(final ResourceUpdatedDelivery template) {
      ResourceUpdatedDeliveryImpl instance = new ResourceUpdatedDeliveryImpl();
      instance.setProjectKey(template.getProjectKey());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setModifiedAt(template.getModifiedAt());
      instance.setOldVersion(template.getOldVersion());
      instance.setVersion(template.getVersion());
      return instance;
   }

}