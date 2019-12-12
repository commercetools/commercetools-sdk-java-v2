package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class LineItemDraftImpl implements LineItemDraft {

   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private Long quantity;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private String productId;
   
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long variantId;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel;
   
   private String sku;
   
   private com.commercetools.api.generated.models.common.Money externalPrice;

   @JsonCreator
   LineItemDraftImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final Long quantity, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final String productId, @JsonProperty("externalTotalPrice") final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final Long variantId, @JsonProperty("distributionChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("sku") final String sku, @JsonProperty("externalPrice") final com.commercetools.api.generated.models.common.Money externalPrice) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.externalTotalPrice = externalTotalPrice;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.distributionChannel = distributionChannel;
      this.sku = sku;
      this.externalPrice = externalPrice;
   }
   public LineItemDraftImpl() {
      
   }
   
   /**
   *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
   */
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   /**
   *  <p>The amount of a <code>LineItem</code>in the cart.
   *  Must be a positive integer.</p>
   */
   public Long getQuantity(){
      return this.quantity;
   }
   
   /**
   *  <p>Container for line item specific address(es).</p>
   */
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   /**
   *  <p>Sets the line item <code>price</code> and <code>totalPrice</code> to the given values and sets the line item <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
   */
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>By providing supply channel information, you can unique identify
   *  inventory entries that should be reserved.
   *  The provided channel should have
   *  the InventorySupply role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   /**
   *  <p>The channel is used to select a ProductPrice.
   *  The provided channel should have the ProductDistribution role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   /**
   *  <p>Sets the line item <code>price</code> to the given value and sets the line item <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
   */
   public com.commercetools.api.generated.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setExternalTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setExternalTotalPrice(final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setSupplyChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setDistributionChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setExternalPrice(final com.commercetools.api.generated.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}