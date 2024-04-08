
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Can only be used in a CartDiscountDraft with no <code>target</code> specified. Hence, this type can not be used in the Change Value update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueGiftLineItemDraft cartDiscountValueGiftLineItemDraft = CartDiscountValueGiftLineItemDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueGiftLineItemDraftImpl.class)
public interface CartDiscountValueGiftLineItemDraft
        extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueGiftLineItemDraft> {

    /**
     * discriminator value for CartDiscountValueGiftLineItemDraft
     */
    String GIFT_LINE_ITEM = "giftLineItem";

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>ProductVariant of the Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     *  <p>ProductVariant of the Product.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     * factory method
     * @return instance of CartDiscountValueGiftLineItemDraft
     */
    public static CartDiscountValueGiftLineItemDraft of() {
        return new CartDiscountValueGiftLineItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueGiftLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueGiftLineItemDraft of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftImpl instance = new CartDiscountValueGiftLineItemDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueGiftLineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueGiftLineItemDraft deepCopy(
            @Nullable final CartDiscountValueGiftLineItemDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueGiftLineItemDraftImpl instance = new CartDiscountValueGiftLineItemDraftImpl();
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueGiftLineItemDraft
     * @return builder
     */
    public static CartDiscountValueGiftLineItemDraftBuilder builder() {
        return CartDiscountValueGiftLineItemDraftBuilder.of();
    }

    /**
     * create builder for CartDiscountValueGiftLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemDraftBuilder builder(final CartDiscountValueGiftLineItemDraft template) {
        return CartDiscountValueGiftLineItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueGiftLineItemDraft(Function<CartDiscountValueGiftLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueGiftLineItemDraft>";
            }
        };
    }
}
