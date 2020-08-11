package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CustomLineItemDraft;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItemDraft;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
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

   private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

   private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

   private com.commercetools.api.models.cart.CartOrigin origin;

   private Long deleteDaysAfterLastModification;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

   private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

   private com.commercetools.api.models.store.StoreResourceIdentifier store;

   private String locale;

   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

   private com.commercetools.api.models.cart.InventoryMode inventoryMode;

   private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

   private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

   private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

   private com.commercetools.api.models.cart.TaxMode taxMode;

   private String customerEmail;

   private String customerId;

   private com.commercetools.api.models.common.Address shippingAddress;

   private String currency;

   private com.commercetools.api.models.common.Address billingAddress;

   @JsonCreator
   CartDraftImpl(@JsonProperty("country") final String country, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store, @JsonProperty("locale") final String locale, @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod, @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems, @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("customerId") final String customerId, @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress, @JsonProperty("currency") final String currency, @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress) {
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

   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }

   /**
   *  <p>Assigns the new cart to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }

   /**
   *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.
   *  Based on the definition of ShippingRateInputType.
   *  If CartClassification is defined, it must be ClassificationShippingRateInput.
   *  If CartScore is defined, it must be ScoreShippingRateInput.
   *  Otherwise it can not bet set.</p>
   */
   public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }

   /**
   *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group.
   *  Can be set explicitly when no <code>customerId</code> is present.</p>
   */
   public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   /**
   *  <p>The default origin is <code>Customer</code>.</p>
   */
   public com.commercetools.api.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }

   /**
   *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
   *  If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
   */
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   /**
   *  <p>The default tax calculation mode is <code>LineItemLevel</code>.</p>
   */
   public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   /**
   *  <p>Assigns the new cart to the store.
   *  The store assignment can not be modified.</p>
   */
   public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }

   /**
   *  <p>Must be one of the languages supported for this project</p>
   */
   public String getLocale(){
      return this.locale;
   }

   /**
   *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
   */
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }

   /**
   *  <p>Default inventory mode is <code>None</code>.</p>
   */
   public com.commercetools.api.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }


   public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }

   /**
   *  <p>The default tax rounding mode is <code>HalfEven</code>.</p>
   */
   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }


   public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }

   /**
   *  <p>Contains addresses for carts with multiple shipping addresses.
   *  Each address must contain a key which is unique in this cart.
   *  Line items will use these keys to reference the addresses under their <code>shippingDetails</code>.
   *  The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate.
   *  Only the cart's <code>shippingAddress</code> is used for this.</p>
   */
   public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }

   /**
   *  <p>The default tax mode is <code>Platform</code>.</p>
   */
   public com.commercetools.api.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }


   public String getCustomerEmail(){
      return this.customerEmail;
   }

   /**
   *  <p>Id of an existing Customer.</p>
   */
   public String getCustomerId(){
      return this.customerId;
   }

   /**
   *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
   */
   public com.commercetools.api.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }

   /**
   *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public String getCurrency(){
      return this.currency;
   }


   public com.commercetools.api.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public void setCountry(final String country){
      this.country = country;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }

   public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }

   public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }

   public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin){
      this.origin = origin;
   }

   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setShippingMethod(final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }

   public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }

   public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store){
      this.store = store;
   }

   public void setLocale(final String locale){
      this.locale = locale;
   }

   public void setExternalTaxRateForShippingMethod(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod){
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
   }

   public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }

   public void setLineItems(final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems){
      this.lineItems = lineItems;
   }

   public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }

   public void setCustomLineItems(final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }

   public void setItemShippingAddresses(final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }

   public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }

   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }

   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }

   public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }

   public void setCurrency(final String currency){
      this.currency = currency;
   }

   public void setBillingAddress(final com.commercetools.api.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }

}
