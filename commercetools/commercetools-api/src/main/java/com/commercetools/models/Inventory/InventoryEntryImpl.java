package com.commercetools.models.inventory;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class InventoryEntryImpl implements InventoryEntry {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private java.lang.Long availableQuantity;
   
   private java.time.ZonedDateTime expectedDelivery;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private java.lang.Long quantityOnStock;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private java.lang.Long restockableInDays;
   
   private java.lang.String sku;

   @JsonCreator
   InventoryEntryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("availableQuantity") final java.lang.Long availableQuantity, @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("quantityOnStock") final java.lang.Long quantityOnStock, @JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("restockableInDays") final java.lang.Long restockableInDays, @JsonProperty("sku") final java.lang.String sku) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.availableQuantity = availableQuantity;
      this.expectedDelivery = expectedDelivery;
      this.custom = custom;
      this.quantityOnStock = quantityOnStock;
      this.supplyChannel = supplyChannel;
      this.restockableInDays = restockableInDays;
      this.sku = sku;
   }
   public InventoryEntryImpl() {
      
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
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
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
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setAvailableQuantity(final java.lang.Long availableQuantity){
      this.availableQuantity = availableQuantity;
   }
   
   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setQuantityOnStock(final java.lang.Long quantityOnStock){
      this.quantityOnStock = quantityOnStock;
   }
   
   public void setSupplyChannel(final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setRestockableInDays(final java.lang.Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}