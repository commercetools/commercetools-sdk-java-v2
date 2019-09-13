package com.commercetools.models.cart;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CustomLineItemDraft;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.LineItemDraft;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.ShippingRateInputDraft;
import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.common.Address;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.store.StoreResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Long;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDraftImpl implements CartDraft {

   private java.lang.String country;
   
   private java.lang.String anonymousId;
   
   private com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput;
   
   private com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.cart.CartOrigin origin;
   
   private java.lang.Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.models.store.StoreResourceIdentifier store;
   
   private java.lang.String locale;
   
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;
   
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   private java.util.List<com.commercetools.models.cart.LineItemDraft> lineItems;
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   private java.lang.String customerEmail;
   
   private java.lang.String customerId;
   
   private com.commercetools.models.common.Address shippingAddress;
   
   private java.lang.String currency;
   
   private com.commercetools.models.common.Address billingAddress;

   @JsonCreator
   CartDraftImpl(@JsonProperty("country") final java.lang.String country, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("shippingRateInput") final com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("origin") final com.commercetools.models.cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("taxCalculationMode") final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.models.store.StoreResourceIdentifier store, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod, @JsonProperty("inventoryMode") final com.commercetools.models.cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.cart.LineItemDraft> lineItems, @JsonProperty("taxRoundingMode") final com.commercetools.models.cart.RoundingMode taxRoundingMode, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.models.cart.TaxMode taxMode, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("shippingAddress") final com.commercetools.models.common.Address shippingAddress, @JsonProperty("currency") final java.lang.String currency, @JsonProperty("billingAddress") final com.commercetools.models.common.Address billingAddress) {
      this.country = country;
      this.anonymousId = anonymousId;
      this.shippingRateInput = shippingRateInput;
      this.customerGroup = customerGroup;
      this.origin = origin;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.shippingMethod = shippingMethod;
      this.taxCalculationMode = taxCalculationMode;
      this.store = store;
      this.locale = locale;
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
      this.inventoryMode = inventoryMode;
      this.lineItems = lineItems;
      this.taxRoundingMode = taxRoundingMode;
      this.customLineItems = customLineItems;
      this.itemShippingAddresses = itemShippingAddresses;
      this.taxMode = taxMode;
      this.customerEmail = customerEmail;
      this.customerId = customerId;
      this.shippingAddress = shippingAddress;
      this.currency = currency;
      this.billingAddress = billingAddress;
   }
   public CartDraftImpl() {
      
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }
   
   
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setShippingRateInput(final com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setOrigin(final com.commercetools.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setDeleteDaysAfterLastModification(final java.lang.Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingMethod(final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setTaxCalculationMode(final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.models.store.StoreResourceIdentifier store){
      this.store = store;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setExternalTaxRateForShippingMethod(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod){
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
   }
   
   public void setInventoryMode(final com.commercetools.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.cart.LineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setTaxMode(final com.commercetools.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setShippingAddress(final com.commercetools.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setCurrency(final java.lang.String currency){
      this.currency = currency;
   }
   
   public void setBillingAddress(final com.commercetools.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }

}