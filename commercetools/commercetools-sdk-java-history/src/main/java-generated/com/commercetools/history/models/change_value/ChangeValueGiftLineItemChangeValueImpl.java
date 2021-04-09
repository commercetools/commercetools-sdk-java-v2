
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the value for cart discounts gift line item value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueGiftLineItemChangeValueImpl implements ChangeValueGiftLineItemChangeValue {

    private String type;

    private com.commercetools.history.models.common.Reference product;

    private Integer variantId;

    private com.commercetools.history.models.common.Reference supplyChannel;

    private com.commercetools.history.models.common.Reference distributionChannel;

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

    public ChangeValueGiftLineItemChangeValueImpl() {
        this.type = GIFT_LINE_ITEM;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

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

}
