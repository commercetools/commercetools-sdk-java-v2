package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddLineItemActionImpl;

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
@JsonDeserialize(as = StagedOrderAddLineItemActionImpl.class)
public interface StagedOrderAddLineItemAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();
   
   
   @JsonProperty("productId")
   public String getProductId();
   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setCustom(final CustomFieldsDraft custom);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public void setProductId(final String productId);
   
   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setQuantity(final Integer quantity);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static StagedOrderAddLineItemActionImpl of(){
      return new StagedOrderAddLineItemActionImpl();
   }
   

   public static StagedOrderAddLineItemActionImpl of(final StagedOrderAddLineItemAction template) {
      StagedOrderAddLineItemActionImpl instance = new StagedOrderAddLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setProductId(template.getProductId());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setCustom(template.getCustom());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setDistributionChannel(template.getDistributionChannel());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}