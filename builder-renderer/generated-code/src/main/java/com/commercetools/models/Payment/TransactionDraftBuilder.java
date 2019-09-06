package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.TransactionState;
import com.commercetools.models.Payment.TransactionType;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Payment.TransactionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TransactionDraftBuilder {
   
   @Nullable
   private java.lang.String interactionId;
   
   
   private com.commercetools.models.Common.Money amount;
   
   @Nullable
   private com.commercetools.models.Payment.TransactionState state;
   
   
   private com.commercetools.models.Payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public TransactionDraftBuilder interactionId(@Nullable final java.lang.String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public TransactionDraftBuilder amount( final com.commercetools.models.Common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public TransactionDraftBuilder state(@Nullable final com.commercetools.models.Payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public TransactionDraftBuilder type( final com.commercetools.models.Payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public TransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   @Nullable
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }
   
   @Nullable
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.Payment.TransactionType getType(){
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