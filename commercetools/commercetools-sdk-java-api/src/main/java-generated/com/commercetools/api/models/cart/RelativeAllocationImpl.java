
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
 *  <p>Allocates a percentage of the Order total to a Payment Method.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RelativeAllocationImpl implements RelativeAllocation, ModelBase {

    private String type;

    private Integer percentage;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RelativeAllocationImpl(@JsonProperty("percentage") final Integer percentage) {
        this.percentage = percentage;
        this.type = RELATIVE;
    }

    /**
     * create empty instance
     */
    public RelativeAllocationImpl() {
        this.type = RELATIVE;
    }

    /**
     *  <p>Type of the Allocation.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     */

    public Integer getPercentage() {
        return this.percentage;
    }

    public void setPercentage(final Integer percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RelativeAllocationImpl that = (RelativeAllocationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(percentage, that.percentage)
                .append(type, that.type)
                .append(percentage, that.percentage)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(percentage).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("percentage", percentage)
                .build();
    }

    @Override
    public RelativeAllocation copyDeep() {
        return RelativeAllocation.deepCopy(this);
    }
}
