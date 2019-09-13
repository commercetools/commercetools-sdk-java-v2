package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.TransactionType;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.me.MyTransactionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyTransactionDraftBuilder {
   
   @Nullable
   private java.lang.String interactionId;
   
   
   private com.commercetools.models.common.Money amount;
   
   
   private com.commercetools.models.payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public MyTransactionDraftBuilder interactionId(@Nullable final java.lang.String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public MyTransactionDraftBuilder amount( final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public MyTransactionDraftBuilder type( final com.commercetools.models.payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public MyTransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   @Nullable
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.models.payment.TransactionType getType(){
      return this.type;
   }
   
   @Nullable
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public MyTransactionDraft build() {
       return new MyTransactionDraftImpl(interactionId, amount, type, timestamp);
   }
   
   public static MyTransactionDraftBuilder of() {
      return new MyTransactionDraftBuilder();
   }
   
   public static MyTransactionDraftBuilder of(final MyTransactionDraft template) {
      MyTransactionDraftBuilder builder = new MyTransactionDraftBuilder();
      builder.interactionId = template.getInteractionId();
      builder.amount = template.getAmount();
      builder.type = template.getType();
      builder.timestamp = template.getTimestamp();
      return builder;
   }
   
}