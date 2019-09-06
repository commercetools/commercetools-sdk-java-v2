package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CustomLineItemDraft;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItemDraft;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingRateInputDraft;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Common.Address;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.Store.StoreResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDraftImpl implements CartDraft {

   private java.lang.String country;
   
   private java.lang.String anonymousId;
   
   private com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.Cart.CartOrigin origin;
   
   private java.lang.Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.models.Store.StoreResourceIdentifier store;
   
   private java.lang.String locale;
   
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;
   
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   private java.util.List<com.commercetools.models.Cart.LineItemDraft> lineItems;
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   private java.lang.String customerEmail;
   
   private java.lang.String customerId;
   
   private com.commercetools.models.Common.Address shippingAddress;
   
   private java.lang.String currency;
   
   private com.commercetools.models.Common.Address billingAddress;

   @JsonCreator
   CartDraftImpl(@JsonProperty("country") final java.lang.String country, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("shippingRateInput") final com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("origin") final com.commercetools.models.Cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("taxCalculationMode") final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.models.Store.StoreResourceIdentifier store, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRateForShippingMethod, @JsonProperty("inventoryMode") final com.commercetools.models.Cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.Cart.LineItemDraft> lineItems, @JsonProperty("taxRoundingMode") final com.commercetools.models.Cart.RoundingMode taxRoundingMode, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.models.Cart.TaxMode taxMode, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("shippingAddress") final com.commercetools.models.Common.Address shippingAddress, @JsonProperty("currency") final java.lang.String currency, @JsonProperty("billingAddress") final com.commercetools.models.Common.Address billingAddress) {
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
   
   
   public com.commercetools.models.Cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.models.Store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }
   
   
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setShippingRateInput(final com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setOrigin(final com.commercetools.models.Cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setDeleteDaysAfterLastModification(final java.lang.Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingMethod(final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setTaxCalculationMode(final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.models.Store.StoreResourceIdentifier store){
      this.store = store;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setExternalTaxRateForShippingMethod(final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRateForShippingMethod){
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
   }
   
   public void setInventoryMode(final com.commercetools.models.Cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.Cart.LineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.Cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setTaxMode(final com.commercetools.models.Cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setShippingAddress(final com.commercetools.models.Common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setCurrency(final java.lang.String currency){
      this.currency = currency;
   }
   
   public void setBillingAddress(final com.commercetools.models.Common.Address billingAddress){
      this.billingAddress = billingAddress;
   }

}