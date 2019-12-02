package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.cart.LineItemDraftImpl;

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
@JsonDeserialize(as = LineItemDraftImpl.class)
public interface LineItemDraft  {

   
   
   @JsonProperty("productId")
   public String getProductId();
   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   /**
   *  <p>The amount of a <code>LineItem</code>in the cart.
   *  Must be a positive integer.</p>
   */
   
   @JsonProperty("quantity")
   public Long getQuantity();
   /**
   *  <p>By providing supply channel information, you can unique identify
   *  inventory entries that should be reserved.
   *  The provided channel should have
   *  the InventorySupply role.</p>
   */
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   /**
   *  <p>The channel is used to select a ProductPrice.
   *  The provided channel should have the ProductDistribution role.</p>
   */
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();
   /**
   *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
   */
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   /**
   *  <p>Sets the line item <code>price</code> to the given value and sets the line item <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
   */
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   /**
   *  <p>Sets the line item <code>price</code> and <code>totalPrice</code> to the given values and sets the line item <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
   */
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();
   /**
   *  <p>Container for line item specific address(es).</p>
   */
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setProductId(final String productId);
   
   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setQuantity(final Long quantity);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static LineItemDraftImpl of(){
      return new LineItemDraftImpl();
   }
   

   public static LineItemDraftImpl of(final LineItemDraft template) {
      LineItemDraftImpl instance = new LineItemDraftImpl();
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setQuantity(template.getQuantity());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setProductId(template.getProductId());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setCustom(template.getCustom());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setVariantId(template.getVariantId());
      instance.setDistributionChannel(template.getDistributionChannel());
      instance.setSku(template.getSku());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}