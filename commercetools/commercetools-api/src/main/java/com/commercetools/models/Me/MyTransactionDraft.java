package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.models.me.MyTransactionDraftImpl;

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
@JsonDeserialize(as = MyTransactionDraftImpl.class)
public interface MyTransactionDraft  {

   
   
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

   public void setTimestamp(final ZonedDateTime timestamp);
   
   public void setType(final TransactionType type);
   
   public void setAmount(final Money amount);
   
   public void setInteractionId(final String interactionId);
   
   public static MyTransactionDraftImpl of(){
      return new MyTransactionDraftImpl();
   }
   

   public static MyTransactionDraftImpl of(final MyTransactionDraft template) {
      MyTransactionDraftImpl instance = new MyTransactionDraftImpl();
      instance.setInteractionId(template.getInteractionId());
      instance.setAmount(template.getAmount());
      instance.setType(template.getType());
      instance.setTimestamp(template.getTimestamp());
      return instance;
   }

}