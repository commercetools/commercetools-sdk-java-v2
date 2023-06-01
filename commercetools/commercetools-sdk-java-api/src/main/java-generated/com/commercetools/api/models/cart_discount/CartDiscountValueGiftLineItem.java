package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * CartDiscountValueGiftLineItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueGiftLineItem cartDiscountValueGiftLineItem = CartDiscountValueGiftLineItem.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueGiftLineItemImpl.class)
public interface CartDiscountValueGiftLineItem extends CartDiscountValue {

    /**
     * discriminator value for CartDiscountValueGiftLineItem
     */
    String GIFT_LINE_ITEM = "giftLineItem";

    /**
     *  <p>Reference to a Product.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();
    /**
     *  <p>ProductVariant of the Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    /**
     *  <p>Reference to a Product.</p>
     * @param product value to be set
     */
    
    public void setProduct(final ProductReference product);
    
    
    /**
     *  <p>ProductVariant of the Product.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @param supplyChannel value to be set
     */
    
    public void setSupplyChannel(final ChannelReference supplyChannel);
    
    
    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @param distributionChannel value to be set
     */
    
    public void setDistributionChannel(final ChannelReference distributionChannel);
    

    /**
     * factory method
     * @return instance of CartDiscountValueGiftLineItem
     */
    public static CartDiscountValueGiftLineItem of(){
        return new CartDiscountValueGiftLineItemImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountValueGiftLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueGiftLineItem of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueGiftLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueGiftLineItem deepCopy(@Nullable final CartDiscountValueGiftLineItem template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        instance.setDistributionChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getDistributionChannel()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueGiftLineItem
     * @return builder
     */
    public static CartDiscountValueGiftLineItemBuilder builder() {
        return CartDiscountValueGiftLineItemBuilder.of();
    }
    
    /**
     * create builder for CartDiscountValueGiftLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemBuilder builder(final CartDiscountValueGiftLineItem template) {
        return CartDiscountValueGiftLineItemBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueGiftLineItem(Function<CartDiscountValueGiftLineItem, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueGiftLineItem>";
            }
        };
    }
}
