
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
 * ProductSearchFilterExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFilterExpressionImpl implements ProductSearchFilterExpression, ModelBase {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> filter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFilterExpressionImpl(
            @JsonProperty("filter") final java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> filter) {
        this.filter = filter;
    }

    /**
     * create empty instance
     */
    public ProductSearchFilterExpressionImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> getFilter() {
        return this.filter;
    }

    public void setFilter(final com.commercetools.api.models.product_search.ProductSearchQueryExpression... filter) {
        this.filter = new ArrayList<>(Arrays.asList(filter));
    }

    public void setFilter(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFilterExpressionImpl that = (ProductSearchFilterExpressionImpl) o;

        return new EqualsBuilder().append(filter, that.filter).append(filter, that.filter).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(filter).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("filter", filter).build();
    }

}
