
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
 * ProductSearchFacetResultBucketEntry
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBucketEntryImpl implements ProductSearchFacetResultBucketEntry, ModelBase {

    private String key;

    private Integer count;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetResultBucketEntryImpl(@JsonProperty("key") final String key,
            @JsonProperty("count") final Integer count) {
        this.key = key;
        this.count = count;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetResultBucketEntryImpl() {
    }

    /**
     *  <p>Key of the bucket.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of values in the bucket.</p>
     */

    public Integer getCount() {
        return this.count;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetResultBucketEntryImpl that = (ProductSearchFacetResultBucketEntryImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(count, that.count)
                .append(key, that.key)
                .append(count, that.count)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(count).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("count", count)
                .build();
    }

}
