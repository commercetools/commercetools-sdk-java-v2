
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
 * ProductSearchFacetDistinctBucketSortExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctBucketSortExpressionImpl
        implements ProductSearchFacetDistinctBucketSortExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy by;

    private com.commercetools.api.models.search.SearchSortOrder order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetDistinctBucketSortExpressionImpl(
            @JsonProperty("by") final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy by,
            @JsonProperty("order") final com.commercetools.api.models.search.SearchSortOrder order) {
        this.by = by;
        this.order = order;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetDistinctBucketSortExpressionImpl() {
    }

    /**
     *  <p>Defines whether to sort by bucket count or key.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy getBy() {
        return this.by;
    }

    /**
     *  <p>Defines the sorting order.</p>
     */

    public com.commercetools.api.models.search.SearchSortOrder getOrder() {
        return this.order;
    }

    public void setBy(final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy by) {
        this.by = by;
    }

    public void setOrder(final com.commercetools.api.models.search.SearchSortOrder order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetDistinctBucketSortExpressionImpl that = (ProductSearchFacetDistinctBucketSortExpressionImpl) o;

        return new EqualsBuilder().append(by, that.by)
                .append(order, that.order)
                .append(by, that.by)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(by).append(order).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("by", by)
                .append("order", order)
                .build();
    }

    @Override
    public ProductSearchFacetDistinctBucketSortExpression copyDeep() {
        return ProductSearchFacetDistinctBucketSortExpression.deepCopy(this);
    }
}
