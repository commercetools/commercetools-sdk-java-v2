package com.commercetools.api.generated.models.subscription;


import com.commercetools.api.generated.models.subscription.MessageSubscriptionImpl;

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
@JsonDeserialize(as = MessageSubscriptionImpl.class)
public interface MessageSubscription  {

   
   @NotNull
   @JsonProperty("resourceTypeId")
   public String getResourceTypeId();
   
   
   @JsonProperty("types")
   public List<String> getTypes();

   public void setResourceTypeId(final String resourceTypeId);
   
   public void setTypes(final List<String> types);
   
   public static MessageSubscriptionImpl of(){
      return new MessageSubscriptionImpl();
   }
   

   public static MessageSubscriptionImpl of(final MessageSubscription template) {
      MessageSubscriptionImpl instance = new MessageSubscriptionImpl();
      instance.setTypes(template.getTypes());
      instance.setResourceTypeId(template.getResourceTypeId());
      return instance;
   }

}