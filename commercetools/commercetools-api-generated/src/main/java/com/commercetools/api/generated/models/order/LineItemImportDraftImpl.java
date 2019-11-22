package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.order.ProductVariantImportDraft;
import com.commercetools.api.generated.models.tax_category.TaxRate;
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
public final class LineItemImportDraftImpl implements LineItemImportDraft {

   private com.commercetools.api.generated.models.tax_category.TaxRate taxRate;
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private String productId;
   
   private com.commercetools.api.generated.models.common.PriceDraft price;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.order.ProductVariantImportDraft variant;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   LineItemImportDraftImpl(@JsonProperty("taxRate") final com.commercetools.api.generated.models.tax_category.TaxRate taxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final String productId, @JsonProperty("price") final com.commercetools.api.generated.models.common.PriceDraft price, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("variant") final com.commercetools.api.generated.models.order.ProductVariantImportDraft variant, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("supplyChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("state") final java.util.List<com.commercetools.api.generated.models.order.ItemState> state, @JsonProperty("distributionChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.taxRate = taxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.price = price;
      this.custom = custom;
      this.variant = variant;
      this.name = name;
      this.supplyChannel = supplyChannel;
      this.state = state;
      this.distributionChannel = distributionChannel;
   }
   public LineItemImportDraftImpl() {
      
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   /**
   	
   */
   public Integer getQuantity(){
      return this.quantity;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   /**
   	<p>ID of the existing product.
   	You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
   */
   public String getProductId(){
      return this.productId;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   /**
   	<p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }
   
   /**
   	<p>The product name.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   	<p>Optional connection to a particular supplier.
   	By providing supply channel information, you can uniquely identify
   	inventory entries that should be reserved.
   	The provided channel should have the
   	InventorySupply role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }
   
   /**
   	<p>The channel is used to select a ProductPrice.
   	The provided channel should have the ProductDistribution role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setTaxRate(final com.commercetools.api.generated.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setPrice(final com.commercetools.api.generated.models.common.PriceDraft price){
      this.price = price;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setVariant(final com.commercetools.api.generated.models.order.ProductVariantImportDraft variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSupplyChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setState(final java.util.List<com.commercetools.api.generated.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setDistributionChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}