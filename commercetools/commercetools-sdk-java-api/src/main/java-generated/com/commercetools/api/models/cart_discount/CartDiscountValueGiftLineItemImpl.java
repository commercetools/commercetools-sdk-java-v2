package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartDiscountValueGiftLineItem
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountValueGiftLineItemImpl implements CartDiscountValueGiftLineItem, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private Long variantId;
    
    
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;
    
    
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueGiftLineItemImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductReference product, @JsonProperty("variantId") final Long variantId, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type =  GIFT_LINE_ITEM;
    }
    /**
     * create empty instance
     */
    public CartDiscountValueGiftLineItemImpl() {
        this.type =  GIFT_LINE_ITEM;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Reference to a Product.</p>
     */
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>ProductVariant of the Product.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel(){
        return this.distributionChannel;
    }

    
    public void setProduct(final com.commercetools.api.models.product.ProductReference product){
        this.product = product;
    }
    
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelReference distributionChannel){
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountValueGiftLineItemImpl that = (CartDiscountValueGiftLineItemImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(product)
            .append(variantId)
            .append(supplyChannel)
            .append(distributionChannel)
            .toHashCode();
    }

}
