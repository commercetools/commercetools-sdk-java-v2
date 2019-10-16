package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import com.commercetools.api.generated.models.subscription.DeliveryFormat;
import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.MessageSubscription;
import com.commercetools.api.generated.models.subscription.SubscriptionDraftImpl;

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
@JsonDeserialize(as = SubscriptionDraftImpl.class)
public interface SubscriptionDraft  {

   
   @Valid
   @JsonProperty("changes")
   public List<ChangeSubscription> getChanges();
   
   @NotNull
   @Valid
   @JsonProperty("destination")
   public Destination getDestination();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("messages")
   public List<MessageSubscription> getMessages();
   
   @Valid
   @JsonProperty("format")
   public DeliveryFormat getFormat();

   public void setChanges(final List<ChangeSubscription> changes);
   
   public void setDestination(final Destination destination);
   
   public void setKey(final String key);
   
   public void setMessages(final List<MessageSubscription> messages);
   
   public void setFormat(final DeliveryFormat format);
   
   public static SubscriptionDraftImpl of(){
      return new SubscriptionDraftImpl();
   }
   

   public static SubscriptionDraftImpl of(final SubscriptionDraft template) {
      SubscriptionDraftImpl instance = new SubscriptionDraftImpl();
      instance.setFormat(template.getFormat());
      instance.setDestination(template.getDestination());
      instance.setChanges(template.getChanges());
      instance.setMessages(template.getMessages());
      instance.setKey(template.getKey());
      return instance;
   }

}