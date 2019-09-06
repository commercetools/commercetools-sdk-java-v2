package com.commercetools.models.Me;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Me.MyLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyLineItemDraftImpl.class)
public interface MyLineItemDraft  {

   
   @NotNull
   @JsonProperty("productId")
   public String getProductId();
   
   @NotNull
   @JsonProperty("variantId")
   public Long getVariantId();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setProductId(final String productId);
   
   public void setVariantId(final Long variantId);
   
   public void setQuantity(final Integer quantity);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static MyLineItemDraftImpl of(){
      return new MyLineItemDraftImpl();
   }
   

   public static MyLineItemDraftImpl of(final MyLineItemDraft template) {
      MyLineItemDraftImpl instance = new MyLineItemDraftImpl();
      instance.setQuantity(template.getQuantity());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setProductId(template.getProductId());
      instance.setCustom(template.getCustom());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setVariantId(template.getVariantId());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}