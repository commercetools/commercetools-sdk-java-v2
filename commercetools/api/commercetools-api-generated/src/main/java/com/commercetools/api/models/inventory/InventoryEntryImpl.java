package com.commercetools.api.models.inventory;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryImpl implements InventoryEntry {

   private String id;
   
   private Long version;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   private String sku;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long quantityOnStock;
   
   private Long availableQuantity;
   
   private Long restockableInDays;
   
   private java.time.ZonedDateTime expectedDelivery;
   
   private com.commercetools.api.models.type.CustomFields custom;

   @JsonCreator
   InventoryEntryImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("sku") final String sku, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("quantityOnStock") final Long quantityOnStock, @JsonProperty("availableQuantity") final Long availableQuantity, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
      this.id = id;
      this.version = version;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.lastModifiedBy = lastModifiedBy;
      this.createdBy = createdBy;
      this.sku = sku;
      this.supplyChannel = supplyChannel;
      this.quantityOnStock = quantityOnStock;
      this.availableQuantity = availableQuantity;
      this.restockableInDays = restockableInDays;
      this.expectedDelivery = expectedDelivery;
      this.custom = custom;
   }
   public InventoryEntryImpl() {
      
   }
   
   /**
   *  <p>The unique ID of the inventory entry.</p>
   */
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   /**
   *  <p>Optional connection to a particular supplier.</p>
   */
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   /**
   *  <p>Overall amount of stock.
   *  (available + reserved)</p>
   */
   public Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   /**
   *  <p>Available amount of stock.
   *  (available means: <code>quantityOnStock</code> - reserved quantity)</p>
   */
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   /**
   *  <p>The time period in days, that tells how often this inventory entry is restocked.</p>
   */
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   /**
   *  <p>The date and time of the next restock.</p>
   */
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setQuantityOnStock(final Long quantityOnStock){
      this.quantityOnStock = quantityOnStock;
   }
   
   public void setAvailableQuantity(final Long availableQuantity){
      this.availableQuantity = availableQuantity;
   }
   
   public void setRestockableInDays(final Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }

}
