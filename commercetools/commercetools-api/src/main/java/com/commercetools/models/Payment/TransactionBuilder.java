package com.commercetools.models.Payment;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Payment.TransactionState;
import com.commercetools.models.Payment.TransactionType;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Payment.Transaction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TransactionBuilder {
   
   @Nullable
   private java.lang.String interactionId;
   
   
   private com.commercetools.models.Common.TypedMoney amount;
   
   @Nullable
   private com.commercetools.models.Payment.TransactionState state;
   
   
   private java.lang.String id;
   
   
   private com.commercetools.models.Payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public TransactionBuilder interactionId(@Nullable final java.lang.String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public TransactionBuilder amount( final com.commercetools.models.Common.TypedMoney amount) {
      this.amount = amount;
      return this;
   }
   
   public TransactionBuilder state(@Nullable final com.commercetools.models.Payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public TransactionBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TransactionBuilder type( final com.commercetools.models.Payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public TransactionBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   @Nullable
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmount(){
      return this.amount;
   }
   
   @Nullable
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Payment.TransactionType getType(){
      return this.type;
   }
   
   @Nullable
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public Transaction build() {
       return new TransactionImpl(interactionId, amount, state, id, type, timestamp);
   }
   
   public static TransactionBuilder of() {
      return new TransactionBuilder();
   }
   
   public static TransactionBuilder of(final Transaction template) {
      TransactionBuilder builder = new TransactionBuilder();
      builder.interactionId = template.getInteractionId();
      builder.amount = template.getAmount();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.type = template.getType();
      builder.timestamp = template.getTimestamp();
      return builder;
   }
   
}