package com.commercetools.models.Order;

import com.commercetools.models.Cart.CustomLineItemDraft;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.Money;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.Order.LineItemImportDraft;
import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Order.ShippingInfoImportDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.OrderImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private java.lang.String orderNumber;
   
   
   private com.commercetools.models.Common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.Order.ShippingInfoImportDraft shippingInfo;
   
   @Nullable
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   @Nullable
   private com.commercetools.models.Order.OrderState orderState;
   
   @Nullable
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.LineItemImportDraft> lineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   @Nullable
   private java.lang.String customerEmail;
   
   @Nullable
   private java.lang.String customerId;
   
   @Nullable
   private com.commercetools.models.Common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address billingAddress;
   
   @Nullable
   private com.commercetools.models.Order.PaymentState paymentState;
   
   public OrderImportDraftBuilder shipmentState(@Nullable final com.commercetools.models.Order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderImportDraftBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public OrderImportDraftBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public OrderImportDraftBuilder orderNumber(@Nullable final java.lang.String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public OrderImportDraftBuilder totalPrice( final com.commercetools.models.Common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderImportDraftBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderImportDraftBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderImportDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderImportDraftBuilder shippingInfo(@Nullable final com.commercetools.models.Order.ShippingInfoImportDraft shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderImportDraftBuilder inventoryMode(@Nullable final com.commercetools.models.Cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public OrderImportDraftBuilder orderState(@Nullable final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public OrderImportDraftBuilder taxRoundingMode(@Nullable final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public OrderImportDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.Order.LineItemImportDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public OrderImportDraftBuilder customLineItems(@Nullable final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public OrderImportDraftBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public OrderImportDraftBuilder customerEmail(@Nullable final java.lang.String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public OrderImportDraftBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public OrderImportDraftBuilder shippingAddress(@Nullable final com.commercetools.models.Common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public OrderImportDraftBuilder billingAddress(@Nullable final com.commercetools.models.Common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public OrderImportDraftBuilder paymentState(@Nullable final com.commercetools.models.Order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   @Nullable
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public OrderImportDraft build() {
       return new OrderImportDraftImpl(shipmentState, country, completedAt, orderNumber, totalPrice, customerGroup, taxedPrice, custom, shippingInfo, inventoryMode, orderState, taxRoundingMode, lineItems, customLineItems, itemShippingAddresses, customerEmail, customerId, shippingAddress, billingAddress, paymentState);
   }
   
   public static OrderImportDraftBuilder of() {
      return new OrderImportDraftBuilder();
   }
   
   public static OrderImportDraftBuilder of(final OrderImportDraft template) {
      OrderImportDraftBuilder builder = new OrderImportDraftBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.country = template.getCountry();
      builder.completedAt = template.getCompletedAt();
      builder.orderNumber = template.getOrderNumber();
      builder.totalPrice = template.getTotalPrice();
      builder.customerGroup = template.getCustomerGroup();
      builder.taxedPrice = template.getTaxedPrice();
      builder.custom = template.getCustom();
      builder.shippingInfo = template.getShippingInfo();
      builder.inventoryMode = template.getInventoryMode();
      builder.orderState = template.getOrderState();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.lineItems = template.getLineItems();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.customerEmail = template.getCustomerEmail();
      builder.customerId = template.getCustomerId();
      builder.shippingAddress = template.getShippingAddress();
      builder.billingAddress = template.getBillingAddress();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}