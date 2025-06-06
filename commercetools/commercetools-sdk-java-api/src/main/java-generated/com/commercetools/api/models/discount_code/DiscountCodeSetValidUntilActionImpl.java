
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * DiscountCodeSetValidUntilAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetValidUntilActionImpl implements DiscountCodeSetValidUntilAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeSetValidUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        this.action = SET_VALID_UNTIL;
    }

    /**
     * create empty instance
     */
    public DiscountCodeSetValidUntilActionImpl() {
        this.action = SET_VALID_UNTIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
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

        DiscountCodeSetValidUntilActionImpl that = (DiscountCodeSetValidUntilActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(validUntil, that.validUntil)
                .append(action, that.action)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validUntil).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("validUntil", validUntil)
                .build();
    }

    @Override
    public DiscountCodeSetValidUntilAction copyDeep() {
        return DiscountCodeSetValidUntilAction.deepCopy(this);
    }
}
