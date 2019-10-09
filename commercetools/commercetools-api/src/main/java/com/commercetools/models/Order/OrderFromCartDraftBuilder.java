package com.commercetools.models.order;

import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.order.OrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderFromCartDraftBuilder {
   
   @Nullable
   private com.commercetools.models.order.ShipmentState shipmentState;
   
   @Nullable
   private String orderNumber;
   
   @Nullable
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   
   private String id;
   
   @Nullable
   private com.commercetools.models.order.PaymentState paymentState;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.order.OrderState orderState;
   
   public OrderFromCartDraftBuilder shipmentState(@Nullable final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderFromCartDraftBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public OrderFromCartDraftBuilder state(@Nullable final com.commercetools.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public OrderFromCartDraftBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public OrderFromCartDraftBuilder paymentState(@Nullable final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public OrderFromCartDraftBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public OrderFromCartDraftBuilder orderState(@Nullable final com.commercetools.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   @Nullable
   public com.commercetools.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public OrderFromCartDraft build() {
       return new OrderFromCartDraftImpl(shipmentState, orderNumber, state, id, paymentState, version, orderState);
   }
   
   public static OrderFromCartDraftBuilder of() {
      return new OrderFromCartDraftBuilder();
   }
   
   public static OrderFromCartDraftBuilder of(final OrderFromCartDraft template) {
      OrderFromCartDraftBuilder builder = new OrderFromCartDraftBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.orderNumber = template.getOrderNumber();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.paymentState = template.getPaymentState();
      builder.version = template.getVersion();
      builder.orderState = template.getOrderState();
      return builder;
   }
   
}