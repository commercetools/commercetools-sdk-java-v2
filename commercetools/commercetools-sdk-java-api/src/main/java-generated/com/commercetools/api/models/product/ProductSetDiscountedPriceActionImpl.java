
package com.commercetools.api.models.product;

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
 *  <p>Produces the ProductPriceExternalDiscountSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetDiscountedPriceActionImpl implements ProductSetDiscountedPriceAction, ModelBase {

    private String action;

    private String priceId;

    private Boolean staged;

    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    @JsonCreator
    ProductSetDiscountedPriceActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.priceId = priceId;
        this.staged = staged;
        this.discounted = discounted;
        this.action = SET_DISCOUNTED_PRICE;
    }

    public ProductSetDiscountedPriceActionImpl() {
        this.action = SET_DISCOUNTED_PRICE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to set the Discount.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     */

    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetDiscountedPriceActionImpl that = (ProductSetDiscountedPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(discounted, that.discounted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(priceId)
                .append(staged)
                .append(discounted)
                .toHashCode();
    }

}
