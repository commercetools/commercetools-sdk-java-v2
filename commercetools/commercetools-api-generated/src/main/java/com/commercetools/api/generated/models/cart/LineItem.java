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
import javax.annotation.Generated;
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

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("productId")
   public String getProductId();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("productSlug")
   public LocalizedString getProductSlug();
   
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeReference getProductType();
   
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public Price getPrice();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();
   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public TypedMoney getTotalPrice();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();
   
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelReference getSupplyChannel();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelReference getDistributionChannel();
   
   @NotNull
   @Valid
   @JsonProperty("discountedPricePerQuantity")
   public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
   
   @NotNull
   @JsonProperty("priceMode")
   public LineItemPriceMode getPriceMode();
   
   @NotNull
   @JsonProperty("lineItemMode")
   public LineItemMode getLineItemMode();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
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