package com.commercetools.models.cart;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CartState;
import com.commercetools.models.cart.CustomLineItem;
import com.commercetools.models.cart.DiscountCodeInfo;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.LineItem;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.ShippingInfo;
import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.order.PaymentInfo;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFields;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartImpl implements Cart {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private String country;
   
   private com.commercetools.models.common.TypedMoney totalPrice;
   
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   private com.commercetools.models.cart.CartOrigin origin;
   
   private Integer deleteDaysAfterLastModification;
   
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   private java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> refusedGifts;
   
   private String locale;
   
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   private java.util.List<com.commercetools.models.cart.LineItem> lineItems;
   
   private java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems;
   
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   private String customerEmail;
   
   private com.commercetools.models.cart.CartState cartState;
   
   private String customerId;
   
   private String anonymousId;
   
   private java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes;
   
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.models.store.StoreKeyReference store;
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   private com.commercetools.models.common.Address shippingAddress;
   
   private com.commercetools.models.common.Address billingAddress;
   
   private com.commercetools.models.order.PaymentInfo paymentInfo;

   @JsonCreator
   CartImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("country") final String country, @JsonProperty("totalPrice") final com.commercetools.models.common.TypedMoney totalPrice, @JsonProperty("shippingRateInput") final com.commercetools.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedPrice taxedPrice, @JsonProperty("origin") final com.commercetools.models.cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final Integer deleteDaysAfterLastModification, @JsonProperty("shippingInfo") final com.commercetools.models.cart.ShippingInfo shippingInfo, @JsonProperty("refusedGifts") final java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> refusedGifts, @JsonProperty("locale") final String locale, @JsonProperty("inventoryMode") final com.commercetools.models.cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.cart.LineItem> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("cartState") final com.commercetools.models.cart.CartState cartState, @JsonProperty("customerId") final String customerId, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("discountCodes") final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("taxCalculationMode") final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.models.store.StoreKeyReference store, @JsonProperty("taxRoundingMode") final com.commercetools.models.cart.RoundingMode taxRoundingMode, @JsonProperty("taxMode") final com.commercetools.models.cart.TaxMode taxMode, @JsonProperty("shippingAddress") final com.commercetools.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.models.common.Address billingAddress, @JsonProperty("paymentInfo") final com.commercetools.models.order.PaymentInfo paymentInfo) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.models.cart.CartState getCartState(){
      return this.cartState;
   }
   
   
   public String getCustomerId(){
      return this.customerId;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setTotalPrice(final com.commercetools.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setShippingRateInput(final com.commercetools.models.cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setOrigin(final com.commercetools.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setShippingInfo(final com.commercetools.models.cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setRefusedGifts(final java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> refusedGifts){
      this.refusedGifts = refusedGifts;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setInventoryMode(final com.commercetools.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.cart.LineItem> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCartState(final com.commercetools.models.cart.CartState cartState){
      this.cartState = cartState;
   }
   
   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setDiscountCodes(final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes){
      this.discountCodes = discountCodes;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setTaxCalculationMode(final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.models.store.StoreKeyReference store){
      this.store = store;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setTaxMode(final com.commercetools.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setShippingAddress(final com.commercetools.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentInfo(final com.commercetools.models.order.PaymentInfo paymentInfo){
      this.paymentInfo = paymentInfo;
   }

}