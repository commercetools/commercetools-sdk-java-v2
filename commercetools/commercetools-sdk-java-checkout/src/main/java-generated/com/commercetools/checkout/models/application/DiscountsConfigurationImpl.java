
package com.commercetools.checkout.models.application;

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
 * DiscountsConfiguration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountsConfigurationImpl implements DiscountsConfiguration, ModelBase {

    private Boolean allowDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountsConfigurationImpl(@JsonProperty("allowDiscounts") final Boolean allowDiscounts) {
        this.allowDiscounts = allowDiscounts;
    }

    /**
     * create empty instance
     */
    public DiscountsConfigurationImpl() {
    }

    /**
     *  <p>Indicates if the buyer is able to apply discounts to the cart. It is only applicable if the <code>mode = CompleteFlow</code>.</p>
     */

    public Boolean getAllowDiscounts() {
        return this.allowDiscounts;
    }

    public void setAllowDiscounts(final Boolean allowDiscounts) {
        this.allowDiscounts = allowDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountsConfigurationImpl that = (DiscountsConfigurationImpl) o;

        return new EqualsBuilder().append(allowDiscounts, that.allowDiscounts)
                .append(allowDiscounts, that.allowDiscounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(allowDiscounts).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("allowDiscounts", allowDiscounts)
                .build();
    }

    @Override
    public DiscountsConfiguration copyDeep() {
        return DiscountsConfiguration.deepCopy(this);
    }
}
