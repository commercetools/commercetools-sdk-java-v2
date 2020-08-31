package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyLineItemDraftImpl;

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
    public Double getQuantity();
    /**
    *  <p>When the line item was added to the cart. Optional for backwards
    *  compatibility reasons only.</p>
    */
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    /**
    *  <p>By providing supply channel information, you can unique identify
    *  inventory entries that should be reserved.
    *  The provided channel should have the InventorySupply role.</p>
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
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    /**
    *  <p>Container for line item specific address(es).</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();
    
    
    @JsonProperty("sku")
    public String getSku();

    public void setProductId(final String productId);
    
    public void setVariantId(final Long variantId);
    
    public void setQuantity(final Double quantity);
    
    public void setAddedAt(final ZonedDateTime addedAt);
    
    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
    
    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
    
    public void setSku(final String sku);

    public static MyLineItemDraftImpl of(){
        return new MyLineItemDraftImpl();
    }
    

    public static MyLineItemDraftImpl of(final MyLineItemDraft template) {
        MyLineItemDraftImpl instance = new MyLineItemDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setCustom(template.getCustom());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setSku(template.getSku());
        return instance;
    }

}
