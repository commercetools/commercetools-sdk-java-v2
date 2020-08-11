package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.ResourceCreatedDeliveryImpl;

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
@JsonDeserialize(as = ResourceCreatedDeliveryImpl.class)
public interface ResourceCreatedDelivery extends SubscriptionDelivery {


   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("modifiedAt")
   public ZonedDateTime getModifiedAt();

   public void setVersion(final Long version);

   public void setModifiedAt(final ZonedDateTime modifiedAt);

   public static ResourceCreatedDeliveryImpl of(){
      return new ResourceCreatedDeliveryImpl();
   }


   public static ResourceCreatedDeliveryImpl of(final ResourceCreatedDelivery template) {
      ResourceCreatedDeliveryImpl instance = new ResourceCreatedDeliveryImpl();
      instance.setProjectKey(template.getProjectKey());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setModifiedAt(template.getModifiedAt());
      instance.setVersion(template.getVersion());
      return instance;
   }

}
