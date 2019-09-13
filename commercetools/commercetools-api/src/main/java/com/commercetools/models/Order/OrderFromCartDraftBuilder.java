package com.commercetools.models.order;

import com.commercetools.models.order.PaymentState;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.order.OrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderFromCartDraftBuilder {
   
   @Nullable
   private java.lang.String orderNumber;
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.order.PaymentState paymentState;
   
   
   private java.lang.Long version;
   
   public OrderFromCartDraftBuilder orderNumber(@Nullable final java.lang.String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public OrderFromCartDraftBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderFromCartDraftBuilder paymentState(@Nullable final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public OrderFromCartDraftBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   @Nullable
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public OrderFromCartDraft build() {
       return new OrderFromCartDraftImpl(orderNumber, id, paymentState, version);
   }
   
   public static OrderFromCartDraftBuilder of() {
      return new OrderFromCartDraftBuilder();
   }
   
   public static OrderFromCartDraftBuilder of(final OrderFromCartDraft template) {
      OrderFromCartDraftBuilder builder = new OrderFromCartDraftBuilder();
      builder.orderNumber = template.getOrderNumber();
      builder.id = template.getId();
      builder.paymentState = template.getPaymentState();
      builder.version = template.getVersion();
      return builder;
   }
   
}