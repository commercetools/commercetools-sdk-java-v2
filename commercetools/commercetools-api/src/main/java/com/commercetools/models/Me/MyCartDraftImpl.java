package com.commercetools.models.me;

import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyLineItemDraft;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
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
public final class MyCartDraftImpl implements MyCartDraft {

   private java.util.List<com.commercetools.models.me.MyLineItemDraft> lineItems;
   
   private java.lang.String country;
   
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   private java.lang.Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   private java.lang.String customerEmail;
   
   private com.commercetools.models.common.Address shippingAddress;
   
   private java.lang.String currency;
   
   private com.commercetools.models.common.Address billingAddress;
   
   private java.lang.String locale;
   
   private com.commercetools.models.cart.InventoryMode inventoryMode;

   @JsonCreator
   MyCartDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.models.me.MyLineItemDraft> lineItems, @JsonProperty("country") final java.lang.String country, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.models.cart.TaxMode taxMode, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("shippingAddress") final com.commercetools.models.common.Address shippingAddress, @JsonProperty("currency") final java.lang.String currency, @JsonProperty("billingAddress") final com.commercetools.models.common.Address billingAddress, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("inventoryMode") final com.commercetools.models.cart.InventoryMode inventoryMode) {
      this.lineItems = lineItems;
      this.country = country;
      this.itemShippingAddresses = itemShippingAddresses;
      this.taxMode = taxMode;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.shippingMethod = shippingMethod;
      this.customerEmail = customerEmail;
      this.shippingAddress = shippingAddress;
      this.currency = currency;
      this.billingAddress = billingAddress;
      this.locale = locale;
      this.inventoryMode = inventoryMode;
   }
   public MyCartDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.me.MyLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
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
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
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
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }

   public void setLineItems(final java.util.List<com.commercetools.models.me.MyLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setTaxMode(final com.commercetools.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
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
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
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
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setInventoryMode(final com.commercetools.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }

}