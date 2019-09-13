package com.commercetools.models.subscription;

import com.commercetools.models.subscription.ChangeSubscription;
import com.commercetools.models.subscription.SubscriptionUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionSetChangesActionImpl implements SubscriptionSetChangesAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes;

   @JsonCreator
   SubscriptionSetChangesActionImpl(@JsonProperty("changes") final java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes) {
      this.changes = changes;
      this.action = "setChanges";
   }
   public SubscriptionSetChangesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }

   public void setChanges(final java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes){
      this.changes = changes;
   }

}