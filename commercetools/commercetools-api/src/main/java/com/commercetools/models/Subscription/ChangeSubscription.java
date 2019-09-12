package com.commercetools.models.Subscription;

import java.lang.String;
import com.commercetools.models.Subscription.ChangeSubscriptionImpl;

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
@JsonDeserialize(as = ChangeSubscriptionImpl.class)
public interface ChangeSubscription  {

   
   @NotNull
   @JsonProperty("resourceTypeId")
   public String getResourceTypeId();

   public void setResourceTypeId(final String resourceTypeId);
   
   public static ChangeSubscriptionImpl of(){
      return new ChangeSubscriptionImpl();
   }
   

   public static ChangeSubscriptionImpl of(final ChangeSubscription template) {
      ChangeSubscriptionImpl instance = new ChangeSubscriptionImpl();
      instance.setResourceTypeId(template.getResourceTypeId());
      return instance;
   }

}