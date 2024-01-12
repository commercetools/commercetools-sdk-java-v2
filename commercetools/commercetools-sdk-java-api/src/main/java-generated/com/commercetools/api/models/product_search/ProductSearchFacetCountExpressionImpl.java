
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
 * ProductSearchFacetCountExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetCountExpressionImpl implements ProductSearchFacetCountExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFacetCountValue count;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetCountExpressionImpl(
            @JsonProperty("count") final com.commercetools.api.models.product_search.ProductSearchFacetCountValue count) {
        this.count = count;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetCountExpressionImpl() {
    }

    /**
     *  <p>Definition of the count facet.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetCountValue getCount() {
        return this.count;
    }

    public void setCount(final com.commercetools.api.models.product_search.ProductSearchFacetCountValue count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetCountExpressionImpl that = (ProductSearchFacetCountExpressionImpl) o;

        return new EqualsBuilder().append(count, that.count).append(count, that.count).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(count).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("count", count).build();
    }

}
