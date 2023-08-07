
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

/**
 * ProductDiscountSetValidFromAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromActionImpl implements ProductDiscountSetValidFromAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validFrom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountSetValidFromActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        this.action = SET_VALID_FROM;
    }

    /**
     * create empty instance
     */
    public ProductDiscountSetValidFromActionImpl() {
        this.action = SET_VALID_FROM;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountSetValidFromActionImpl that = (ProductDiscountSetValidFromActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(action, that.action)
                .append(validFrom, that.validFrom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validFrom).toHashCode();
    }

}
