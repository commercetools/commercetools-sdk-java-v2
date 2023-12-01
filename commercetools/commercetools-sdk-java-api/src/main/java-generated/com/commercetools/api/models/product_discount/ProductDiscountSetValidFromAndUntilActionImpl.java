
package com.commercetools.api.models.product_discount;

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
 * ProductDiscountSetValidFromAndUntilAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromAndUntilActionImpl
        implements ProductDiscountSetValidFromAndUntilAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountSetValidFromAndUntilActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    /**
     * create empty instance
     */
    public ProductDiscountSetValidFromAndUntilActionImpl() {
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountSetValidFromAndUntilActionImpl that = (ProductDiscountSetValidFromAndUntilActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validFrom).append(validUntil).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .build();
    }

}
