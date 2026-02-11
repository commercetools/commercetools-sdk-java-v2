
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
 *  <p>Updating the <code>validUntil</code> value generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceValidUntilSetMessage" rel="nofollow">StandalonePriceValidUntilSet</a> Message.</p>
 *  <p>As the validity dates are part of the price scope and are not allowed to overlap, this update might return the <a href="https://docs.commercetools.com/apis/ctp:api:type:DuplicateStandalonePriceScopeError" rel="nofollow">DuplicateStandalonePriceScope</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:OverlappingStandalonePriceValidityError" rel="nofollow">OverlappingStandalonePriceValidity</a> errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 *  <p>If a modification is already in progress for the exact combination of SKU and price scope fields, an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExactLockConflictError" rel="nofollow">ExactLockConflict</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:ValidityLockConflictError" rel="nofollow">ValidityLockConflict</a> error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidUntilActionImpl implements StandalonePriceSetValidUntilAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceSetValidUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        this.action = SET_VALID_UNTIL;
    }

    /**
     * create empty instance
     */
    public StandalonePriceSetValidUntilActionImpl() {
        this.action = SET_VALID_UNTIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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

        StandalonePriceSetValidUntilActionImpl that = (StandalonePriceSetValidUntilActionImpl) o;

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
    public StandalonePriceSetValidUntilAction copyDeep() {
        return StandalonePriceSetValidUntilAction.deepCopy(this);
    }
}
