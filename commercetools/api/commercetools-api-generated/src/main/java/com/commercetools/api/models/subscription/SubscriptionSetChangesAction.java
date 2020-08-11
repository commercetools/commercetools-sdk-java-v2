package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetChangesActionImpl;

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
