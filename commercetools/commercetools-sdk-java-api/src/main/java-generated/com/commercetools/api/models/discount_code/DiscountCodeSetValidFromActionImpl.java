
package com.commercetools.api.models.discount_code;

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
public class DiscountCodeSetValidFromActionImpl implements DiscountCodeSetValidFromAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validFrom;

    @JsonCreator
    DiscountCodeSetValidFromActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        this.action = SET_VALID_FROM;
    }

    public DiscountCodeSetValidFromActionImpl() {
        this.action = SET_VALID_FROM;
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

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetValidFromActionImpl that = (DiscountCodeSetValidFromActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(validFrom, that.validFrom).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validFrom).toHashCode();
    }

}
