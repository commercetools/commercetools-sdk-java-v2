package com.commercetools.models.subscription;

import com.commercetools.models.subscription.ChangeSubscription;
import com.commercetools.models.subscription.SubscriptionUpdateAction;
import com.commercetools.models.subscription.SubscriptionSetChangesActionImpl;

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
@JsonDeserialize(as = SubscriptionSetChangesActionImpl.class)
public interface SubscriptionSetChangesAction extends SubscriptionUpdateAction {

   
   @Valid
   @JsonProperty("changes")
   public List<ChangeSubscription> getChanges();

   public void setChanges(final List<ChangeSubscription> changes);
   
   public static SubscriptionSetChangesActionImpl of(){
      return new SubscriptionSetChangesActionImpl();
   }
   

   public static SubscriptionSetChangesActionImpl of(final SubscriptionSetChangesAction template) {
      SubscriptionSetChangesActionImpl instance = new SubscriptionSetChangesActionImpl();
      instance.setChanges(template.getChanges());
      return instance;
   }

}