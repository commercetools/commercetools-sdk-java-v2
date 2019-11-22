package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.ItemShippingDetails;
import com.commercetools.api.generated.models.cart.LineItemMode;
import com.commercetools.api.generated.models.cart.LineItemPriceMode;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.Price;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.cart.LineItemImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LineItemImpl.class)
public interface LineItem  {

   /**
   	<p>The unique ID of this LineItem.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	
   */
   @NotNull
   @JsonProperty("productId")
   public String getProductId();
   /**
   	<p>The product name.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   	<p>The slug of a product is inserted on the fly.
   	It is always up-to-date and can therefore be used to link to the product detail page of the product.
   	It is empty if the product has been deleted.
   	The slug is also empty if the cart or order is retrieved via Reference Expansion or is a snapshot in a Message.</p>
   */
   @Valid
   @JsonProperty("productSlug")
   public LocalizedString getProductSlug();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeReference getProductType();
   /**
   	<p>The variant data is saved when the variant is added to the cart, and not updated automatically.
   	It can manually be updated with the Recalculate update action.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();
   /**
   	<p>The price of a line item is selected from the prices array of the product variant.
   	If the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("price")
   public Price getPrice();
   /**
   	<p>Set once the <code>taxRate</code> is set.</p>
   */
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();
   /**
   	<p>The total price of this line item.
   	If the line item is discounted, then the <code>totalPrice</code> is the DiscountedLineItemPriceForQuantity multiplied by <code>quantity</code>.
   	Otherwise the total price is the product price multiplied by the <code>quantity</code>.
   	<code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public TypedMoney getTotalPrice();
   /**
   	<p>The amount of a LineItem in the cart.
   	Must be a positive integer.</p>
   */
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();
   /**
   	<p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
   	For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
   */
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   /**
   	<p>The supply channel identifies the inventory entries that should be reserved.
   	The channel has
   	the role InventorySupply.</p>
   */
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelReference getSupplyChannel();
   /**
   	<p>The distribution channel is used to select a ProductPrice.
   	The channel has the role ProductDistribution.</p>
   */
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelReference getDistributionChannel();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("discountedPricePerQuantity")
   public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
   /**
   	
   */
   @NotNull
   @JsonProperty("priceMode")
   public LineItemPriceMode getPriceMode();
   /**
   	
   */
   @NotNull
   @JsonProperty("lineItemMode")
   public LineItemMode getLineItemMode();
   /**
   	
   */
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   	<p>Container for line item specific address(es).</p>
   */
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetails getShippingDetails();

   public void setId(final String id);
   
   public void setProductId(final String productId);
   
   public void setName(final LocalizedString name);
   
   public void setProductSlug(final LocalizedString productSlug);
   
   public void setProductType(final ProductTypeReference productType);
   
   public void setVariant(final ProductVariant variant);
   
   public void setPrice(final Price price);
   
   public void setTaxedPrice(final TaxedItemPrice taxedPrice);
   
   public void setTotalPrice(final TypedMoney totalPrice);
   
   public void setQuantity(final Long quantity);
   
   public void setState(final List<ItemState> state);
   
   public void setTaxRate(final TaxRate taxRate);
   
   public void setSupplyChannel(final ChannelReference supplyChannel);
   
   public void setDistributionChannel(final ChannelReference distributionChannel);
   
   public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);
   
   public void setPriceMode(final LineItemPriceMode priceMode);
   
   public void setLineItemMode(final LineItemMode lineItemMode);
   
   public void setCustom(final CustomFields custom);
   
   public void setShippingDetails(final ItemShippingDetails shippingDetails);
   
   public static LineItemImpl of(){
      return new LineItemImpl();
   }
   

   public static LineItemImpl of(final LineItem template) {
      LineItemImpl instance = new LineItemImpl();
      instance.setQuantity(template.getQuantity());
      instance.setPriceMode(template.getPriceMode());
      instance.setProductId(template.getProductId());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setCustom(template.getCustom());
      instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
      instance.setProductSlug(template.getProductSlug());
      instance.setTaxRate(template.getTaxRate());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setPrice(template.getPrice());
      instance.setVariant(template.getVariant());
      instance.setName(template.getName());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setState(template.getState());
      instance.setId(template.getId());
      instance.setDistributionChannel(template.getDistributionChannel());
      instance.setLineItemMode(template.getLineItemMode());
      instance.setProductType(template.getProductType());
      return instance;
   }

}