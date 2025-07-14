
package com.commercetools.api.models.product_search;

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
 *  <p>Result of a stats facet. The data type of <code>min</code> <code>max</code>, <code>mean</code>, and <code>sum</code> matches the data type of the <code>field</code> in the facet expression.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultStatsImpl implements ProductSearchFacetResultStats, ModelBase {

    private String name;

    private java.lang.Object min;

    private java.lang.Object max;

    private java.lang.Object mean;

    private java.lang.Object sum;

    private Long count;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetResultStatsImpl(@JsonProperty("name") final String name,
            @JsonProperty("min") final java.lang.Object min, @JsonProperty("max") final java.lang.Object max,
            @JsonProperty("mean") final java.lang.Object mean, @JsonProperty("sum") final java.lang.Object sum,
            @JsonProperty("count") final Long count) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.mean = mean;
        this.sum = sum;
        this.count = count;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetResultStatsImpl() {
    }

    /**
     *  <p>Name of the facet.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The minimum value of the field, scoped to the faceted results.</p>
     */

    public java.lang.Object getMin() {
        return this.min;
    }

    /**
     *  <p>The maximum value of the field, scoped to the faceted results.</p>
     */

    public java.lang.Object getMax() {
        return this.max;
    }

    /**
     *  <p>The average value of the field calculated as <code>sum</code> / <code>count</code>.</p>
     *  <p>Only returned for number fields.</p>
     */

    public java.lang.Object getMean() {
        return this.mean;
    }

    /**
     *  <p>The sum of values of the field that match the facet expression.</p>
     *  <p>Only returned for number fields.</p>
     */

    public java.lang.Object getSum() {
        return this.sum;
    }

    /**
     *  <p>The total number of values counted that match the facet expression.</p>
     */

    public Long getCount() {
        return this.count;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setMin(final java.lang.Object min) {
        this.min = min;
    }

    public void setMax(final java.lang.Object max) {
        this.max = max;
    }

    public void setMean(final java.lang.Object mean) {
        this.mean = mean;
    }

    public void setSum(final java.lang.Object sum) {
        this.sum = sum;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetResultStatsImpl that = (ProductSearchFacetResultStatsImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(min, that.min)
                .append(max, that.max)
                .append(mean, that.mean)
                .append(sum, that.sum)
                .append(count, that.count)
                .append(name, that.name)
                .append(min, that.min)
                .append(max, that.max)
                .append(mean, that.mean)
                .append(sum, that.sum)
                .append(count, that.count)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(min)
                .append(max)
                .append(mean)
                .append(sum)
                .append(count)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("min", min)
                .append("max", max)
                .append("mean", mean)
                .append("sum", sum)
                .append("count", count)
                .build();
    }

    @Override
    public ProductSearchFacetResultStats copyDeep() {
        return ProductSearchFacetResultStats.deepCopy(this);
    }
}
