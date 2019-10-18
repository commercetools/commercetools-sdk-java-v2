package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.me.MyTransactionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyTransactionDraftBuilder {
   
   @Nullable
   private String interactionId;
   
   
   private com.commercetools.api.generated.models.common.Money amount;
   
   
   private com.commercetools.api.generated.models.payment.TransactionType type;
   
   @Nullable
   private java.time.ZonedDateTime timestamp;
   
   public MyTransactionDraftBuilder interactionId(@Nullable final String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public MyTransactionDraftBuilder amount( final com.commercetools.api.generated.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public MyTransactionDraftBuilder type( final com.commercetools.api.generated.models.payment.TransactionType type) {
      this.type = type;
      return this;
   }
   
   public MyTransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
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
   
   
   public com.commercetools.api.generated.models.payment.TransactionType getType(){
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