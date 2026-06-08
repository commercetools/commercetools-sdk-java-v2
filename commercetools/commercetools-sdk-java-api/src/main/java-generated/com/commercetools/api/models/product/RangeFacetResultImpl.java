
package com.commercetools.api.models.product;

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
 * RangeFacetResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RangeFacetResultImpl implements RangeFacetResult, ModelBase {

    private com.commercetools.api.models.product.FacetTypes type;

    private java.util.List<com.commercetools.api.models.product.FacetRange> ranges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RangeFacetResultImpl(
            @JsonProperty("ranges") final java.util.List<com.commercetools.api.models.product.FacetRange> ranges) {
        this.ranges = ranges;
        this.type = FacetTypes.findEnum("range");
    }

    /**
     * create empty instance
     */
    public RangeFacetResultImpl() {
        this.type = FacetTypes.findEnum("range");
    }

    /**
     *
     */

    public com.commercetools.api.models.product.FacetTypes getType() {
        return this.type;
    }

    /**
     *  <p>Statistical data over values for <code>date</code>, <code>time</code>, <code>datetime</code>, <code>number</code>, and <code>money</code> type fields.</p>
     */

    public java.util.List<com.commercetools.api.models.product.FacetRange> getRanges() {
        return this.ranges;
    }

    public void setRanges(final com.commercetools.api.models.product.FacetRange... ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
    }

    public void setRanges(final java.util.List<com.commercetools.api.models.product.FacetRange> ranges) {
        this.ranges = ranges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RangeFacetResultImpl that = (RangeFacetResultImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(ranges, that.ranges)
                .append(type, that.type)
                .append(ranges, that.ranges)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(ranges).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("ranges", ranges)
                .build();
    }

    @Override
    public RangeFacetResult copyDeep() {
        return RangeFacetResult.deepCopy(this);
    }
}
