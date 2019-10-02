package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.TransactionState;
import com.commercetools.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.models.payment.TransactionDraftImpl;

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
@JsonDeserialize(as = TransactionDraftImpl.class)
public interface TransactionDraft  {

   
   
   @JsonProperty("timestamp")
   public ZonedDateTime getTimestamp();
   
   @NotNull
   @JsonProperty("type")
   public TransactionType getType();
   
   @NotNull
   @Valid
   @JsonProperty("amount")
   public Money getAmount();
   
   
   @JsonProperty("interactionId")
   public String getInteractionId();
   
   
   @JsonProperty("state")
   public TransactionState getState();

   public void setTimestamp(final ZonedDateTime timestamp);
   
   public void setType(final TransactionType type);
   
   public void setAmount(final Money amount);
   
   public void setInteractionId(final String interactionId);
   
   public void setState(final TransactionState state);
   
   public static TransactionDraftImpl of(){
      return new TransactionDraftImpl();
   }
   

   public static TransactionDraftImpl of(final TransactionDraft template) {
      TransactionDraftImpl instance = new TransactionDraftImpl();
      instance.setInteractionId(template.getInteractionId());
      instance.setAmount(template.getAmount());
      instance.setState(template.getState());
      instance.setType(template.getType());
      instance.setTimestamp(template.getTimestamp());
      return instance;
   }

}