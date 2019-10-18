package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.TaxedPrice;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.order.LineItemImportDraft;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.ShippingInfoImportDraft;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   @Nullable
   private String country;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private String orderNumber;
   
   
   private com.commercetools.api.generated.models.common.Money totalPrice;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ShippingInfoImportDraft shippingInfo;
   
   @Nullable
   private com.commercetools.api.generated.models.store.StoreKeyReference store;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   @Nullable
   private com.commercetools.api.generated.models.order.OrderState orderState;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> lineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private String customerEmail;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   public OrderImportDraftBuilder shipmentState(@Nullable final com.commercetools.api.generated.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderImportDraftBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public OrderImportDraftBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public OrderImportDraftBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public OrderImportDraftBuilder totalPrice( final com.commercetools.api.generated.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderImportDraftBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderImportDraftBuilder taxedPrice(@Nullable final com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderImportDraftBuilder origin(@Nullable final com.commercetools.api.generated.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public OrderImportDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderImportDraftBuilder shippingInfo(@Nullable final com.commercetools.api.generated.models.order.ShippingInfoImportDraft shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderImportDraftBuilder store(@Nullable final com.commercetools.api.generated.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public OrderImportDraftBuilder inventoryMode(@Nullable final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public OrderImportDraftBuilder orderState(@Nullable final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public OrderImportDraftBuilder taxRoundingMode(@Nullable final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public OrderImportDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public OrderImportDraftBuilder customLineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public OrderImportDraftBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public OrderImportDraftBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public OrderImportDraftBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public OrderImportDraftBuilder shippingAddress(@Nullable final com.commercetools.api.generated.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public OrderImportDraftBuilder billingAddress(@Nullable final com.commercetools.api.generated.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public OrderImportDraftBuilder paymentState(@Nullable final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public OrderImportDraft build() {
       return new OrderImportDraftImpl(shipmentState, country, completedAt, orderNumber, totalPrice, customerGroup, taxedPrice, origin, custom, shippingInfo, store, inventoryMode, orderState, taxRoundingMode, lineItems, customLineItems, itemShippingAddresses, customerEmail, customerId, shippingAddress, billingAddress, paymentState);
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
      builder.origin = template.getOrigin();
      builder.custom = template.getCustom();
      builder.shippingInfo = template.getShippingInfo();
      builder.store = template.getStore();
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