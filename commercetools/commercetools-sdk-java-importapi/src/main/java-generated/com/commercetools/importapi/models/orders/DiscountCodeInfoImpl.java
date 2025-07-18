
package com.commercetools.importapi.models.orders;

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
 * DiscountCodeInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeInfoImpl implements DiscountCodeInfo, ModelBase {

    private com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode;

    private com.commercetools.importapi.models.orders.DiscountCodeState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeInfoImpl(
            @JsonProperty("discountCode") final com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode,
            @JsonProperty("state") final com.commercetools.importapi.models.orders.DiscountCodeState state) {
        this.discountCode = discountCode;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public DiscountCodeInfoImpl() {
    }

    /**
     *  <p>References a DiscountCode by key. If the referenced DiscountCode does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced DiscountCode is created.</p>
     */

    public com.commercetools.importapi.models.common.DiscountCodeKeyReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     */

    public com.commercetools.importapi.models.orders.DiscountCodeState getState() {
        return this.state;
    }

    public void setDiscountCode(final com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode) {
        this.discountCode = discountCode;
    }

    public void setState(final com.commercetools.importapi.models.orders.DiscountCodeState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeInfoImpl that = (DiscountCodeInfoImpl) o;

        return new EqualsBuilder().append(discountCode, that.discountCode)
                .append(state, that.state)
                .append(discountCode, that.discountCode)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountCode).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("discountCode", discountCode)
                .append("state", state)
                .build();
    }

    @Override
    public DiscountCodeInfo copyDeep() {
        return DiscountCodeInfo.deepCopy(this);
    }
}
