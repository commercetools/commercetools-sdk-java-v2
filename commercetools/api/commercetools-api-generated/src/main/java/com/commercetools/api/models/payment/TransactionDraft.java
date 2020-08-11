package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.models.payment.TransactionDraftImpl;

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
@JsonDeserialize(as = TransactionDraftImpl.class)
public interface TransactionDraft  {

   /**
   *  <p>The time at which the transaction took place.</p>
   */

   @JsonProperty("timestamp")
   public ZonedDateTime getTimestamp();
   /**
   *  <p>The type of this transaction.</p>
   */
   @NotNull
   @JsonProperty("type")
   public TransactionType getType();

   @NotNull
   @Valid
   @JsonProperty("amount")
   public Money getAmount();
   /**
   *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
   *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
   */

   @JsonProperty("interactionId")
   public String getInteractionId();
   /**
   *  <p>The state of this transaction.
   *  If not set, defaults to <code>Initial</code>.</p>
   */

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
