package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CartState;
import com.commercetools.models.Cart.CustomLineItem;
import com.commercetools.models.Cart.DiscountCodeInfo;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItem;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingInfo;
import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Order.PaymentInfo;
import com.commercetools.models.Store.StoreKeyReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartImpl implements Cart {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private java.lang.String country;
   
   private com.commercetools.models.Common.TypedMoney totalPrice;
   
   private com.commercetools.models.Cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   private com.commercetools.models.Cart.CartOrigin origin;
   
   private java.lang.Integer deleteDaysAfterLastModification;
   
   private com.commercetools.models.Cart.ShippingInfo shippingInfo;
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> refusedGifts;
   
   private java.lang.String locale;
   
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   private java.util.List<com.commercetools.models.Cart.LineItem> lineItems;
   
   private java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems;
   
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   private java.lang.String customerEmail;
   
   private com.commercetools.models.Cart.CartState cartState;
   
   private java.lang.String customerId;
   
   private java.lang.String anonymousId;
   
   private java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.models.Store.StoreKeyReference store;
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   private com.commercetools.models.Common.Address shippingAddress;
   
   private com.commercetools.models.Common.Address billingAddress;
   
   private com.commercetools.models.Order.PaymentInfo paymentInfo;

   @JsonCreator
   CartImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("country") final java.lang.String country, @JsonProperty("totalPrice") final com.commercetools.models.Common.TypedMoney totalPrice, @JsonProperty("shippingRateInput") final com.commercetools.models.Cart.ShippingRateInput shippingRateInput, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedPrice taxedPrice, @JsonProperty("origin") final com.commercetools.models.Cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Integer deleteDaysAfterLastModification, @JsonProperty("shippingInfo") final com.commercetools.models.Cart.ShippingInfo shippingInfo, @JsonProperty("refusedGifts") final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> refusedGifts, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("inventoryMode") final com.commercetools.models.Cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.Cart.LineItem> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("cartState") final com.commercetools.models.Cart.CartState cartState, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("discountCodes") final java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("taxCalculationMode") final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.models.Store.StoreKeyReference store, @JsonProperty("taxRoundingMode") final com.commercetools.models.Cart.RoundingMode taxRoundingMode, @JsonProperty("taxMode") final com.commercetools.models.Cart.TaxMode taxMode, @JsonProperty("shippingAddress") final com.commercetools.models.Common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.models.Common.Address billingAddress, @JsonProperty("paymentInfo") final com.commercetools.models.Order.PaymentInfo paymentInfo) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.country = country;
      this.totalPrice = totalPrice;
      this.shippingRateInput = shippingRateInput;
      this.taxedPrice = taxedPrice;
      this.origin = origin;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.shippingInfo = shippingInfo;
      this.refusedGifts = refusedGifts;
      this.locale = locale;
      this.inventoryMode = inventoryMode;
      this.lineItems = lineItems;
      this.customLineItems = customLineItems;
      this.itemShippingAddresses = itemShippingAddresses;
      this.customerEmail = customerEmail;
      this.cartState = cartState;
      this.customerId = customerId;
      this.anonymousId = anonymousId;
      this.discountCodes = discountCodes;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.taxCalculationMode = taxCalculationMode;
      this.store = store;
      this.taxRoundingMode = taxRoundingMode;
      this.taxMode = taxMode;
      this.shippingAddress = shippingAddress;
      this.billingAddress = billingAddress;
      this.paymentInfo = paymentInfo;
   }
   public CartImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public java.lang.Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.Cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.models.Cart.CartState getCartState(){
      return this.cartState;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.models.Store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.models.Order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setTotalPrice(final com.commercetools.models.Common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setShippingRateInput(final com.commercetools.models.Cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setOrigin(final com.commercetools.models.Cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setDeleteDaysAfterLastModification(final java.lang.Integer deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setShippingInfo(final com.commercetools.models.Cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setRefusedGifts(final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> refusedGifts){
      this.refusedGifts = refusedGifts;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setInventoryMode(final com.commercetools.models.Cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.Cart.LineItem> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCartState(final com.commercetools.models.Cart.CartState cartState){
      this.cartState = cartState;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setDiscountCodes(final java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes){
      this.discountCodes = discountCodes;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setTaxCalculationMode(final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.models.Store.StoreKeyReference store){
      this.store = store;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.Cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setTaxMode(final com.commercetools.models.Cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setShippingAddress(final com.commercetools.models.Common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.models.Common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentInfo(final com.commercetools.models.Order.PaymentInfo paymentInfo){
      this.paymentInfo = paymentInfo;
   }

}