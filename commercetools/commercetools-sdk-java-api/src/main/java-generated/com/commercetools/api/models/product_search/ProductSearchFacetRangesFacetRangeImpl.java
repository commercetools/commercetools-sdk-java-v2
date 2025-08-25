
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
 *  <p>Values for <code>from</code> and <code>to</code> must be a number or <a href="https://docs.commercetools.com/apis/ctp:api:type:DateTime" rel="nofollow">DateTime</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesFacetRangeImpl implements ProductSearchFacetRangesFacetRange, ModelBase {

    private java.lang.Object from;

    private java.lang.Object to;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetRangesFacetRangeImpl(@JsonProperty("from") final java.lang.Object from,
            @JsonProperty("to") final java.lang.Object to, @JsonProperty("key") final String key) {
        this.from = from;
        this.to = to;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetRangesFacetRangeImpl() {
    }

    /**
     *  <p>Starting value of the bucket (inclusive).</p>
     */

    public java.lang.Object getFrom() {
        return this.from;
    }

    /**
     *  <p>Ending value of the bucket (non-inclusive).</p>
     */

    public java.lang.Object getTo() {
        return this.to;
    }

    /**
     *  <p>Key to assign the bucket.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setFrom(final java.lang.Object from) {
        this.from = from;
    }

    public void setTo(final java.lang.Object to) {
        this.to = to;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetRangesFacetRangeImpl that = (ProductSearchFacetRangesFacetRangeImpl) o;

        return new EqualsBuilder().append(from, that.from)
                .append(to, that.to)
                .append(key, that.key)
                .append(from, that.from)
                .append(to, that.to)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(from).append(to).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("from", from)
                .append("to", to)
                .append("key", key)
                .build();
    }

    @Override
    public ProductSearchFacetRangesFacetRange copyDeep() {
        return ProductSearchFacetRangesFacetRange.deepCopy(this);
    }
}
