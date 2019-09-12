package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Product.ProductReference;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountValueGiftLineItemImpl;

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
@JsonDeserialize(as = CartDiscountValueGiftLineItemImpl.class)
public interface CartDiscountValueGiftLineItem extends CartDiscountValue {

   
   @NotNull
   @Valid
   @JsonProperty("product")
   public ProductReference getProduct();
   
   @NotNull
   @JsonProperty("variantId")
   public Long getVariantId();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelReference getSupplyChannel();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelReference getDistributionChannel();

   public void setProduct(final ProductReference product);
   
   public void setVariantId(final Long variantId);
   
   public void setSupplyChannel(final ChannelReference supplyChannel);
   
   public void setDistributionChannel(final ChannelReference distributionChannel);
   
   public static CartDiscountValueGiftLineItemImpl of(){
      return new CartDiscountValueGiftLineItemImpl();
   }
   

   public static CartDiscountValueGiftLineItemImpl of(final CartDiscountValueGiftLineItem template) {
      CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
      instance.setProduct(template.getProduct());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setVariantId(template.getVariantId());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}