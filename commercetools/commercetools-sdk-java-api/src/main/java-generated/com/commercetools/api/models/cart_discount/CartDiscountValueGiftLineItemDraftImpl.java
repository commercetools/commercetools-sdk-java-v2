package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueGiftLineItemDraftImpl implements CartDiscountValueGiftLineItemDraft {

    private String type;
    
    private com.commercetools.api.models.product.ProductResourceIdentifier product;
    
    private Long variantId;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    CartDiscountValueGiftLineItemDraftImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product, @JsonProperty("variantId") final Long variantId, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type = "giftLineItem";
    }
    public CartDiscountValueGiftLineItemDraftImpl() {
        this.type = "giftLineItem";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct(){
        return this.product;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
    *  <p>The channel must have the role <code>InventorySupply</code></p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
    *  <p>The channel must have the role <code>ProductDistribution</code></p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product){
        this.product = product;
    }
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }

}
