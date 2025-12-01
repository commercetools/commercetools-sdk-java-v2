
package com.commercetools.checkout.models.payment_integration;

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
 * SortingInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SortingInfoImpl implements SortingInfo, ModelBase {

    private Integer priority;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SortingInfoImpl(@JsonProperty("priority") final Integer priority) {
        this.priority = priority;
    }

    /**
     * create empty instance
     */
    public SortingInfoImpl() {
    }

    /**
     *  <p>Sorting priority of the Payment Integration.</p>
     */

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(final Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SortingInfoImpl that = (SortingInfoImpl) o;

        return new EqualsBuilder().append(priority, that.priority).append(priority, that.priority).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(priority).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("priority", priority).build();
    }

    @Override
    public SortingInfo copyDeep() {
        return SortingInfo.deepCopy(this);
    }
}
