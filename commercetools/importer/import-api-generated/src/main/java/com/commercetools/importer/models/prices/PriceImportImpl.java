package com.commercetools.importer.models.prices;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.DiscountedPrice;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import java.time.ZonedDateTime;
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


/**
*  <p>Imports a product variant's prices.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceImportImpl implements PriceImport {

   private String key;
   
   private com.commercetools.importer.models.common.Money value;
   
   private String country;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
   
   private com.commercetools.importer.models.common.ChannelKeyReference channel;
   
   private com.commercetools.importer.models.common.DiscountedPrice discounted;
   
   private com.commercetools.importer.models.common.ProductVariantKeyReference productVariant;
   
   private com.commercetools.importer.models.common.ProductKeyReference product;

   @JsonCreator
   PriceImportImpl(@JsonProperty("key") final String key, @JsonProperty("value") final com.commercetools.importer.models.common.Money value, @JsonProperty("country") final String country, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("customerGroup") final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("channel") final com.commercetools.importer.models.common.ChannelKeyReference channel, @JsonProperty("discounted") final com.commercetools.importer.models.common.DiscountedPrice discounted, @JsonProperty("productVariant") final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant, @JsonProperty("product") final com.commercetools.importer.models.common.ProductKeyReference product) {
      this.key = key;
      this.value = value;
      this.country = country;
      this.validFrom = validFrom;
      this.validUntil = validUntil;
      this.customerGroup = customerGroup;
      this.channel = channel;
      this.discounted = discounted;
      this.productVariant = productVariant;
      this.product = product;
   }
   public PriceImportImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Maps to <code>Price.value</code>.</p>
   *  <p>The Import API <strong>only</strong> supports <code>centPrecision</code> prices.</p>
   */
   public com.commercetools.importer.models.common.Money getValue(){
      return this.value;
   }
   
   /**
   *  <p>Maps to <code>Price.county</code>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   /**
   *  <p>Maps to <code>Price.validFrom</code>.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>Maps to <code>Price.validUntil</code>.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   /**
   *  <p>References a customer group by its key.</p>
   *  <p>The customer group referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.CustomerGroupKeyReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   /**
   *  <p>References a channel by its key.</p>
   *  <p>The channel referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ChannelKeyReference getChannel(){
      return this.channel;
   }
   
   /**
   *  <p>Sets a discounted price from an external service.</p>
   */
   public com.commercetools.importer.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   *  <p>The product variant in which this price is contained.</p>
   *  <p>The product variant referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ProductVariantKeyReference getProductVariant(){
      return this.productVariant;
   }
   
   /**
   *  <p>The product in which this product variant containong the price is contained. Maps to <code>ProductVariant.product</code>.</p>
   *  <p>The product referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
      return this.product;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setValue(final com.commercetools.importer.models.common.Money value){
      this.value = value;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setCustomerGroup(final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setChannel(final com.commercetools.importer.models.common.ChannelKeyReference channel){
      this.channel = channel;
   }
   
   public void setDiscounted(final com.commercetools.importer.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setProductVariant(final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant){
      this.productVariant = productVariant;
   }
   
   public void setProduct(final com.commercetools.importer.models.common.ProductKeyReference product){
      this.product = product;
   }

}