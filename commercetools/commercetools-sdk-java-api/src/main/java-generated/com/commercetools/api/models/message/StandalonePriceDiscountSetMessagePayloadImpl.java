
package com.commercetools.api.models.message;

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
 *  <p>Generated after a Product Discount is successfully applied to a StandalonePrice.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDiscountSetMessagePayloadImpl
        implements StandalonePriceDiscountSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceDiscountSetMessagePayloadImpl(
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        this.type = STANDALONE_PRICE_DISCOUNT_SET;
    }

    /**
     * create empty instance
     */
    public StandalonePriceDiscountSetMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_DISCOUNT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceDiscountSetMessagePayloadImpl that = (StandalonePriceDiscountSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(discounted, that.discounted)
                .append(type, that.type)
                .append(discounted, that.discounted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(discounted).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("discounted", discounted)
                .build();
    }

    @Override
    public StandalonePriceDiscountSetMessagePayload copyDeep() {
        return StandalonePriceDiscountSetMessagePayload.deepCopy(this);
    }
}
