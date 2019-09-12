package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.String;
import com.commercetools.models.Subscription.SubscriptionSetKeyActionImpl;

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
@JsonDeserialize(as = SubscriptionSetKeyActionImpl.class)
public interface SubscriptionSetKeyAction extends SubscriptionUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static SubscriptionSetKeyActionImpl of(){
      return new SubscriptionSetKeyActionImpl();
   }
   

   public static SubscriptionSetKeyActionImpl of(final SubscriptionSetKeyAction template) {
      SubscriptionSetKeyActionImpl instance = new SubscriptionSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}