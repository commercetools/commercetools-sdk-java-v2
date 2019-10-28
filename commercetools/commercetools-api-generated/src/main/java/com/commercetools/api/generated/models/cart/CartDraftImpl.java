package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.LineItemDraft;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String country;
   
   private String anonymousId;
   
   private com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   private Long deleteDaysAfterLastModification;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   private com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.api.generated.models.store.StoreResourceIdentifier store;
   
   private String locale;
   
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;
   
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   private java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> lineItems;
   
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   private String customerEmail;
   
   private String customerId;
   
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   private String currency;
   
   private com.commercetools.api.generated.models.common.Address billingAddress;

   @JsonCreator
   CartDraftImpl(@JsonProperty("country") final String country, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("shippingRateInput") final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("origin") final com.commercetools.api.generated.models.cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("taxCalculationMode") final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.api.generated.models.store.StoreResourceIdentifier store, @JsonProperty("locale") final String locale, @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod, @JsonProperty("inventoryMode") final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> lineItems, @JsonProperty("taxRoundingMode") final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.api.generated.models.cart.TaxMode taxMode, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("customerId") final String customerId, @JsonProperty("shippingAddress") final com.commercetools.api.generated.models.common.Address shippingAddress, @JsonProperty("currency") final String currency, @JsonProperty("billingAddress") final com.commercetools.api.generated.models.common.Address billingAddress) {
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
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.api.generated.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.api.generated.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }
   
   
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public String getCurrency(){
      return this.currency;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setShippingRateInput(final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setOrigin(final com.commercetools.api.generated.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingMethod(final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setTaxCalculationMode(final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.api.generated.models.store.StoreResourceIdentifier store){
      this.store = store;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setExternalTaxRateForShippingMethod(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod){
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
   }
   
   public void setInventoryMode(final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setTaxRoundingMode(final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setTaxMode(final com.commercetools.api.generated.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }
   
   public void setShippingAddress(final com.commercetools.api.generated.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setCurrency(final String currency){
      this.currency = currency;
   }
   
   public void setBillingAddress(final com.commercetools.api.generated.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }

}