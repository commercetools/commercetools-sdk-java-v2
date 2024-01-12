
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
 * ProductSearchFacetBucketResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetBucketResultImpl implements ProductSearchFacetBucketResult, ModelBase {

    private String name;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> buckets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetBucketResultImpl(@JsonProperty("name") final String name,
            @JsonProperty("buckets") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> buckets) {
        this.name = name;
        this.buckets = buckets;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetBucketResultImpl() {
    }

    /**
     *  <p>Name of the facet.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Contains results of the facet.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> getBuckets() {
        return this.buckets;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setBuckets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultBucket... buckets) {
        this.buckets = new ArrayList<>(Arrays.asList(buckets));
    }

    public void setBuckets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetBucketResultImpl that = (ProductSearchFacetBucketResultImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(buckets, that.buckets)
                .append(name, that.name)
                .append(buckets, that.buckets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(buckets).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("buckets", buckets)
                .build();
    }

}
