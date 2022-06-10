
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

/**
 *  <p>Emitted when the affected StandalonePrice is updated based on a Product Discount being applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDiscountSetMessagePayloadImpl
        implements StandalonePriceDiscountSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @JsonCreator
    StandalonePriceDiscountSetMessagePayloadImpl(
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        this.type = STANDALONE_PRICE_DISCOUNT_SET;
    }

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

        return new EqualsBuilder().append(type, that.type).append(discounted, that.discounted).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(discounted).toHashCode();
    }

}
