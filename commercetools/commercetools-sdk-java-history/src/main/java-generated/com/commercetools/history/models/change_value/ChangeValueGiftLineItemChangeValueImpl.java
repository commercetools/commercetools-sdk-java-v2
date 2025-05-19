
package com.commercetools.history.models.change_value;

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
 * ChangeValueGiftLineItemChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueGiftLineItemChangeValueImpl implements ChangeValueGiftLineItemChangeValue, ModelBase {

    private String type;

    private com.commercetools.history.models.common.Reference product;

    private Integer variantId;

    private com.commercetools.history.models.common.Reference supplyChannel;

    private com.commercetools.history.models.common.Reference distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueGiftLineItemChangeValueImpl(
            @JsonProperty("product") final com.commercetools.history.models.common.Reference product,
            @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("supplyChannel") final com.commercetools.history.models.common.Reference supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.history.models.common.Reference distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type = GIFT_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public ChangeValueGiftLineItemChangeValueImpl() {
        this.type = GIFT_LINE_ITEM;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to a Product.</p>
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the ProductVariant.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Channel with ChannelRoleEnum <code>InventorySupply</code>.</p>
     */

    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Channel with ChannelRoleEnum <code>ProductDistribution</code>.</p>
     */

    public com.commercetools.history.models.common.Reference getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setProduct(final com.commercetools.history.models.common.Reference product) {
        this.product = product;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setSupplyChannel(final com.commercetools.history.models.common.Reference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(final com.commercetools.history.models.common.Reference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeValueGiftLineItemChangeValueImpl that = (ChangeValueGiftLineItemChangeValueImpl) o;

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
    public ChangeValueGiftLineItemChangeValue copyDeep() {
        return ChangeValueGiftLineItemChangeValue.deepCopy(this);
    }
}
