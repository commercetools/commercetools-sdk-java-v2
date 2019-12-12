package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.payment.TransactionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = TransactionImpl.class)
public interface Transaction  {

   /**
   *  <p>The unique ID of this object.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
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
   public TypedMoney getAmount();
   /**
   *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
   *  If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
   */
   
   @JsonProperty("interactionId")
   public String getInteractionId();
   /**
   *  <p>The state of this transaction.</p>
   */
   
   @JsonProperty("state")
   public TransactionState getState();

   public void setId(final String id);
   
   public void setTimestamp(final ZonedDateTime timestamp);
   
   public void setType(final TransactionType type);
   
   public void setAmount(final TypedMoney amount);
   
   public void setInteractionId(final String interactionId);
   
   public void setState(final TransactionState state);
   
   public static TransactionImpl of(){
      return new TransactionImpl();
   }
   

   public static TransactionImpl of(final Transaction template) {
      TransactionImpl instance = new TransactionImpl();
      instance.setInteractionId(template.getInteractionId());
      instance.setAmount(template.getAmount());
      instance.setState(template.getState());
      instance.setId(template.getId());
      instance.setType(template.getType());
      instance.setTimestamp(template.getTimestamp());
      return instance;
   }

}