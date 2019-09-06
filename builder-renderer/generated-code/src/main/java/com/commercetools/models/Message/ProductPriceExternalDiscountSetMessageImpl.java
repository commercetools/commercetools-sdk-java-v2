package com.commercetools.models.Message;

import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Message.Message;
import java.lang.Boolean;
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
public final class ProductPriceExternalDiscountSetMessageImpl implements ProductPriceExternalDiscountSetMessage {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.Long sequenceNumber;
   
   private com.commercetools.models.Common.Reference resource;
   
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;
   
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   private java.lang.Boolean staged;
   
   private java.lang.Integer variantId;
   
   private java.lang.String priceId;
   
   private java.lang.String sku;
   
   private java.lang.String variantKey;

   @JsonCreator
   ProductPriceExternalDiscountSetMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.Common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type, @JsonProperty("discounted") final com.commercetools.models.Common.DiscountedPrice discounted, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Integer variantId, @JsonProperty("priceId") final java.lang.String priceId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("variantKey") final java.lang.String variantKey) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = type;
      this.discounted = discounted;
      this.staged = staged;
      this.variantId = variantId;
      this.priceId = priceId;
      this.sku = sku;
      this.variantKey = variantKey;
   }
   public ProductPriceExternalDiscountSetMessageImpl() {
      
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
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getVariantKey(){
      return this.variantKey;
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
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.Common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }
   
   public void setDiscounted(final com.commercetools.models.Common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Integer variantId){
      this.variantId = variantId;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setVariantKey(final java.lang.String variantKey){
      this.variantKey = variantKey;
   }

}