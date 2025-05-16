
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CountOnCustomLineItemUnits
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CountOnCustomLineItemUnitsImpl implements CountOnCustomLineItemUnits, ModelBase {

    private String type;

    private String predicate;

    private Integer minCount;

    private Integer maxCount;

    @Deprecated
    private Integer excludeCount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CountOnCustomLineItemUnitsImpl(@JsonProperty("predicate") final String predicate,
            @JsonProperty("minCount") final Integer minCount, @JsonProperty("maxCount") final Integer maxCount,
            @JsonProperty("excludeCount") final Integer excludeCount) {
        this.predicate = predicate;
        this.minCount = minCount;
        this.maxCount = maxCount;
        this.excludeCount = excludeCount;
        this.type = COUNT_ON_CUSTOM_LINE_ITEM_UNITS;
    }

    /**
     * create empty instance
     */
    public CountOnCustomLineItemUnitsImpl() {
        this.type = COUNT_ON_CUSTOM_LINE_ITEM_UNITS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Valid CustomLineItem predicate that determines the units participating in the Discount.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Minimum number of units of a Custom Line Item that match the predicate.</p>
     */

    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     *  <p>Maximum number of units of a Custom Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     */

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     *  <p>Number of units of a Custom Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     */
    @Deprecated
    public Integer getExcludeCount() {
        return this.excludeCount;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setMinCount(final Integer minCount) {
        this.minCount = minCount;
    }

    public void setMaxCount(final Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Deprecated
    public void setExcludeCount(final Integer excludeCount) {
        this.excludeCount = excludeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CountOnCustomLineItemUnitsImpl that = (CountOnCustomLineItemUnitsImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(minCount, that.minCount)
                .append(maxCount, that.maxCount)
                .append(excludeCount, that.excludeCount)
                .append(type, that.type)
                .append(predicate, that.predicate)
                .append(minCount, that.minCount)
                .append(maxCount, that.maxCount)
                .append(excludeCount, that.excludeCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(predicate)
                .append(minCount)
                .append(maxCount)
                .append(excludeCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("predicate", predicate)
                .append("minCount", minCount)
                .append("maxCount", maxCount)
                .append("excludeCount", excludeCount)
                .build();
    }

    @Override
    public CountOnCustomLineItemUnits copyDeep() {
        return CountOnCustomLineItemUnits.deepCopy(this);
    }
}
