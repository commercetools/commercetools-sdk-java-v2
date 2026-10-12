
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Share of the Order total that a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> covers.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AllocationImpl implements Allocation, ModelBase {

    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AllocationImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }

    /**
     * create empty instance
     */
    public AllocationImpl() {
    }

    /**
     *  <p>Type of the Allocation.</p>
     */

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AllocationImpl that = (AllocationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public Allocation copyDeep() {
        return Allocation.deepCopy(this);
    }
}
