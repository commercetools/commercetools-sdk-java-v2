package com.commercetools.importer.models.prices;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
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
import com.fasterxml.jackson.databind.ObjectMapper;
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
   
   private String country;
   
   private com.commercetools.importer.models.common.ProductKeyReference product;
   
   private com.commercetools.importer.models.common.ProductVariantKeyReference productVariant;
   
   private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
   
   private com.commercetools.importer.models.common.ChannelKeyReference channel;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private com.commercetools.importer.models.common.Money value;

   @JsonCreator
   PriceImportImpl(@JsonProperty("key") final String key, @JsonProperty("country") final String country, @JsonProperty("product") final com.commercetools.importer.models.common.ProductKeyReference product, @JsonProperty("productVariant") final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant, @JsonProperty("customerGroup") final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("channel") final com.commercetools.importer.models.common.ChannelKeyReference channel, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("value") final com.commercetools.importer.models.common.Money value) {
      this.key = key;
      this.country = country;
      this.product = product;
      this.productVariant = productVariant;
      this.customerGroup = customerGroup;
      this.channel = channel;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.value = value;
   }
   public PriceImportImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Maps to <code>Price.county</code>.</p>
   */
   public String getCountry(){
      return this.country;
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
   *  <p>Maps to <code>Price.validUntil</code>.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   /**
   *  <p>Maps to <code>Price.validFrom</code>.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>Maps to <code>Price.value</code>.</p>
   *  <p>The Import API <strong>only</strong> supports <code>centPrecision</code> prices.</p>
   */
   public com.commercetools.importer.models.common.Money getValue(){
      return this.value;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setProduct(final com.commercetools.importer.models.common.ProductKeyReference product){
      this.product = product;
   }
   
   public void setProductVariant(final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant){
      this.productVariant = productVariant;
   }
   
   public void setCustomerGroup(final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setChannel(final com.commercetools.importer.models.common.ChannelKeyReference channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValue(final com.commercetools.importer.models.common.Money value){
      this.value = value;
   }

}