
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartDiscountSetValidFromAndUntilActionImpl implements CartDiscountSetValidFromAndUntilAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    CartDiscountSetValidFromAndUntilActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    public CartDiscountSetValidFromAndUntilActionImpl() {
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
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

        CartDiscountSetValidFromAndUntilActionImpl that = (CartDiscountSetValidFromAndUntilActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validFrom).append(validUntil).toHashCode();
    }

}
