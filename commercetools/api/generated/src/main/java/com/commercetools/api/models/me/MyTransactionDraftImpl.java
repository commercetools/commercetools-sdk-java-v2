package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionType;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyTransactionDraftImpl implements MyTransactionDraft {

   private String interactionId;

   private com.commercetools.api.models.common.Money amount;

   private com.commercetools.api.models.payment.TransactionType type;

   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   MyTransactionDraftImpl(@JsonProperty("interactionId") final String interactionId, @JsonProperty("amount") final com.commercetools.api.models.common.Money amount, @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.type = type;
      this.timestamp = timestamp;
   }
   public MyTransactionDraftImpl() {

   }

   /**
   *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
   *  If a matching interaction was logged in the interfaceInteractions array,
   *  the corresponding interaction should be findable with this ID.
   *  The <code>state</code> is set to the <code>Initial</code> TransactionState.</p>
   */
   public String getInteractionId(){
      return this.interactionId;
   }


   public com.commercetools.api.models.common.Money getAmount(){
      return this.amount;
   }

   /**
   *  <p>The type of this transaction.
   *  Only the <code>Authorization</code> or <code>Charge</code>
   *  TransactionTypes are allowed here.</p>
   */
   public com.commercetools.api.models.payment.TransactionType getType(){
      return this.type;
   }

   /**
   *  <p>The time at which the transaction took place.</p>
   */
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final String interactionId){
      this.interactionId = interactionId;
   }

   public void setAmount(final com.commercetools.api.models.common.Money amount){
      this.amount = amount;
   }

   public void setType(final com.commercetools.api.models.payment.TransactionType type){
      this.type = type;
   }

   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}
