package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.payment.TransactionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TransactionDraftBuilder {
   
   @Nullable
   private String interactionId;
   
   
   private com.commercetools.api.generated.models.common.Money amount;
   
   @Nullable
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   
   private com.commercetools.api.generated.models.payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public TransactionDraftBuilder interactionId(@Nullable final String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public TransactionDraftBuilder amount( final com.commercetools.api.generated.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public TransactionDraftBuilder state(@Nullable final com.commercetools.api.generated.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public TransactionDraftBuilder type( final com.commercetools.api.generated.models.payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public TransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   @Nullable
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getAmount(){
      return this.amount;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionType getType(){
      return this.type;
   }
   
   @Nullable
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public TransactionDraft build() {
       return new TransactionDraftImpl(interactionId, amount, state, type, timestamp);
   }
   
   public static TransactionDraftBuilder of() {
      return new TransactionDraftBuilder();
   }
   
   public static TransactionDraftBuilder of(final TransactionDraft template) {
      TransactionDraftBuilder builder = new TransactionDraftBuilder();
      builder.interactionId = template.getInteractionId();
      builder.amount = template.getAmount();
      builder.state = template.getState();
      builder.type = template.getType();
      builder.timestamp = template.getTimestamp();
      return builder;
   }
   
}