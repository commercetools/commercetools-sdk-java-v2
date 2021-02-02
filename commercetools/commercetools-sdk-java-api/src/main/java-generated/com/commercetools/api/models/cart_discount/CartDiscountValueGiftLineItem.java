
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueGiftLineItemImpl.class)
public interface CartDiscountValueGiftLineItem extends CartDiscountValue {

    String GIFT_LINE_ITEM = "giftLineItem";

    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
    *  <p>The channel must have the role <code>InventorySupply</code></p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
    *  <p>The channel must have the role <code>ProductDistribution</code></p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setProduct(final ProductReference product);

    public void setVariantId(final Long variantId);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static CartDiscountValueGiftLineItem of() {
        return new CartDiscountValueGiftLineItemImpl();
    }

    public static CartDiscountValueGiftLineItem of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartDiscountValueGiftLineItemBuilder builder() {
        return CartDiscountValueGiftLineItemBuilder.of();
    }

    public static CartDiscountValueGiftLineItemBuilder builder(final CartDiscountValueGiftLineItem template) {
        return CartDiscountValueGiftLineItemBuilder.of(template);
    }

    default <T> T withCartDiscountValueGiftLineItem(Function<CartDiscountValueGiftLineItem, T> helper) {
        return helper.apply(this);
    }
}
