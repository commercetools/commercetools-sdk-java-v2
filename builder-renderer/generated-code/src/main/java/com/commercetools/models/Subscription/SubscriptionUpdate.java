package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.Long;
import com.commercetools.models.Subscription.SubscriptionUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionUpdateImpl.class)
public interface SubscriptionUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<SubscriptionUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<SubscriptionUpdateAction> actions);
   
   public static SubscriptionUpdateImpl of(){
      return new SubscriptionUpdateImpl();
   }
   

   public static SubscriptionUpdateImpl of(final SubscriptionUpdate template) {
      SubscriptionUpdateImpl instance = new SubscriptionUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}