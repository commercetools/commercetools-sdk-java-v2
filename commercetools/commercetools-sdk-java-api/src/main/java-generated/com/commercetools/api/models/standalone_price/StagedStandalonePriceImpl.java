
package com.commercetools.api.models.standalone_price;

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
 *  <p>Staged changes on a Standalone Price. To update the <code>value</code> property of a Staged Standalone Price, use the Change Value update action. To apply all staged changes to the Standalone Price, use the Apply Staged Changes update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedStandalonePriceImpl implements StagedStandalonePrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedStandalonePriceImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.value = value;
        this.discounted = discounted;
    }

    /**
     * create empty instance
     */
    public StagedStandalonePriceImpl() {
    }

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     */

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
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

        StagedStandalonePriceImpl that = (StagedStandalonePriceImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(discounted, that.discounted)
                .append(value, that.value)
                .append(discounted, that.discounted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(discounted).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("discounted", discounted)
                .build();
    }

    @Override
    public StagedStandalonePrice copyDeep() {
        return StagedStandalonePrice.deepCopy(this);
    }
}
