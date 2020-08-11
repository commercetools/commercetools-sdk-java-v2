package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartState;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart.Cart;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private String country;
   
   
   private com.commercetools.api.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.api.models.cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.api.models.cart.CartOrigin origin;
   
   @Nullable
   private Integer deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.api.models.cart.ShippingInfo shippingInfo;
   
   
   private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;
   
   @Nullable
   private String locale;
   
   @Nullable
   private com.commercetools.api.models.cart.InventoryMode inventoryMode;
   
   
   private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private String customerEmail;
   
   
   private com.commercetools.api.models.cart.CartState cartState;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;
   
   
   private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.api.models.store.StoreKeyReference store;
   
   
   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;
   
   
   private com.commercetools.api.models.cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.api.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.api.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.api.models.order.PaymentInfo paymentInfo;
   
   public CartBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CartBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CartBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CartBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public CartBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CartBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CartBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public CartBuilder totalPrice( final com.commercetools.api.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public CartBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public CartBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public CartBuilder origin( final com.commercetools.api.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public CartBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public CartBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public CartBuilder refusedGifts( final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   public CartBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public CartBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public CartBuilder lineItems( final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public CartBuilder customLineItems( final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public CartBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public CartBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public CartBuilder cartState( final com.commercetools.api.models.cart.CartState cartState) {
      this.cartState = cartState;
      return this;
   }
   
   public CartBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public CartBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CartBuilder discountCodes(@Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public CartBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CartBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartBuilder taxCalculationMode( final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public CartBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public CartBuilder taxRoundingMode( final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public CartBuilder taxMode( final com.commercetools.api.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public CartBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public CartBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public CartBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
      this.paymentInfo = paymentInfo;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.api.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.api.models.cart.CartState getCartState(){
      return this.cartState;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.api.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.api.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.api.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public Cart build() {
       return new CartImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, country, totalPrice, shippingRateInput, taxedPrice, origin, deleteDaysAfterLastModification, shippingInfo, refusedGifts, locale, inventoryMode, lineItems, customLineItems, itemShippingAddresses, customerEmail, cartState, customerId, anonymousId, discountCodes, customerGroup, custom, taxCalculationMode, store, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static CartBuilder of() {
      return new CartBuilder();
   }
   
   public static CartBuilder of(final Cart template) {
      CartBuilder builder = new CartBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.country = template.getCountry();
      builder.totalPrice = template.getTotalPrice();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.taxedPrice = template.getTaxedPrice();
      builder.origin = template.getOrigin();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.shippingInfo = template.getShippingInfo();
      builder.refusedGifts = template.getRefusedGifts();
      builder.locale = template.getLocale();
      builder.inventoryMode = template.getInventoryMode();
      builder.lineItems = template.getLineItems();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.customerEmail = template.getCustomerEmail();
      builder.cartState = template.getCartState();
      builder.customerId = template.getCustomerId();
      builder.anonymousId = template.getAnonymousId();
      builder.discountCodes = template.getDiscountCodes();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.store = template.getStore();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.taxMode = template.getTaxMode();
      builder.shippingAddress = template.getShippingAddress();
      builder.billingAddress = template.getBillingAddress();
      builder.paymentInfo = template.getPaymentInfo();
      return builder;
   }
   
}
