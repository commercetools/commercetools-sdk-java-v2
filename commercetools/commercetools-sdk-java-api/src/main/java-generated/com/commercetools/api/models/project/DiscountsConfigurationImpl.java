
package com.commercetools.api.models.project;

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
 *  <p>Holds the configuration for behavior of Product and Cart Discounts.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountsConfigurationImpl implements DiscountsConfiguration, ModelBase {

    private com.commercetools.api.models.project.DiscountCombinationMode discountCombinationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountsConfigurationImpl(
            @JsonProperty("discountCombinationMode") final com.commercetools.api.models.project.DiscountCombinationMode discountCombinationMode) {
        this.discountCombinationMode = discountCombinationMode;
    }

    /**
     * create empty instance
     */
    public DiscountsConfigurationImpl() {
    }

    /**
     *  <p>Indicates how Product Discounts and Cart Discounts should be combined. Default value is <code>Stacking</code>.</p>
     */

    public com.commercetools.api.models.project.DiscountCombinationMode getDiscountCombinationMode() {
        return this.discountCombinationMode;
    }

    public void setDiscountCombinationMode(
            final com.commercetools.api.models.project.DiscountCombinationMode discountCombinationMode) {
        this.discountCombinationMode = discountCombinationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountsConfigurationImpl that = (DiscountsConfigurationImpl) o;

        return new EqualsBuilder().append(discountCombinationMode, that.discountCombinationMode)
                .append(discountCombinationMode, that.discountCombinationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountCombinationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("discountCombinationMode", discountCombinationMode)
                .build();
    }

    @Override
    public DiscountsConfiguration copyDeep() {
        return DiscountsConfiguration.deepCopy(this);
    }
}
