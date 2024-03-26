
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
 * ProductSearchFacetDistinctExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctExpressionImpl implements ProductSearchFacetDistinctExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue distinct;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetDistinctExpressionImpl(
            @JsonProperty("distinct") final com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue distinct) {
        this.distinct = distinct;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetDistinctExpressionImpl() {
    }

    /**
     *  <p>Definition of the distinct facet.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue getDistinct() {
        return this.distinct;
    }

    public void setDistinct(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetDistinctExpressionImpl that = (ProductSearchFacetDistinctExpressionImpl) o;

        return new EqualsBuilder().append(distinct, that.distinct).append(distinct, that.distinct).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(distinct).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("distinct", distinct).build();
    }

}
