package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.payment.Transaction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TransactionBuilder {
   
   @Nullable
   private String interactionId;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney amount;
   
   @Nullable
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   
   private String id;
   
   
   private com.commercetools.api.generated.models.payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public TransactionBuilder interactionId(@Nullable final String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public TransactionBuilder amount( final com.commercetools.api.generated.models.common.TypedMoney amount) {
      this.amount = amount;
      return this;
   }
   
   public TransactionBuilder state(@Nullable final com.commercetools.api.generated.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public TransactionBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public TransactionBuilder type( final com.commercetools.api.generated.models.payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public TransactionBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   @Nullable
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmount(){
      return this.amount;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionType getType(){
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