
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Can only be used in a CartDiscountDraft with no <code>target</code> specified. Hence, this type can not be used in the Change Value update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueGiftLineItemDraftImpl implements CartDiscountValueGiftLineItemDraft, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private Long variantId;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueGiftLineItemDraftImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type = GIFT_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueGiftLineItemDraftImpl() {
        this.type = GIFT_LINE_ITEM;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>ProductVariant of the Product.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueGiftLineItemDraftImpl that = (CartDiscountValueGiftLineItemDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(type, that.type)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(product)
                .append(variantId)
                .append(supplyChannel)
                .append(distributionChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .append("variantId", variantId)
                .append("supplyChannel", supplyChannel)
                .append("distributionChannel", distributionChannel)
                .build();
    }

    @Override
    public CartDiscountValueGiftLineItemDraft copyDeep() {
        return CartDiscountValueGiftLineItemDraft.deepCopy(this);
    }
}
